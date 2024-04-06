from random import *

num = randint(0, 100)
i=0
controle = 0

while controle == 0:
    i = i+1
    palpite = int(input("Digite um número inteiro: "))
    if palpite == num:
        print(f"Parabéns voce acertou em {i} tentativas")
        controle=1
    elif palpite > num:
        print("O número digitado é maior que o número sorteado")
    else:
        print("O número digitado é menor que o número sorteado")    
