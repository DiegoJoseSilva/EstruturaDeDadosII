import random
import time

def bubble_sort(lista):
    arr = lista.copy()

    comparacoes = 0

    inicio = time.perf_counter()

    n = len(arr)

    for i in range(n - 1):
        for j in range(n - i - 1):
            comparacoes += 1
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

    fim = time.perf_counter()
    tempo_execucao = fim-inicio
    return arr, comparacoes, tempo_execucao

tamanhos = [10, 100, 1000]

for t in tamanhos:
    numeros = [random.randint(0, 1000) for _ in range(t)]

    print(f"\nTamanho {t}")
    print("Antes:", numeros)

    ordenado, comps, tempo = bubble_sort(numeros)

    print("Lista ordenada:", ordenado)
    print("Número de comparações:", comps)
    print("Tempo de execução:", tempo)