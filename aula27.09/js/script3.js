var estacao = prompt("Digite sua estação do ano preferida:\n1.Primavera\n2.Verão\n3.Outono\n4.Inverno")
switch(estacao) {
    case "Primavera":
        alert("Estação das flores")
        break;
    case "Verão":
        alert("Estação do sol")
        break;
    case "Outono":
        alert("Estação das chuvas")
        break;
    case "Inverno":
        alert("Estação do frio")
        break;
    default:
        alert("Digitação errada")
        break                
}