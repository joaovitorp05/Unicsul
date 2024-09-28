var num1 = parseInt(prompt("Digite o primeiro número"))
var num2 = parseInt(prompt("Digite  o segundo número"))
var num3 = parseInt(prompt("Digite  o terceiro número"))

var maior, medio, menor;

if (num1 >= num2 && num1 >= num3) {
    maior = num1;
    if (num2 >= num3) {
        medio = num2;
        menor = num3;
    } else {
        medio = num3;
        menor = num2;
    }
} else if (num2 >= num1 && num2 >= num3) {
    maior = num2;
    if (num1 >= num3) {
        medio = num1;
        menor = num3;
    } else {
        medio = num3;
        menor = num1;
    }
} else {
    maior = num3;
    if (num1 >= num2) {
        medio = num1;
        menor = num2;
    } else {
        medio = num2;
        menor = num1;
    }
}

document.write("Números na ordem decrescente: " + maior + ", " + medio + ", " + menor);
