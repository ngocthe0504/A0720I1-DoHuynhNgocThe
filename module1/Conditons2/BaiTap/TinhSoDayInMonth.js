function a() {
    let month = document.getElementById("month");
    let string = "";
    month = month.value;
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            // string = string + "tháng" + month + "có 31 ngày";
            alert("tháng" + month + "có 31 ngày");
            break;
        case 2:
            // string = string + "tháng" + month + "có 28 hoặc 29 ngày";
            alert("tháng" + month + "có 28 hoặc 29 ngày");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            // string = string + "tháng" + month + "có 30 ngày";
            alert("tháng" + month + "có 30 ngày");
            break;
    }
// document.getElementById("space").innerText = string;
//     alert(string);

    console.log(month);
}