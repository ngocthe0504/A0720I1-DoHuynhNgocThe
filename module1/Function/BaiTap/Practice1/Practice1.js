//Bài 1
function bai1() {
    function alertMessage(arr) {
        alert(arr);
        return arr;
    }
    let arr = "Xin chào!";
    alertMessage(arr);
}
// bai1();
// Bài 2
function bai2() {

}
//Bài 3
function bai3(a,b) {
    let result = 0;
    if (a > b) {
        result = alert("a > b");
    } else {
        result = alert(a + b);
    }
    return result;
}
// bai3(1,2);
//Bài 4
function bai4() {
    function addNumbers() {
        firstNum = 4;
        secondNum = 8;
        result = firstNum + secondNum;
        alert(result);
        return result;
    }
    result = 0;
    result = addNumbers();
    alert(result);
}
// bai4();
//Bài 5
function bai5() {
    let arr1 = ["Polaris", "Aldebaran", "Deneb", "Vega", "Altair", "Dubhe", "Regulus"];
    let arr2 = ["Ursa Minor", "Tarurus", "Cygnus", "Lyra", "Aquila", "Ursa Major", "Leo"];
    function find() {
        let temp = prompt("Nhập ngôi sao bạn muốn tìm");
        for (let i = 0; i > arr1.length; i++) {
            if (arr1[i] === temp) {
                alert(arr2[i]);
            }
            // if (arr1[i] !== temp) {
            //     alert("Không tìm thấy sao bạn muốn tìm");
            // }
        }
    }
    find();
}
bai5();
