def calculadoraIMC():
    altura = float(input("Digite sua altura: "))
    peso = float(input("Digite seu peso: "))
    
    print("Calculando o IMC...")
    
    imc = peso/(altura**2)
    print("seu IMC é: ", imc)
    
calculadoraIMC()