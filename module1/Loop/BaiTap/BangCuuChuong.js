let table = "<table border='1' width='1000' cellspacing='0' cellpadding='3'>";
for (let i = 2; i <= 9; i++) {
    table = table + "<tr>";
    for (let j = 1; j <= 9; j++) {
        table = table + "<td>" + i + "x" + j + "= " + (i*j) + "</td>";
    }
    table = table + "</tr>";
}
table = table + "</table>";
document.write(table);