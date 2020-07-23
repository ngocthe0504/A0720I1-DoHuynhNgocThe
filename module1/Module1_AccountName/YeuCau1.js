
function bill() {
    var typeOfHouse=document.querySelector("#typeOfHouse"); // kiểu nhà
    var rentDays=document.querySelector("#rentDays"); // số ngày thuê kiểu text
    var discount=document.querySelector("#discount"); // kiểu selection có value
    var totalOfMoney;
    totalOfMoney = parseInt(+typeOfHouse.value) * parseInt(rentDays.value) * (1 - parseInt(discount.value) / 100);
    alert("Total of money:" + totalOfMoney);
}
