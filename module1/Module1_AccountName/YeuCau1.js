
function bill() {
    let typeOfHouse=document.getElementById("typeOfHouse"); // kiểu nhà
    let rentDays=document.getElementById("rentDays"); // số ngày thuê kiểu text
    let discount=document.getElementById("discount"); // kiểu selection có value
    let totalOfMoney;
    totalOfMoney = parseInt(+typeOfHouse.value) * parseInt(rentDays.value) * (1 - parseInt(discount.value) / 100);
    alert("Total of money:" + totalOfMoney);
}
