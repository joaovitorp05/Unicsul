function trocarImagem() {
    const time = document.getElementById('time').value.trim().toLowerCase();
    const imagemContainer = document.getElementById('imagem-container');
    const mensagem = document.getElementById('mensagem');

    if (time === "") {
        alert("Por favor, digite o seu time.");
        return;
    }

    if (time === "sao paulo") {
        imagemContainer.innerHTML = `<img id="imagem" src="img/camisa-sp.webp" width="250" alt="Camisa São Paulo.">`;
        mensagem.innerHTML = "Você escolheu a camisa do São Paulo!";
    } else if (time === "palmeiras") {
        imagemContainer.innerHTML = `<img id="imagem" src="img/camisa-porco.webp" width="250" alt="Camisa Palmeiras.">`;
        mensagem.innerHTML = "Você escolheu a camisa do Palmeiras!";
    } else if (time === "corinthians") {
        imagemContainer.innerHTML = `<img id="imagem" src="img/camisa-gamba.webp" width="250" alt="Camisa Corinthians.">`;
        mensagem.innerHTML = "Você escolheu a camisa do Corinthians!";
    } else if (time === "santos") {
        imagemContainer.innerHTML = `<img id="imagem" src="img/camisa-bantos.png" width="250" alt="Camisa Santos.">`;
        mensagem.innerHTML = "Você escolheu a camisa do Santos!";
    } else if (time === "vasco") {
        imagemContainer.innerHTML = `<img id="imagem" src="img/camisa-vasco.webp" width="250" alt="Camisa Vasco.">`;
        mensagem.innerHTML = "Você escolheu a camisa do Vasco!";
    } else if (time === "flamengo") {
        imagemContainer.innerHTML = `<img id="imagem" src="img/camisa-fla.jpg" width="250" alt="Camisa Flamengo.">`;
        mensagem.innerHTML = "Você escolheu a camisa do Flamengo!";
    } else if (time === "cruzeiro") {
        imagemContainer.innerHTML = `<img id="imagem" src="img/camisa-cru.webp" width="250" alt="Camisa Cruzeiro.">`;
        mensagem.innerHTML = "Você escolheu a camisa do Cruzeiro!";
    } else {
        imagemContainer.innerHTML = `<img id="imagem" src="img/erro.gif" alt="Imagem de erro" width="300">`;
        mensagem.innerHTML = "Camisa não encontrada! Tente novamente.";
    }
}
