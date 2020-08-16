let arr = new Array(10);
let count = 0;
let max = 0;
//Bài 1
function bai1() {
for (let i = 0; i < 10; i++) {
    arr[i] = parseInt(prompt("nhập vào phần tử thứ " + (i+1)));
    for (let j = 0; j < 10; j++) {
        if (arr[j] > 10) {
            count++;
        }
    }
}
alert(count);
}
//Bài 2
function bai2() {
    for (let i = 0; i < 10; i++) {
        arr[i] = parseInt(prompt("nhập vào phần tử thứ " + (i+1)));
    }
    max = arr[0];
    for (let j = 0; j < 10; j++) {
        if (max < arr[j]) {
            max = arr[j];
        }
    }
    alert(max);
    function checkAdult(arr) {
        return arr >= max;
    }
    function myFunction() {
        alert(arr.findIndex(checkAdult));
    }
    myFunction();
}
//Bài 3
function bai3() {
    let a = [];
    max = 0;
    let total = 0;
    let TB = 0;
    let getNumber = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));
    for (let i = 0; i < getNumber; i++) {
        a[i] = parseInt(prompt("nhập vào phần tử thứ " + (i+1)));
    }
    max = a[0];
    for (let j = 0; j < 10; j++) {
        if (max < a[j]) {
            max = a[j];
        }
    }
    alert(max);
    for (let k = 0; k < a.length; k++) {
        total += a[k];
    }
    TB = total / arr.length;
    alert(TB);
}
//Bai 4
function bai4() {

    let getNumber = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));
    let b = [getNumber];
    for (let i = 0; i < getNumber; i++) {
        b[i] = parseInt(prompt("nhập vào phần tử thứ " + (i+1)));
    }
    b.reverse();
    alert(b);
}
// bai4();
//Bài 5
function bai5() {
    let getNumber = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));
    let a = [getNumber];
    count = 0;
    for (let i = 0; i < getNumber; i++) {
        a[i] = parseInt(prompt("nhập vào phần tử thứ " + (i+1)));
        if (parseInt(a[i]) < 0) {
              count++;
        }
    }
    alert(count);
}
// bai5();
//Bài 6
function bai6() {
    for (let i = 0; i < 10; i++) {
        arr[i] = parseInt(prompt("nhập vào phần tử thứ " + (i + 1)));
    }
    let find = prompt("Phần tử cần tìm: ");
    for (let j = 0; j < arr.length; j++) {
        if (arr[j] === parseInt(find)) {
            alert("V is in the array");
            break;
        } else {
            alert("V is not in the array");
            break;
        }
    }
}
// bai6();
//Bài 7
function bai7() {
    for (let i = 0; i < 10; i++) {
        arr[i] = parseInt(prompt("nhập vào phần tử thứ " + (i + 1)));
    }
    let find = prompt("Phần tử cần tìm: ");
    for (let j = 0; j < arr.length; j++) {
        if (parseInt(find) === arr[j]) {
            for (let k = j; k <= arr.length - 2; k++) {
                arr[k] = arr[k+1];
            }
            arr[length-1] = 0;
        }
    }
    alert(arr);
}
// bai7();
//Bài 8
function bai8() {
    for (let i = 0; i < 10; i++) {
        arr[i] = parseInt(prompt("nhập vào phần tử thứ " + (i + 1)));
    }
    arr.sort(
        function (a, b) {
            return a-b;
        }
    )
    alert(arr);
}
// bai8();
//Bài 9
function bai9() {
    let arr1 = new Array(10);
    for (let i = 0; i < 10; i++) {
        arr1[i] = parseInt(prompt("nhập vào phần tử thứ " + (i + 1)));
    }
    let arr2 = new Array(10);
    for (let i = 0; i < 10; i++) {
        arr2[i] = parseInt(prompt("nhập vào phần tử thứ " + (i + 1)));
    }
    let arr3 = arr1.concat(arr2);
    alert(arr3);
}
bai9();


