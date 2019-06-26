const req = new XMLHttpRequest();
req.onload = function() {
    const data = JSON.parse(req.responseText);
    console.log("y", data);
    createPage(data);
}
req.open('GET', 'https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/example.json');
req.send();

function createPage(data) {
    // const body = document.getElementById("body");

    // const elH = document.createElement("div");

    const elH = document.getElementById('squadName');
    elH.innerText = data.squadName;
    // const newH = document.createElement("h1");
    // newH.innerText = data.squadName;
    // body.append(elH);
    // elH.append(newH);
    const membersDiv = document.getElementById("members");

    const rowDiv = document.createElement("div");
    rowDiv.setAttribute('class', 'row');
    membersDiv.append(rowDiv);
    
    for (let memberIndex in data.members){
        const member = data.members[memberIndex];        

        const colDiv = document.createElement("div");
        colDiv.setAttribute('class', 'col-sm');
        rowDiv.append(colDiv);

        const cardDiv = document.createElement("div");
        cardDiv.setAttribute('class', 'card');
        cardDiv.setAttribute('style', 'width: 18rem;');
        colDiv.append(cardDiv);

        const memberImg = document.createElement("img");
        memberImg.setAttribute('class', 'card-img-top');
        memberImg.setAttribute('src', member.name + '.png');
        memberImg.setAttribute('alt', 'Card image cap');
        cardDiv.append(memberImg);

        const memberDiv = document.createElement("div");
        memberDiv.setAttribute('class', 'card-body');
        cardDiv.append(memberDiv);

        const memberH2 = document.createElement("h2");
        memberH2.setAttribute('class', 'card-title'); 
        memberDiv.append(memberH2);
        memberH2.innerText = member.name;

        const listUl = document.createElement("ul");
        listUl.setAttribute('class', 'list-group list-group-flush');
        cardDiv.append(listUl);
        
        for (let infoKey in member) {
            if (infoKey != "name"){
                const memberLi = document.createElement("li");
                memberLi.setAttribute('class', 'list-group-item');
                listUl.append(memberLi);
                let result = infoKey.replace( /([A-Z])/g, " $1" );
                let infoStr = result.charAt(0).toUpperCase() + result.slice(1);     
                memberLi.innerText =  infoStr + ": " + member[infoKey];                
            }            
        }

        const b = document.createElement("button");
        b.innerText = 'button';
        b.addEventListener('click', )

    }    
}