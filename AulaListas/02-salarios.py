mes = ["Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"]

totalSalario = 0

for i in range(12):
    salario = float(input("Digite o salário de %s R$: " %mes [i]))
    totalSalario = totalSalario + salario
    
    decimoTerceiro = (totalSalario / 12)
    tercoFerias = (totalSalario / 12) * (1/3)
    
    print("O décimo terceiro salário é: ", decimoTerceiro)
    print("O terço de férias corresponde á: ", tercoFerias)