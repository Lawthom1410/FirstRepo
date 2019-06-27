const userData = {};

function handleSubmit(form) {
    console.log("I submit");
    
    for (let element of form.elements) {
        if(element.id){
            userData[element.id] = element.value;
            // sessionStorage.setItem(element.id,element.value);
        }
    }
    sessionStorage.setItem('userData', JSON.stringify(userData));

    makeRequest('POST', 'https://us-central1-qac-sandbox.cloudfunctions.net/setUser', JSON.stringify(userData)).then(() => {
        loginPage()});

    console.log(userData);

    // loginPage()
    //form.reset();
    return false;
}

function loginPage() {
    window.location = "Login.html";
}