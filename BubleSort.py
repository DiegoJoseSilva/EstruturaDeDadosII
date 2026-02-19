quantidade = int(input("Quantos números você deseja inserir? "))

numeros = []

for i in range(quantidade):
    valor = int(input(f"Digite o número {i+1}: "))
    numeros.append(valor)

print("Lista informada:", numeros)

n = len(numeros)

for i in range(n):
    for j in range(n - i - 1):
        if numeros[j] > numeros[j + 1]:
            # troca
            numeros[j], numeros[j + 1] = numeros[j + 1], numeros[j]

print("Lista ordenada:", numeros)