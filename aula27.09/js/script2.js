var idade = parseFloat(prompt("Digite a sua idade: "))
if(idade>=16 && idade<=18 || idade>=70){
    document.write("<h1>Voto optativo</h1>")
}
else if (idade<16){
    document.write("<h1>Não pode votar</h1>")
}
else{
    document.write("<h1>Voto obrigatório</h1>")
}

