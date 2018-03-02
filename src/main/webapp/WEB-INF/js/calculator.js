function sum() {
    var a = document.getElementById("valueA");
    var b = document.getElementById("valueB");
    alert(parseInt(a.value) + parseInt(b.value));
}

function sub() {
    var a = document.getElementById("valueA");
    var b = document.getElementById("valueB");
    alert(a.value - b.value);
}

function mul() {
    var a = document.getElementById("valueA");
    var b = document.getElementById("valueB");
    alert(a.value * b.value);
}

function div() {
    var a = document.getElementById("valueA");
    var b = document.getElementById("valueB");
    alert(a.value / b.value);
}