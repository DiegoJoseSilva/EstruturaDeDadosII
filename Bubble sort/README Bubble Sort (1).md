# **📊 Bubble Sort em Python**

## **📌 Descrição**

Este projeto apresenta a implementação do algoritmo **Bubble Sort** em Python com o objetivo de demonstrar seu funcionamento, medir o número de comparações realizadas e calcular o tempo de execução.

O algoritmo recebe uma lista de números inteiros, realiza a ordenação em ordem crescente e imprime a lista antes e depois da ordenação.

---

## **🎯 Objetivos**

* Implementar o Bubble Sort em Python  
* Contabilizar o número de comparações realizadas  
* Medir o tempo de execução do algoritmo  
* Testar o algoritmo com diferentes tamanhos de entrada

---

## **⚙️ Como funciona o algoritmo**

O **Bubble Sort** percorre a lista repetidamente, comparando elementos adjacentes e trocando suas posições quando estão fora de ordem.

A cada iteração, o maior elemento da parte não ordenada “sobe” para sua posição correta, semelhante a uma bolha.

---

## **🧠 Métricas analisadas**

O projeto mede:

* ✔ Lista original  
* ✔ Lista ordenada  
* ✔ Número de comparações  
* ✔ Tempo de execução

O tempo é medido utilizando `time.perf_counter()`, que oferece maior precisão para análise de desempenho.

---

## **▶️ Como executar**

1. Certifique-se de ter o Python instalado.  
2. Execute o arquivo:

python bubble\_sort.py

---

## **🧪 Testes realizados**

O algoritmo é testado automaticamente com diferentes tamanhos de lista:

* 10 elementos  
* 100 elementos  
* 1000 elementos

Os valores são gerados aleatoriamente.

---

## **📈 Complexidade**

### **Pior caso**

O(n²)

### **Caso médio**

O(n²)

### **Melhor caso**

O(n²) — nesta versão não otimizada, o algoritmo percorre toda a lista mesmo que já esteja ordenada.

---

## **📚 Conceitos demonstrados**

* Algoritmos de ordenação  
* Estruturas de repetição  
* Análise de desempenho  
* Contagem de operações  
* Benchmark simples em Python

---

## **👨‍💻 Autor**

Projeto desenvolvido para fins de estudo de algoritmos e análise de desempenho.

