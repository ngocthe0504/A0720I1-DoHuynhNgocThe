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
    function factorialize(num) {
        let result = num;
        if (num === 0 || num === 1)
            return 1;
        while (num > 1) {
            num--;
            result *= num;
        }
        return result;
    }
    alert(factorialize(5));
}
// bai2();
//Bài 3
function bai3() {
    function bai1() {
        for (let i = 1; i <= 5; i++) {
            for (let j = 1; j <= i; j++) {
                document.write("*");
            }
            document.write("<br>");
        }
    }
    function bai2() {
        for (let i = 5; i >= 1; i--) {
            for (let j = 1; j <= i; j++) {
                document.write("*");
            }
            document.write("<br>");
        }
    }
}
//Bài 4
function bai4() {
    for(let i = 1; i <= 7; i++) {
        for(let k = 1 ; k <= 20; k++) {
            // if(i === 1 || k === 1 || i === 7 || k === 20) {
                document.write("*");
            // } else{
            //     document.write(" ");
            // }
        }
        document.write("<br>");
    }
}
bai4();













