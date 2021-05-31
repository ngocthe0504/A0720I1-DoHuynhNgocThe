let num1 = parseInt(prompt("Nhập số thứ nhất:"));
let num2 = parseInt(prompt("Nhập số thứ hai:"));
let total1 = 0;
let total2 = 0;
function operate() {
    for (let i = 1; i < num1 ; i++) {
        if (num1 % i === 0) {
            total1 += i;
        }
    }// Tính tổng tất cả các ước của số thứ 1
    for (let i = 1; i < num2 ; i++) {
        if (num2 % i === 0) {
            total2 += i;
        }
    }// Tính tổng tất cả các ước của số thứ 2
}
operate();
function check() {
    if (total1 === num2 && total2 === num1) {
        return true;
    } else {
        return false;
    }
}// Hàm kiểm tra xem cặp số vừa nhập có phải là cặp số thân thiết không?
alert(check());// Hiển thị kết quả