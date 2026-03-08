# **Selection Sort Visual (Java)**

Este projeto implementa o algoritmo de ordenação **Selection Sort** em Java com **visualização passo a passo no console**.  
O objetivo é facilitar o entendimento do funcionamento do algoritmo, mostrando cada comparação, troca e o estado atual do vetor durante a execução.

## **📌 Descrição**

O programa percorre um vetor de números inteiros e aplica o algoritmo **Selection Sort**, que funciona selecionando repetidamente o **menor elemento da parte não ordenada do vetor** e colocando-o na posição correta.

Durante a execução, o sistema imprime no console:

* O vetor inicial  
* Cada iteração do algoritmo  
* As comparações realizadas  
* Quando um novo menor valor é encontrado  
* Quando ocorre uma troca de elementos  
* O estado atual do vetor após cada passo  
* O vetor final ordenado

Esse tipo de visualização é útil para **estudo de Estruturas de Dados e Algoritmos de Ordenação**.

---

## **⚙️ Algoritmo Selection Sort**

O **Selection Sort** funciona da seguinte maneira:

1. Assume que o primeiro elemento é o menor.  
2. Percorre o restante do vetor procurando um valor menor.  
3. Caso encontre, atualiza a posição do menor valor.  
4. Ao final da busca, troca o menor valor encontrado com a posição atual.  
5. Repete o processo para a próxima posição.

### **Complexidade**

| Caso | Complexidade |
| ----- | ----- |
| Melhor caso | O(n²) |
| Caso médio | O(n²) |
| Pior caso | O(n²) |
| Espaço | O(1) |

O algoritmo não é eficiente para grandes volumes de dados, mas é **simples e didático para aprendizado**.

---

## **🖥️ Exemplo de Execução**

Vetor utilizado no código:

\[64, 25, 12, 22, 11\]

Saída simplificada no console:

Vetor inicial: \[64, 25, 12, 22, 11\]

Iteracao 1  
Assumindo menor valor na posicao 0: 64  
Comparando 25 com 64  
Novo menor encontrado: 25  
Comparando 12 com 25  
Novo menor encontrado: 12  
Comparando 22 com 12  
Comparando 11 com 12  
Novo menor encontrado: 11  
Trocando 64 pelo 11

Estado atual do vetor: \[11, 25, 12, 22, 64\]

Ao final:

Vetor ordenado: \[11, 12, 22, 25, 64\]

---

## **📂 Estrutura do Projeto**

selectionsortvisual  
│  
└── SelectionSortVisual.java

---

## **▶️ Como Executar**

### **1️⃣ Clonar ou baixar o projeto**

git clone \<url-do-repositorio\>

ou baixar os arquivos manualmente.

---

### **2️⃣ Compilar o código**

No terminal:

javac SelectionSortVisual.java

---

### **3️⃣ Executar o programa**

java SelectionSortVisual

---

## **🧑‍💻 Autor**

**Diego José da Silva**  
Estudante de Sistemas de Informação  
IFTM \- Campus Patrocínio

---

## **🎯 Objetivo Educacional**

Este projeto foi desenvolvido para **demonstrar de forma visual o funcionamento do algoritmo Selection Sort**, auxiliando estudantes no aprendizado de:

* Estruturas de Dados  
* Algoritmos de Ordenação  
* Lógica de Programação  
* Programação em Java