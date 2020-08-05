function CToF() {
    let C = document.getElementById("C");
    let F;
    F = (parseFloat(C.value) *9 + 160) / 5;
    alert(F);
}