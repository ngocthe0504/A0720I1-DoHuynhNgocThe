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
    let a = 0;
    while (!check) {
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
// bai6();
// Bài 7
function bai7() {
    for (let i = 1; i <= 100; i++) {
        // document.write(i + "<br/>");
        if (i % 3 === 0 && i % 5 === 0) {
            document.write("FizzBuzz" + "<br/>");
        } else if (i % 3 === 0) {
            document.write("Fizz" + "<br/>");
        } else if (i % 5 === 0) {
            document.write("Buzz" + "<br/>");
        } else  {
            document.write(i + "<br/>");
        }
    }
}
// bai7();
//Bài 8
function bai8() {
    let temp = "<input type='button' value='Chơi' onclick='play()' >";
    document.write(temp);
    function play() {
        let guessFrom = parseInt(prompt("From "));
        let guessTo = parseInt(prompt("To "));
        let guss = Math.floor(Math.random() * 10);
        if (guessTo >= guessFrom) {
            document.write("Bạn đã nhập sai");
        }
        if (guss > guessTo || guss < guessFrom) {
            document.write("Bạn đoán sai rồi ");
        } else {
            document.write("Bạn đã chiến thắng");
        }
    }
}
bai8();



