function handleLogin(data) {
    const username = data.elements['username'].value;
    const password = data.elements['password'].value;

    makeRequest('GET', 'https://us-central1-qac-sandbox.cloudfunctions.net/login?username=' + username + '&password=' + password)
    .then((val) => {
        console.log(val);
        userPage(username, val);
    })
    .catch(() => {
        console.log("failed");
        const loginFail = document.getElementById("loginFail");
        loginFail.innerText = "Login failed.";
    });    

    return false;
}

function registerPage() {
    window.location = "Register.html";
}

function userPage(username, val) {
    sessionStorage.setItem("username", username);
    sessionStorage.setItem("userData", JSON.stringify(val));

    window.location = "User.html";
}