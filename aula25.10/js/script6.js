function obterDadosUsuario(){
    var nome = prompt("Digite seu nome: ")
    var idade = prompt("Digite sua idade: ")
    return {nome, idade}
}
function exibirDadosUsuario(dados){
    document.write("O nome digitado "+dados.nome)
    document.write("Sua idade é: "+dados.idade)
}
var usuario = obterDadosUsuario()
exibirDadosUsuario(usuario)