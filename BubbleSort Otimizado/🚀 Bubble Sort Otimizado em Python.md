# **🚀 Bubble Sort Otimizado em Python**

## **📌 Descrição**

Este projeto apresenta a implementação do **Bubble Sort tradicional** e do **Bubble Sort otimizado** em Python, permitindo comparar o desempenho entre as duas versões.

A versão otimizada adiciona uma verificação para identificar se houve trocas em uma iteração. Caso nenhuma troca ocorra, o algoritmo encerra antecipadamente, evitando comparações desnecessárias.

---

## **🎯 Objetivos**

* Implementar Bubble Sort comum e otimizado  
* Comparar número de comparações entre versões  
* Medir tempo de execução  
* Avaliar desempenho em diferentes cenários de entrada  
* Demonstrar impacto da otimização

---

## **⚙️ Como funciona a otimização**

No Bubble Sort otimizado, é utilizada uma variável (`houve_troca`) que indica se ocorreu alguma troca durante a passagem.

Se nenhuma troca for realizada:  
➡️ A lista já está ordenada  
➡️ O algoritmo é interrompido antes do fim

Isso reduz significativamente o custo em listas ordenadas ou quase ordenadas.

---

## **🧪 Cenários testados**

O código executa testes para diferentes tipos de entrada:

* 🔀 Lista aleatória  
* ✅ Lista já ordenada  
* ⚠️ Lista quase ordenada (uma troca aleatória)

E para diferentes tamanhos:

* 10 elementos  
* 100 elementos  
* 1000 elementos

---

## **📊 Métricas analisadas**

Para cada cenário e tamanho:

* Lista original  
* Lista ordenada (comum e otimizado)  
* Número de comparações  
* Tempo de execução

O tempo é medido com `time.perf_counter()` para maior precisão.

---

## **▶️ Como executar**

Execute o arquivo Python:

python bubble\_sort\_otimizado.py

---

## **📈 Complexidade**

### **Bubble Sort comum**

* Melhor caso: O(n²)  
* Caso médio: O(n²)  
* Pior caso: O(n²)

### **Bubble Sort otimizado**

* Melhor caso: **O(n)** (lista já ordenada)  
* Caso médio: O(n²)  
* Pior caso: O(n²)

---

## **🧠 Principais aprendizados**

* Otimizações simples podem impactar desempenho real  
* Importância da análise por tipo de entrada  
* Benchmark básico de algoritmos  
* Contagem de operações como métrica de análise  
* Diferença entre teoria e comportamento prático

---

## **👨‍💻 Autor**

Projeto desenvolvido para estudo de algoritmos de ordenação e análise de desempenho.

