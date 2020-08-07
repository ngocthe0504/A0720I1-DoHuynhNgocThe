let good = document.getElementById("good");
let fast = document.getElementById("fast");
let cheap = document.getElementById("cheap");
function check(option) {
    switch (option) {
        case 1: {
            if (fast.checked && cheap.checked) {
                fast.checked = false;
            }
            break;
        }
        case 2: {
            if (good.checked && cheap.checked) {
                cheap.checked = false;
            }
            break;
        }
        case 3: {
            if (fast.checked && good.checked) {
                good.checked = false;
            }
            break;
        }
    }

}
