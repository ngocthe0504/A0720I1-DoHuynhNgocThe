function medium() {
    let math = document.getElementById("math");
    let physical = document.getElementById("physical");
    let chemistry = document.getElementById("chemistry");
    let mediumScore;
    mediumScore = (parseFloat(math.value) + parseFloat(chemistry.value) + parseFloat(physical.value)) / 3;
    alert("Medium scores: " + mediumScore);
}