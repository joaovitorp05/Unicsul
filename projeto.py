print("-----------INTEGRANTES DO GRUPO---------------")
print("NOME: JOAO DA SILVA, RGM: 12345678")   
print("NOME: MARIA DA SILVA, RGM: 12345545") 
print("-----------INTEGRANTES DO GRUPO---------------")

print("Seja bem vindo ao nosso sistema de conversão de bases.")
print("Por favor, escolher uma opção: ")
print("1 - Converter de DECIMAL para BINÁRIO")
print("2 - Converter de DECIMAL para HEXADECIMAL")
print("3 - Converter de DECIMAL para OCTADECIMAL")
print("4 - Converter de BINÁRIO para DECIMAL")
print("5 - Converter de HEXADECIMAL para DECIMAL")
print("6 - Converter de OCTADECIMAL para DECIMAL")
print("0 - Para encerrar o sistema.")

escolha = int(input("Digite sua escolha: "))

# DECIMAL PARA BINARIO
def decimal_para_binario(decimal):
    if decimal == 0:
        return '0'
    binario = ''
    while decimal > 0 :
        resto = decimal % 2
        binario = str(resto) + binario
        decimal = decimal // 2
    return binario 

# DECIMAL PARA OCTAL
def decimal_para_octal(decimal):
    if decimal == 0:
        return '0'
    octal = ''
    while decimal > 0:
        resto = decimal % 8
        octal = str(resto) + octal
        decimal = decimal // 8
    return octal  

# BINÁRIO PARA DECIMAL 11001
def binario_para_decimal(binario):
    decimal = 0
    expoente = 0
    for bit in reversed(binario):
        decimal += int(bit) * (2 ** expoente)
        expoente += 1 
    return decimal    
             

while escolha > 0:
    
    numero = int(input("Digite o número que deseja converter: "))
    
    if escolha == 1:
        print("----DECIMAL PARA BINÁRIO----")
        binario = decimal_para_binario(numero)
        print("O valor ", numero," convertido para binário é: ", binario)
        escolha = 0
    elif escolha == 2:
        print("----DECIMAL PARA HEXADECIMAL----")
        escolha = 0
    elif escolha == 3:
        print("----DECIMAL PARA OCTADECIMAL----")
        octal = decimal_para_octal(numero)
        print("O valor ", numero, "convertido para octadecimal é: ",octal)
        escolha = 0
    elif escolha == 4:
        print("----BINÁRIO PARA DECIMAL----")
        decimal = binario_para_decimal(str(numero))
        print("O valor ", numero," convertido para decimal é: ", decimal)
        escolha = 0
    elif escolha == 5:
        print("----HEXADECIMAL PARA DECIMAL----")
        escolha = 0
    elif escolha == 6:
        print("----OCTADECIMAL PARA DECIMAL----")
        escolha = 0    
    else:
        print("Opção inválida")
