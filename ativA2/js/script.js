function calcularValor() {
    const carroSelecionado = document.getElementById('carro').value;
    let valorCarro;

    if (carroSelecionado === 'fiatUno') {
        valorCarro = 15000;
    } else if (carroSelecionado === 'vwGol') {
        valorCarro = 20000;
    } else if (carroSelecionado === 'fordKa') {
        valorCarro = 25000;
    }

    const pagamento = document.querySelector('input[name="pagamento"]:checked').value;

    let valorFinal;
    let descontoOuAcrescimo = '';

    if (pagamento === 'avista') {
        valorFinal = valorCarro * 0.8;
        descontoOuAcrescimo = '20% de desconto à vista';
    } else if (pagamento === 'parcelado3x') {
        valorFinal = valorCarro;  
        descontoOuAcrescimo = 'Parcelamento em 3X (sem desconto)';
    } else if (pagamento === 'parcelado12x') {
        valorFinal = valorCarro * 1.2; 
        descontoOuAcrescimo = '20% de acréscimo em 12X';
    }

    document.getElementById('carroEscolhido').innerText = `Carro escolhido: ${carroSelecionado.replace(/([A-Z])/g, ' $1').trim()}`;
    document.getElementById('valorInicial').innerText = `Valor inicial: R$ ${valorCarro.toFixed(2)}`;
    document.getElementById('valorFinal').innerText = `Valor final: R$ ${valorFinal.toFixed(2)} (${descontoOuAcrescimo})`;

    document.getElementById('resultado').style.display = 'block';
}
