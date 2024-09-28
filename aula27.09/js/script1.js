var idade = parseFloat(prompt("Digite a sua idade: "))
if(idade<=16){
    document.write("<h1>Voce pode votar</h1>")
}
else if (idade<=70){
    document.write("<h1>Voto Obrigato0rio</h1>")
}
else{
    document.write("<h1>Voto optativo</h1>")
}