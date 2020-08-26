//Bài 1
function bai1() {
    let C = parseInt(prompt());
    let F = C* 9/5 + 32 ;
    alert(F);
}
// bai1();
//Bài 2
function bai2() {
    let m = parseInt(prompt());
    let ft = m * 3.2808;
    alert(ft);
}
// bai2();
function bai3() {
    let a = parseInt(prompt());
    let dt = a * a;
    alert(dt);
}
// bai3();
//Bài 4
function bai4() {
    let rong = parseInt(prompt());
    let dai = parseInt(prompt());
    let dt = dai * rong;
    alert(dt);
}
// bai4();
//Bài 5
function bai5() {
    let a = parseInt(prompt());
    let b = parseInt(prompt());
    let dt = (a * b) / 2;
    alert(dt);
}
// bai5();
//Bài 6
function bai6() {
    let a = parseInt(prompt());
    let b = parseInt(prompt());
    let x = 0;
    if (a === 0) {
        if (b === 0) {
            alert("phương trình vô số nghiệm");
        } else {
            alert("phương trình vô nghiệm");
        }
    } else {
        x = -b / a;
        alert("Phương trình có nghiệm duy nhất là: " + x);
    }
}
// bai6();
// Bài 7
// function bai7() {
//     let x1 = 0;
//     let x2 = 0;
//     let x = parseInt(prompt());
//     let y = parseInt(form.b.value);
//     let z = parseInt(form.c.value);
//     let delta = 0;
//     // var x1,x2;
//     // var x,y,z,delta;
//     x= parseInt(form.a.value);
//     y= parseInt(form.b.value);
//     z= parseInt(form.c.value);
//     delta=(y*y-4*x*z);
//     if(delta === 0){
//         alert("phuong trinh co nghiem kep");
//         x1=-y/(2*x);
//         x2=-y/(2*x);
//         form.x.value=eval(x1);
//         form.y.value=eval(x2);
//     }
//     else if(delta<0){
//         alert("phuong trinh vo nghiem");
//     }
//     else{
//         alert("phuong trinh co hai nghiem");
//         x1=(-y - Math.sqrt(delta)) / (2*x);
//         x2=(-y + Math.sqrt(delta)) / (2*x);
//         form.x.value=eval(x1);
//         form.y.value=eval(x2);
//     }
// }
// bai7();
//Bài 8
function bai8() {
    let year = parseInt(prompt());
    if (!Number.isInteger(year)) {
        alert("False");
    } else if (year > 120 || year <= 0) {
        alert("False");
    } else {
        alert("True");
    }
}
// bai8();
//Bài 9
function bai9() {
    let a = parseInt(prompt());
    let b = parseInt(prompt());
    let c = parseInt(prompt());
    if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
        alert("Đây là tam giác có 3 cạnh là " + a + "," + b + "," + c);
    } else {
        alert("Đây không phải là 3 cạnh của tam giác");
    }
}
//bai9();
//Bài 10
function bai10() {
    let chuDien = parseInt(prompt());
    let gia = 0;
    if (chuDien > 100) {
        gia = 2500;
    } else if (chuDien > 75) {
        gia = 2300;
    } else if (chuDien > 50) {
        gia = 2150;
    } else if (chuDien > 25) {
        gia = 2000;
    } else if (chuDien <= 25) {
        gia = 1900;
    }
    if (chuDien < 0) {
        alert("Mời bạn nhập lại")
    }
    alert(gia);
}
// bai10();
//Bài 11
function bai11() {

}
//Bai 12
function bai12() {

}











