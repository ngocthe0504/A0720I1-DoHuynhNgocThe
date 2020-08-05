function caculation(operator) {
    let num1 = document.getElementById("num1");
    let num2 = document.getElementById("num2");
    let result = 0;
    switch (operator) {
        case "+": {
            result = parseFloat(num1.value) + parseFloat(num2.value);
            break;
        }
        case "-": {
            result = parseFloat(num1.value) - parseFloat(num2.value);
            break;
        }
        case "*": {
            result = parseFloat(num1.value) * parseFloat(num2.value);
            break;
        }
        case "/": {
            result = parseFloat(num1.value) / parseFloat(num2.value);
            break;
        }
    }
    alert(result);
    console.log(result);
}