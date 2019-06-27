function createPage(data) {

    const searchBar = document.getElementById('searchBar');
    const starterTemp = document.getElementById('starter-temp');
    
    const searchInput = document.createElement("input");
    searchInput.setAttribute('id', 'searchBar');
    searchInput.setAttribute('type', 'text');
    searchInput.setAttribute('class', 'form-control mr-sm-2');
    searchBar.append(searchInput);

    const searchButton = document.createElement("button");
    searchButton.setAttribute('id', 'search');
    searchButton.setAttribute('class', 'btn btn-outline-light my-2 my-sm-0');
    searchBar.append(searchButton);
    searchButton.innerText = 'Search';    

    const greetingP = document.createElement("p");
    greetingP.setAttribute('class', 'lead');
    greetingP.setAttribute('id','greetingP');
    starterTemp.append(greetingP);
    greetingP.innerHTML = 'This website will search your favourite movies.<br> This paragraph will dissapear when a movie is searched.';

}

createPage();

function handleSearch(searchInput){
    document.getElementById("filmList").innerText = '';

    searchStr = searchInput.elements[0].value;

    const req = new XMLHttpRequest();
    req.onload = () => {
        const data = JSON.parse(req.responseText);
        outputList(data);
    }
    req.open('GET', 'http://www.omdbapi.com/?s=' + searchStr + '&apikey=a277ca6a');
    req.send();

    searchInput.reset();
    return false;
}

function outputList({Search}) {
    const filmList = document.getElementById("filmList");
    const greetingP= document.getElementById("greetingP");

    greetingP.innerText = '';

    // console.log(Search[0].Title + " (" + Search[0].Year +")");
    
    const listDiv = document.createElement("div");
    listDiv.setAttribute('class','listDiv');
    filmList.append(listDiv);

    for (let i in Search) {
        const {Title, Year, imdbID} = Search[i];
        filmStr = Title + " (" + Year +")"
        console.log(Search[i]);

        const listEl = document.createElement("p");
        listEl.setAttribute('class', 'listElement');
        listEl.addEventListener('click', () => newPage(imdbID));
        listDiv.append(listEl);

        listEl.innerHTML = filmStr;
    }

    if (Search) {}
    else {
        const listEl = document.createElement("p");
        listEl.setAttribute('class', 'listElementInvalid');
        listDiv.append(listEl);

        listEl.innerText = "No results found.";
    } 
}

function newPage(id){
    sessionStorage.setItem('id', id);
    window.location = "OMDb Details.html"
}

function returnHome() {
    window.location = 'OMDb.html';
}

