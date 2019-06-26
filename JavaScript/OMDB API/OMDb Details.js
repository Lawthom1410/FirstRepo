const id = sessionStorage.getItem('id');

function filmDetails() {
    const req = new XMLHttpRequest();
    req.onload = () => {
        const data = JSON.parse(req.responseText);
        createPage(data);
    }
    const url = 'http://www.omdbapi.com/?i=' + id + '&apikey=a277ca6a';
    console.log(url);
    req.open('GET', url);
    req.send();
}

function createPage({ Title, Ratings, Response, Poster, ...theRest }) {
    const detailDiv = document.getElementById("details");
    const ratingsDiv = document.getElementById("ratings");
    const posterDiv = document.getElementById("poster");
    const titleEl = document.getElementById("filmTitle");
    const returnButtonEl = document.getElementById("returnButton");
        
    titleEl.innerText = Title;
    returnButtonEl.setAttribute('class', 'btn btn-dark');

    for (let k in theRest) {
        const detailEl = document.createElement("p");
        detailEl.setAttribute('class', 'detail');
        detailDiv.append(detailEl);

        detailEl.innerText = k + ": " + theRest[k];
    }

    for (let k in Ratings) {
        const { Source, Value } = Ratings[k];

        const ratingsEl = document.createElement("p");
        ratingsEl.setAttribute('class', 'ratings');
        ratingsDiv.append(ratingsEl);

        ratingsEl.innerText = Source + ': ' + Value;
    }

    const posterEl = document.createElement("img");
    posterEl.setAttribute('class', 'poster');
    posterEl.setAttribute('src', Poster);
    posterDiv.append(posterEl);

    posterEl.innerText = Poster;
}

function returnHome() {
    window.location = 'OMDb.html';
}

filmDetails();

