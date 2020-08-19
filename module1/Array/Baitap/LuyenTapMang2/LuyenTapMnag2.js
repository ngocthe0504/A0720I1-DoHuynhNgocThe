//Bài 1
function bai1() {
    let a = [
        [1, 2, 1, 24],
        [8, 11, 9, 4],
        [7, 0, 7, 27],
        [7, 4, 28, 14],
        [3, 10, 26, 7]
    ];
    for (let i in a)
    {
        document.write("row " + i + "</br>");
        for (let j in a[i])
        {
            document.write(" " + a[i][j] + "</br>");
        }
    }
}
// bai1();
//Bài 2
function bai2() {
    let a =  [ 'c', 's', 'c', '2', '6', '1' ];
    a.reverse();
    alert(a);
}
// bai2();
//Bài 3
function bai3() {
    let getNumber = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));
    let b = [getNumber];
    for (let i = 0; i < getNumber; i++) {
        b[i] = parseInt(prompt("nhập vào phần tử thứ " + (i+1)));
    }
    alert(b.length);
}
// bai3();
//Bài 4
function bai4() {
    let a =  [ 'c', 's', 'c', '2', '6', '1' ];
    let count = 0;
    for (let i = 0; i < a.length; i++) {
        if (!isNaN(a[i])) {
            count++;
        }
    }
    alert(count);
}
// bai4();
//Bài 5
function bai5() {
   let a = ["a", "b", "c", 2, 3, 4];
   let b = ["a", "b", "c", 2, 3, 5];
   let count = 0;
   if (a.length !== b.length) {
       document.write("2 mảng khác nhau");
   } else {
       for(var i=0;i<a.length;i++) {
           if(a[i]!== b[i]) {
               count++;
               // document.write("2 mảng khác nhau");
               // continue;
           }
       }
       if (count >= 1) {
           document.write("2 mảng khác nhau");
       } else {
           document.write("2 mảng giống nhau");
       }

   }
}
// bai5();
//Bài 6
function bai6() {
    let b = ["-", "a", "v", "-", "-", "r", 2, 5];
    // let getNumber = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));
    // let b = [getNumber];
    // for (let i = 0; i < getNumber; i++) {
    //     b[i] = parseInt(prompt("nhập vào phần tử thứ " + (i+1)));
    // }
    for (let j = 0; j < b.length; j++) {
        if (b[j] === "-") {
            b[j] = "_";
        }
    }
    document.write(b);
}
bai6();





