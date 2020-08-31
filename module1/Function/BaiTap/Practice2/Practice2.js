//Bài 1
function bai1(number) {
    let result = number * number;
    alert(result);
    return result;
}
// bai1(2);
//Bài 2
function bai2() {
    function dienTich(r) {
        let result = Math.PI * r *r;
        alert(result);
        return result;
    }
    function chuVi(r) {
        let result = Math.PI * r * 2;
        alert(result);
    }
    dienTich(10);
    chuVi(10);
}
// bai2();
//Bài 3
function bai3(n) {
    let ans=1;
    for (let  i = 2; i <= n; i++) {
        ans = ans * i;
    }
    alert(ans);
}
// bai3(5);
//Bài 4
function bai4(temp) {
    // let temp = parseInt(prompt());
    if (Number.isNaN(temp)) {
        alert("true");
    } else {
        alert("False");
    }
} // Anh Hải rv cho em hỏi bài này tí
// bai4(10);
// Bài 5
function bai5(a, b, c) {
   if (a < b && a < c) {
       return a;
   }
   if (b < a && b < c) {
       return b;
   }
   if (c < a && c < b) {
       return c;
   }
}
// alert(bai5(1,2,3));
//Bài 6
function bai6(number) {
    if (number > 0) {
        return true;
    } else if (!isNaN(number)) {
        return false;
    } else if (number < 0) {
        return false;
    }
}
alert(bai6(1));







