//Bài 1
function bai1(num) {
    let  a = 1;
    let  b = 0;
    let temp;
    while (num >= 0){
        temp = a;
        a = a + b;
        b = temp;
        num--;
        document.writeln(temp);
    }
}
// bai1(20);
// Bài 2
function bai2() {
    let num = parseInt(prompt());
    let total = 0;
    for (let i = 1; i <= num; i++) {
        total = total * i;
    }
    alert(total);
}
bai2();

