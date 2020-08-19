// Bài 1
function bai1() {
    let a = prompt("Nhập số thứ nhất: ");
    let b = prompt("Nhập số thứ 2: ");
    if (parseInt(a) % parseInt(b) === 0) {
        alert("a có chia hết cho b");
    } else {
        alert("a không chia hết cho b");
    }
}
// bai1();
//Bài 2
function bai2() {
    let yearOld = prompt("Nhập tuổi học sinh: ");
    if (parseInt(yearOld) > 14) {
        alert("HS đủ điều kiện vào lớp 10");
    } else {
        alert("HS không đủ điều kiện vào lớp 10");
    }
}
// bai2();
//Bài 3
function bai3() {
    let num = prompt("Nhập số nguyên: ");
    if (parseInt(num) > 0) {
        alert("Lớn hơn 0");
    }else {
        alert("Nhỏ hơn 0");
    }
}
// bai3();
//Bài 4
function bai4() {
    let num1 = prompt("Nhập số thứ nhất");
    let num2 = prompt("Nhập số thứ hai");
    let num3 = prompt("Nhập số thứ ba");
    if (parseInt(num1) > parseInt(num2) && parseInt(num1) > parseInt(num3)) {
        alert(num1);
    } else if (parseInt(num2) > parseInt(num1) && parseInt(num2) > parseInt(num3)) {
        alert(num2);
    } else if (parseInt(num3) > parseInt(num1) && parseInt(num3) > parseInt(num2)) {
        alert(num3);
    }
}
// bai4();
//Bài 5
function bai5() {
    let HS1a = prompt("Nhập điểm KT HS1: ");
    let HS1b = prompt("Nhập điểm GK HS1: ");
    let HS1c = prompt("Nhập điểm CK HS1: ");
    let HS2a = prompt("Nhập điểm KT HS2: ");
    let HS2b = prompt("Nhập điểm GK HS2: ");
    let HS2c = prompt("Nhập điểm CK HS2: ");
    let HS3a = prompt("Nhập điểm KT HS3: ");
    let HS3b = prompt("Nhập điểm GK HS3: ");
    let HS3c = prompt("Nhập điểm CK HS3: ");
    let HS1 = parseInt((HS1a * 2 + HS1b * 3 + HS1c * 5) / 10);
    let HS2 = parseInt((HS2a * 2 + HS2b * 3 + HS2c * 5) / 10);
    let HS3 = parseInt((HS3a * 2 + HS3b * 3 + HS3c * 5) / 10);
    if (parseInt(HS1) > parseInt(HS2) && parseInt(HS1) > parseInt(HS3)) {
        alert("HS1 đứng thứ 1");
    } else if (parseInt(HS2) > parseInt(HS1) && parseInt(HS2) > parseInt(HS3)) {
        alert("HS2 đứng thứ 1");
    } else if (parseInt(HS3) > parseInt(HS1) && parseInt(HS3) > parseInt(HS2)) {
        alert("HS3 đứng thứ 1");
    }
}
// bai5();
//Bài 6
function bai6() {
    let rose = 0;
    let sales = prompt("doanh số bán bán hàng tháng này");
    if (parseFloat(sales) >= 100000000) {
        rose = parseFloat(sales) * (10 / 100);
    } else if (parseFloat(sales) >= 50000000 && parseFloat(sales) < 100000000) {
        rose = parseFloat(sales) * (5 / 100);
    } else if (parseFloat(sales) > 50000000) {
        rose = parseFloat(sales) * (2 / 100);
    }
    alert(rose);
}
// bai6();
//bài 7
function bai7() {
    let telephone = 0;
    let total = prompt("Số giờ gọi trong tháng này");
    if (parseFloat(total) >= 100) {
        telephone = parseFloat(total) * 2000;
    } else if (parseFloat(sales) >= 50 && parseFloat(sales) < 100) {
        telephone = parseFloat(sales) * 1750;
    } else if (parseFloat(sales) > 50) {
        telephone = parseFloat(sales) * 1500;
    }
    alert(telephone);
}
//bài 7();












