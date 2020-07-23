let typeOfHouse=document.getElementById("typeOfHouse");
let rentDays=document.getElementById("rentDays");
let discount=document.getElementById("discount");

typeOfHouse=typeOfHouse.value;
rentDays=rentDays.value;
discount=discount.value;
function outputTotalMoney() {
    let totalOfMoney;
    if typeOfHouse.value == "Villa"
        typeOfHouse = 500;
    else
    {
        if (typeOfHouse.value == "House")
            typeOfHouse = 300;
        else
            typeOfHouse.value = 100;
    }
    totalOfMoney= typeOfHouse * rentDays * (1 - discount / 100);
    alert("Total of money:" totalOfMoney);
}