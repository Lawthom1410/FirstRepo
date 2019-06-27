function getUserData() {
    // const username = sessionStorage.getItem('username');
    // const email = sessionStorage.getItem('email');
    // document.getElementById("username").innerText = "Username: " + userData.username;
    // document.getElementById("email").innerText = "Email Address: " + userData.email;

    // const userDataKeys = Object.keys(userData);
    // const userDataValues = Object.values(userData); 
    // for (let i = 0; i < userDataKeys.length; i++) {
    //     console.log(userDataValues[i]);
    //     if (userDataValues[i]) {
    //         document.getElementById(userDataKeys[i]).innerText = userDataKeys[i] + ": " + userDataValues[i];
    //     }
    // }

    const userData = JSON.parse(sessionStorage.getItem('userData'));
    const userElem = document.getElementById("userData");
    
    let dataCount = 0;
    for (let k in userData) {
        if (userData[k]) {            
            const newP = document.createElement("p");
            const propStr = k.charAt(0).toUpperCase() + k.substring(1); 
            newP.innerText = propStr + ": " + userData[k];
            userElem.append(newP);
            userElem.className = "userData"

            dataCount++;
        }
    }
    
    if(dataCount == 0) {
        document.getElementById("header").innerHTML = "Unsuccess! <br> Your Account:";
    }
}