let getNumber = '';
let temp = 0;
let count = 0;
do {
    getNumber = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));
} while (getNumber > 50);
let arr = [getNumber];
for (let i = 0; i < getNumber; i++) {
    arr[i] = parseInt(prompt("nhập vào phần tử thứ " + (i + 1)));
}
document.getElementById('space').innerText = arr;
for (let i = 0; i < getNumber; i += 2) {
    if (arr[i] % 2 === 1) {
        temp += arr[i];
        count++;
    }
} // Tính TBC
if (count === 0) {
    alert("Không có số lẻ nào ở vị trí chẵn");
} else {
    let total = temp / count;
    alert(total);
}

function add() {
    let add = prompt("Nhập phần tử bạn muốn thêm vào mảng: ");
    arr.push(add);
    document.getElementById('space').innerText = "mảng sau khi được thêm: " + arr;
}
