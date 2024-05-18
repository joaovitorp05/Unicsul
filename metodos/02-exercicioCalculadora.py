
def somaDoisValores(a, b):
    return a + b
       
    
def subtracaoValores(a , b):
    return a - b
  

def MultValores(a, b):
    return a * b
    

def DivisaoValores(a, b):
    return a / b

n1 = float(input("Entre com o 1o valor: "))
n2 = float(input("Entre com o 2o valor: "))

operacao = input("Digite a operação desejada (+,-,*,/): ")

if operacao == "+":
    resultado = somaDoisValores(n1, n2)
    
elif operacao == "-":
    resultado = subtracaoValores(n1,n2) 
    
elif operacao == "*":
    resultado = MultValores(n1,n2)  
    
elif operacao == "/":
    resultado = DivisaoValores(n1,n2) 
else:
    print("Operação Inválida")             
    
    
print("O resultado da operação solicitada é: ", resultado)    