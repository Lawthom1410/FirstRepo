function add(num1, num2) {
    const result = num1 + num2;
    return result;
}

function subtract(num1, num2) {
    const result = num1 - num2;
    return result;
}

function divide(num1, num2) {
    const result = num1 / num2;
    return result;
}

function multiply(num1, num2) {
    const result = num1 * num2;    
    return result;
}

function calculate(calculation) {
    const num1 = parseInt(document.getElementById("num1").value);
    const num2 = parseInt(document.getElementById("num2").value);

    result = calculation(num1, num2);
    document.getElementById("result").innerText = result;

    //History
    const histElem = document.getElementById("history");
    const newSpan = document.createElement('span');
    newSpan.style.cssText = "border: 5px solid white";
    newSpan.innerText = result;
    histElem.prepend(newSpan);
}

function clearThings() {
    document.getElementById("history").innerText = "";
    document.getElementById("result").innerText = "Congratulations, you comleted calculator.";
    document.getElementById("num1").value = "";
    document.getElementById("num2").value = "";
}