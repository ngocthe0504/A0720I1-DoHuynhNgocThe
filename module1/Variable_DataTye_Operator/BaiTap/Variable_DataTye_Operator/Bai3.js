function acreage() {
    const PI = 3.14;
    let S;
    let radius = document.getElementById("radius");
    S = parseFloat(radius.value) * parseFloat(radius.value) * PI;
    alert(S);
    console.log(S);
}