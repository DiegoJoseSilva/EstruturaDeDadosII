def selection_sort(array):
    n = len(array)

    print("Vetor inicial:", array)
    print("----------------------------------")

    for i in range(n - 1):
        min_index = i

        print(f"Iteracao {i + 1}")
        print(f"Assumindo menor valor na posicao {i}: {array[i]}")

        for j in range(i + 1, n):
            print(f"Comparando {array[j]} com {array[min_index]}")

            if array[j] < array[min_index]:
                min_index = j
                print(f"Novo menor encontrado: {array[min_index]} na posicao {min_index}")

        if min_index != i:
            print(f"Trocando {array[i]} pelo {array[min_index]}")

            temp = array[i]
            array[i] = array[min_index]
            array[min_index] = temp
        else:
            print("Nenhuma troca necessaria")

        print("Estado atual do vetor:", array)
        print("----------------------------------")

    print("Vetor ordenado:", array)


def main():
    array = [64, 25, 12, 22, 11]
    selection_sort(array)


if __name__ == "__main__":
    main()