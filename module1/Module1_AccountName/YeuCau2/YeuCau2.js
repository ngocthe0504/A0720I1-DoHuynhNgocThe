let fullName = document.getElementById("fullName");
let birth = document.getElementById("birth");
let identityCard = document.getElementById("identityCard");
let gmail = document.getElementById("gmail");
let address = document.getElementById("address");
let rentDays = document.getElementById("rentDays");
let customtype = document.getElementById("customertype");
let typeOfRoom = document.getElementById("typeOfRoom");
let discount = document.getElementById("discount");
let numberOfPeople = document.getElementById("numberOfPeople");
let typeOfHouse = document.getElementById("typeOfHouse");
typeOfHouse.querySelector(".typeOfHouse");
let totalOfMoney;
function menu() {
    let chosse = prompt("1. Display customer information." + "\n" +
        "2. Edit customer information." + "\n" +
        "3. Show the price after the discount."
    );
    switch (chosse) {
        case "1" : {
            alert("Full name: " + fullName.value + "\n"
                 + "Date of birth: " + birth.value + "\n"
                 + "Indentity card: " + identityCard.value + "\n"
                 + "Gamil: " + gmail.value + "\n"
                 + "Address: " + address.value + "\n"
                 + "Number of days to rent a room: " + rentDays.value + "\n"
                 + "Custom type: " + customtype.value + "\n"
                 + "Discount: " + discount.value + "%" + "\n"
                 + "Amount of people: " + numberOfPeople.value + "\n"
                 + "Type of house: " + typeOfHouse.value
            );
            break;
        }
        case "2" : {
            let edit = prompt("1.Full name: " + fullName.value + "\n"
                + "2.Date of birth: " + birth.value + "\n"
                + "3.Indentity card: " + identityCard.value + "\n"
                + "4.Gmail: " + gmail.value + "\n"
                + "5.Address: " + address.value + "\n"
                + "6.Number of days to rent a room: " + rentDays.value + "\n"
                + "7.Custom type: " + customtype.value + "\n"
                + "8.Discount: " + discount.value + "%" + "\n"
                + "9.Amount of people: " + numberOfPeople.value + "\n"
                + "10.Type of house: " + typeOfHouse.value
            );
            switch (edit) {
                case "1" : {
                    fullName = prompt("Rename: " );
                    alert("Full name: " + fullName + "\n"
                        + "Date of birth: " + birth.value + "\n"
                        + "Indentity card: " + identityCard.value + "\n"
                        + "Gamil: " + gmail.value + "\n"
                        + "Address: " + address.value + "\n"
                        + "Number of days to rent a room: " + rentDays.value + "\n"
                        + "Custom type: " + customtype.value + "\n"
                        + "Discount: " + discount.value + "%" + "\n"
                        + "Amount of people: " + numberOfPeople.value + "\n"
                        + "Type of house: " + typeOfHouse.value
                    );
                    break;
                }
                case "2" : {
                    birth = prompt("Enter your birth: ");
                    alert("Full name: " + fullName.value + "\n"
                        + "Date of birth: " + birth + "\n"
                        + "Indentity card: " + identityCard.value + "\n"
                        + "Gamil: " + gmail.value + "\n"
                        + "Address: " + address.value + "\n"
                        + "Number of days to rent a room: " + rentDays.value + "\n"
                        + "Custom type: " + customtype.value + "\n"
                        + "Discount: " + discount.value + "%" + "\n"
                        + "Amount of people: " + numberOfPeople.value + "\n"
                        + "Type of house: " + typeOfHouse.value
                    );
                    break;
                }
                case "3" : {
                    identityCard = prompt("Enter your identity card: ");
                    alert("Full name: " + fullName.value + "\n"
                        + "Date of birth: " + birth.value + "\n"
                        + "Indentity card: " + identityCard + "\n"
                        + "Gamil: " + gmail.value + "\n"
                        + "Address: " + address.value + "\n"
                        + "Number of days to rent a room: " + rentDays.value + "\n"
                        + "Custom type: " + customtype.value + "\n"
                        + "Discount: " + discount.value + "%" + "\n"
                        + "Amount of people: " + numberOfPeople.value + "\n"
                        + "Type of house: " + typeOfHouse.value
                    );
                    break;
                }
                case "4" : {
                    gmail = prompt("Enter your gmail: ");
                    alert("Full name: " + fullName.value + "\n"
                        + "Date of birth: " + birth.value + "\n"
                        + "Indentity card: " + identityCard.value + "\n"
                        + "Gamil: " + gmail + "\n"
                        + "Address: " + address.value + "\n"
                        + "Number of days to rent a room: " + rentDays.value + "\n"
                        + "Custom type: " + customtype.value + "\n"
                        + "Discount: " + discount.value + "%" + "\n"
                        + "Amount of people: " + numberOfPeople.value + "\n"
                        + "Type of house: " + typeOfHouse.value
                    );
                    break;
                }
                case "5" : {
                    address = prompt("Enter your address: ");
                    alert("Full name: " + fullName.value + "\n"
                        + "Date of birth: " + birth.value + "\n"
                        + "Indentity card: " + identityCard.value + "\n"
                        + "Gamil: " + gmail.value + "\n"
                        + "Address: " + address + "\n"
                        + "Number of days to rent a room: " + rentDays.value + "\n"
                        + "Custom type: " + customtype.value + "\n"
                        + "Discount: " + discount.value + "%" + "\n"
                        + "Amount of people: " + numberOfPeople.value + "\n"
                        + "Type of house: " + typeOfHouse.value
                    );
                    break;
                }
                case "6" : {
                    rentDays = prompt("Enter your number of days to rent a room: ");
                    alert("Full name: " + fullName.value + "\n"
                        + "Date of birth: " + birth.value + "\n"
                        + "Indentity card: " + identityCard.value + "\n"
                        + "Gamil: " + gmail.value + "\n"
                        + "Address: " + address.value + "\n"
                        + "Number of days to rent a room: " + rentDays + "\n"
                        + "Custom type: " + customtype.value + "\n"
                        + "Discount: " + discount.value + "%" + "\n"
                        + "Amount of people: " + numberOfPeople.value + "\n"
                        + "Type of house: " + typeOfHouse.value
                    );
                    break;
                }
                case "7" : {
                    customtype = prompt("Enter your custom type: ");
                    alert("Full name: " + fullName.value + "\n"
                        + "Date of birth: " + birth.value + "\n"
                        + "Indentity card: " + identityCard.value + "\n"
                        + "Gamil: " + gmail.value + "\n"
                        + "Address: " + address.value + "\n"
                        + "Number of days to rent a room: " + rentDays.value + "\n"
                        + "Custom type: " + customtype + "\n"
                        + "Discount: " + discount.value + "%" + "\n"
                        + "Amount of people: " + numberOfPeople.value + "\n"
                        + "Type of house: " + typeOfHouse.value
                    );
                    break;
                }
                case "8" : {
                    discount = prompt("Enter your discount: ");
                    alert("Full name: " + fullName.value + "\n"
                        + "Date of birth: " + birth.value + "\n"
                        + "Indentity card: " + identityCard.value + "\n"
                        + "Gamil: " + gmail.value + "\n"
                        + "Address: " + address.value + "\n"
                        + "Number of days to rent a room: " + rentDays.value + "\n"
                        + "Custom type: " + customtype.value + "\n"
                        + "Discount: " + discount + "%" + "\n"
                        + "Amount of people: " + numberOfPeople.value + "\n"
                        + "Type of house: " + typeOfHouse.value
                    );
                    break;
                }
                case "9" : {
                    numberOfPeople = prompt("Enter your number of people: ");
                    alert("Full name: " + fullName.value + "\n"
                        + "Date of birth: " + birth.value + "\n"
                        + "Indentity card: " + identityCard.value + "\n"
                        + "Gamil: " + gmail.value + "\n"
                        + "Address: " + address.value + "\n"
                        + "Number of days to rent a room: " + rentDays.value + "\n"
                        + "Custom type: " + customtype.value + "\n"
                        + "Discount: " + discount.value + "%" + "\n"
                        + "Amount of people: " + numberOfPeople + "\n"
                        + "Type of house: " + typeOfHouse.value
                    );
                    break;
                }
                case "10" : {
                    typeOfHouse = prompt("Enter your type of house: ");
                    alert("Full name: " + fullName.value + "\n"
                        + "Date of birth: " + birth.value + "\n"
                        + "Indentity card: " + identityCard.value + "\n"
                        + "Gamil: " + gmail.value + "\n"
                        + "Address: " + address.value + "\n"
                        + "Number of days to rent a room: " + rentDays.value + "\n"
                        + "Custom type: " + customtype.value + "\n"
                        + "Discount: " + discount.value + "%" + "\n"
                        + "Amount of people: " + numberOfPeople.value + "\n"
                        + "Type of house: " + typeOfHouse
                    );
                    break;
                }
                default : {
                    alert("Failed");
                }
            }
        }
        case "3" : {
            let discountAmount = 0;
            let total;
            if (address.value === "Đà Nẵng") {
                discountAmount = -20;
            } else if (address.value === "Quảng Nam") {
                discountAmount = -5;
            } else if (address.value === "Huế") {
                discountAmount = -10;
            }
            if (customtype.value === "Diamond") {
                discountAmount += -15;
            } else if (customtype.value === "Platinum") {
                discountAmount += -10;
            } else if (customtype.value === "Gold") {
                discountAmount += -5;
            } else if (customtype.value === "Silver") {
                discountAmount += -2;
            } else  if (customtype.value === "Member") {
                discountAmount += 0;
            }
            if (parseInt(rentDays.value) >= 2 && parseInt(rentDays.value) <= 4) {
                discountAmount += -10;
            } else if (parseInt(rentDays.value) >= 5 && parseInt(rentDays.value) <= 7) {
                discountAmount += -20;
            } else if (parseInt(rentDays.value) > 7) {
                discountAmount += -30;
            }
            if (typeOfHouse.value === "Villa") {
                total = (500 * parseInt(rentDays.value)) + discountAmount;
            } else if (typeOfHouse.value === "House") {
                total = (300 * parseInt(rentDays.value)) + discountAmount;
            } else {
                total = (100 * parseInt(rentDays.value)) + discountAmount;
            }
            alert(total);
            break;
        }

        // default : {
        //     alert("Bạn hãy chọn các chức năng có trong trình đơn");
        //     // prompt("1. Display customer information." + "\n" +
        //     //     "2. Edit customer information." + "\n" +
        //     //     "3. Show the price after the discount."
        //     // );
        // }
    }
} // func hiển thị menu ở yêu cầu 2
function bill() {
    // totalOfMoney = parseInt(+typeOfHouse.value) * parseInt(rentDays.value) * (1 - parseInt(discount.value) / 100);
    if (typeOfHouse.value === "Villa") {
        totalOfMoney = (500 * parseInt(rentDays.value)) * (1 - parseInt(discount.value) / 100);
    } else if (typeOfHouse.value === "House") {
        totalOfMoney = (300 * parseInt(rentDays.value)) * (1 - parseInt(discount.value) / 100);
    } else {
        totalOfMoney = (100 * parseInt(rentDays.value) ) * (1 - parseInt(discount.value) / 100);
    }
    alert("Total of money:" + totalOfMoney);
} // func tính tiền ở yêu cầu 1

