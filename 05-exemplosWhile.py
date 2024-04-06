contador = 1

while contador <=10:
    nome = input ("Digite o nome do aluno: ")
    nota1 = float(input(f"Digite a primeira nota do aluno {nome}: "))
    nota2 = float(input(f"Digite a segunda nota do aluno {nome}: "))
    
    media = (nota1+nota2)/2
    
    print(f"A média do aluno {nome} é {media}")
    
    contador = contador + 1