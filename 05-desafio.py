segunda = int(input("voce trabalhou na segunda?:"))
quarta = int(input("voce trabalhou na quarta?:"))
sexta = int(input("voce trabalhou na sexta?:"))

tv55 = bool(segunda) and bool(quarta) and bool(sexta)
print(f"João pode comprar uma tv 55? {tv55}")

