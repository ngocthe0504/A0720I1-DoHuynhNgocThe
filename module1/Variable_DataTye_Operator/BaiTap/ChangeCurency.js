function convert() {
    let result = 0;
    let money = document.getElementById("Amount");
    if (isNaN(money.value) || money.value < 0) {
        result = "Số tiền bạn nhập không hợp lệ. Mời bạn nhập lại";
    } else {
        let from = document.getElementById("from");
        let to = document.getElementById("to");
        if (from.value === "USA" && to.value === "VND") {
            result = money.value * 23000 + " VND";
        } else if (from.value === "VND" && to.value === "USA") {
            result = money.value / 23000 + " $";
        } else {
            result = "Mời bạn nhập lại"
        }
    }
    alert(result);
    console.log(result);
}