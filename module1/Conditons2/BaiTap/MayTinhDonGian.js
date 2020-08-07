let output = document.getElementById("output");
function nhap(so) {
    output.value = output.value + so;
}
function caculate() {
    output.value = eval(output.value);
}
function xoa() {
    output.value = "";
}