//Bài 1
function bai1() {
    for (let i = 1; i<100; i++) {
        if (i === 99) {
            alert("thông báo là đã hoàn thành.");
        }
    }
}
// bai1();
//Bài 2
function bai2() {
    let check = false;
    do {
        let temperature = prompt("Nhập nhiệt độ:");
        if (temperature > 100) {
            alert("Giảm nhiệt độ");
            continue;
        }
        if (temperature < 20) {
            alert("Tăng nhiệt độ");
            break;
        }
        check = true;
    } while (!check)
}
// bai2();
//Bài 3
function bai3() {
    let num1 = 0;
    let num2 = 1;
    let temp = 0;
    for (let i = 1; i <= 20; i++) {
        temp = num1 + num2;
        document.writeln(temp);
        num1 = num2;
        num2 = temp;
    }
}
// bai3();
//Bài 4
function bai4() {
    let num1 = 0;
    let num2 = 1;
    let temp = 0;
    let check = false;
    while (!check) {
        temp = num1 + num2;
        num1 = num2;
        num2 = temp;
        if (temp % 5 === 0) {
            alert(temp);
            check = true;
            break;
        }
    }
}
// bai4();
//Bài 5
function bai5() {
    let num1 = 0;
    let num2 = 1;
    let temp = 0;
    let total = 0;
    for (let i = 1; i <= 20; i++) {
        temp = num1 + num2;
        total += temp;
        num1 = num2;
        num2 = temp;
        total += temp;
        document.write(total);
    }
}
// bai5();
//Bài 6
function bai6() {
    let total = 0;
    let check = false;
    let count = 0;
    while (!check) {
        let a = 0;
        if (a % 7 === 0) {
            total += a;
            count++;
        }
        a++;
        if (count === 30) {
            check = true;
        }
    }
    document.write(total);
}
bai6();







