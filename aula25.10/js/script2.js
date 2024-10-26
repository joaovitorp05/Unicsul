var soma = 0
while(true){
    var num = parseInt(prompt("Digite um valor: "))
    if(num!=0){
        soma + num
    }
    else{
        break
    }
}document.write("O valor total digitado foi: "+soma)