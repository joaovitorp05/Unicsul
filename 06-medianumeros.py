qntdeNotas = 0
soma = 0
resp = 's'

while resp == 's' or resp == 'S':
    num = float(input('Digite uma nota'))
    soma = soma+num
    qntdeNotas = qntdeNotas + 1
    resp = input("Deseja continuar (S/N):")
    
media = soma / qntdeNotas
print("A média das notas digitadas é %.2f" %media)    
    