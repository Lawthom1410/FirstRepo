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

    console.log(userData);

    window.location = "RegisterSuccess.html";
    //form.reset();
    return false;
}