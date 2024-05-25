notas = []
soma = 0

n = int(input("Digite a quantidade de notas que deseja inserir: "))

for i in range(1, n+1):
    nota = float(input("Digite a %dª nota: " %i))
    notas.append(nota)
    soma+=nota
    
print("Notas inseridas: ", notas)
media = soma/n
print("Média: %.2f" %media)    





