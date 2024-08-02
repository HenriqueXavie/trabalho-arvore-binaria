#### Gerenciador de Árvores Binárias de Busca ####

Este projeto implementa um gerenciador para o ciclo de vida de uma árvore binária de busca (BST - Binary Search Tree) de valores inteiros. O programa permite inserir, excluir, buscar e listar elementos da árvore, utilizando comandos lidos de um arquivo de entrada.

#### Estrutura do Projeto ####

O projeto é composto por três classes principais:

1.	GerenciadorArvore: Responsável por ler os comandos do arquivo de entrada e executar as operações correspondentes na árvore binária.
2.	ArvoreBinaria: Implementa as operações básicas de uma árvore binária de busca, incluindo inserção, exclusão, busca e listagem de elementos.
3.	No: Representa os nós da árvore binária, armazenando um valor e referências para os filhos à esquerda e à direita.
   
#### Funcionalidades ####

#### Leitura de Comandos ####
1.	Arquivo de Entrada: O programa lê comandos de um arquivo de texto, especificando as operações a serem realizadas na árvore binária. Cada linha do arquivo contém um comando, como "INCLUIR", "EXCLUIR", "IMPRIME" ou "BUSCA", seguido pelo valor ou tipo de listagem.
2.	Terminação: A leitura termina quando o comando "FIM" é encontrado.

#### Criação da Árvore Binária #### 
1. Inicialização: Inicialmente, a árvore é vazia.
2. Instância: A classe de gerenciamento cria uma instância da árvore binária para executar os comandos lidos do arquivo.
  	
#### Inserção de Elementos ####
1. Comando: "INCLUIR valor".
2. Descrição: Adiciona um novo valor à árvore binária, respeitando a propriedade da árvore binária de busca:
          o	Valores menores que o nó atual são inseridos à esquerda.
          o	Valores maiores são inseridos à direita.
          o	Se a árvore estiver vazia, o valor é adicionado como a raiz.
          
#### Exclusão de Elementos ####
1. Comando: "EXCLUIR valor".
2. Descrição: Remove um valor específico da árvore binária, considerando três casos principais:
            o	O nó a ser removido não tem filhos (é uma folha).
            o	O nó a ser removido tem apenas um filho.
            o	O nó a ser removido tem dois filhos, onde o menor valor da subárvore direita substitui o valor do nó removido.
            
#### Busca de Elementos ####
1. Comando: "BUSCA valor".
2. Descrição: Verifica se um valor está presente na árvore binária, utilizando a propriedade de ordenação para localizar o valor de forma eficiente.
    
#### Listagem de Elementos ####
1. Comandos: "IMPRIME PREORDEM", "IMPRIME EMORDEM", "IMPRIME POSORDEM".
2. Descrição: Lista os elementos da árvore em diferentes ordens de travessia:
              o	Pré-ordem: Visita a raiz, a subárvore esquerda e a subárvore direita.
              o	Em ordem: Visita a subárvore esquerda, a raiz e a subárvore direita.
              o	Pós-ordem: Visita a subárvore esquerda, a subárvore direita e a raiz.
                                        
#### Exemplo de Arquivo de Entrada ####
    INCLUIR 10 
    INCLUIR 9 
    INCLUIR 8 
    INCLUIR 5 
    INCLUIR 4 
    IMPRIME PREORDEM 
    EXCLUIR 8 
    IMPRIME POSORDEM 
    IMPRIME EMORDEM 
    FIM

#### Saída Esperada ####
1. Inserção: Valores 10, 9, 8, 5 e 4 são inseridos na árvore.
2. Impressão em Pré-ordem: Lista os elementos na ordem: 10, 9, 8, 5, 4.
3. Exclusão: Valor 8 é removido da árvore.
4. Impressão em Pós-ordem: Lista os elementos na ordem: 4, 5, 9, 10.
5. Impressão em Ordem: Lista os elementos na ordem: 4, 5, 9, 10.

#### Considerações Finais####
Este projeto oferece uma maneira eficiente de gerenciar uma árvore binária de busca, permitindo operações rápidas de inserção, exclusão e busca. A leitura de comandos a partir de um arquivo proporciona flexibilidade e facilita a automação de testes e operações. A implementação modular e bem documentada garante a clareza e a manutenção do código.

#### Como Executar ####
1.	Clone este repositório.
2.	Compile e execute a classe GerenciadorArvore, fornecendo o caminho do arquivo de entrada contendo os comandos.
    javac GerenciadorArvore.java
    java GerenciadorArvore

#### Contribuições ####
Contribuições são bem-vindas! 
Sinta-se à vontade para abrir issues e pull requests para melhorias ou correções de bugs.


