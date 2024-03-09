segunda = int(input("voce trabalhou na segunda?:"))
quarta = int(input("voce trabalhou na quarta?:"))
sexta = int(input("voce trabalhou na sexta?:"))

tvtubo = bool(segunda)
print(f"João pode comprar uma tv de tubo? {tvtubo}")

tv32 = bool(segunda) and bool(quarta)
print(f"João pode comprar uma tv 32? {tv32}")

tv55 = bool(segunda) and bool(quarta) and bool(sexta)
print(f"João pode comprar uma tv 55? {tv55}")

