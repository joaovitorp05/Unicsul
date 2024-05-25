notas = []
soma = 0

print("Digite quantas notas quiser.")
print("Digite 0 para sair do sistema. ")

while True:
    n = float(input("Digite uma nota: "))
    if (n == 0 ):
        break
    
    notas.append(n)
    soma+=n
    
media = soma/len(notas)
print("Média %.2f" %media) 
print("Notas digitadas: ", notas)     