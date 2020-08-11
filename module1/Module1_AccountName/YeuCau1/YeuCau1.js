function bill() {
    let typeOfHouse=document.getElementById("typeOfHouse");
    let rentDays=document.getElementById("rentDays");
    let discount=document.getElementById("discount");
    let totalOfMoney;
    totalOfMoney = parseInt(+typeOfHouse.value) * parseInt(rentDays.value) * (1 - parseInt(discount.value) / 100);
    alert("Total of money:" + totalOfMoney);
}
