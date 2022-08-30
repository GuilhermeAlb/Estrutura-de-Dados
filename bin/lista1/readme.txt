Esse projeto é uma implementação de Lista Duplamente Encadeada
tendo a mim, Guilherme Albuquerque, como autor.

Necessidades do projeto:

1° A lista será criada a partir de nós. Os nós serão objetos que contém
uma variável que guardará uma informação (no meu exemplo usarei uma
variável do tipo inteiro 'int'), terá ponteiros que apontarão para os
nós "proximo na lista" e "anterior na lista". Esses ponteiros serão
objétos também do tipo Nó.

2° Deverá ter os métodos: Inserir (insere um nó no inicio da lista);
Imprimir (imprime a lista nos sentidos do inicio ao final e o oposto);
ListaVazia (mostrará se a lista está vazia com um resultado boolean);
Remove (permitirá que o usuário remova nós da lista);
Busca (será possível realizar a busca das posições dos nós a partir de
seu valor 'info').

3° obs1: O método ‘Remove’ apagará apenas o primeiro nó onde for encontrada
a informação. Em um caso de 2 (dois) nós terem a mesma informação, a função
removerá apenas o primeiro nó encontrado. Ex.: posição 2, info: 7; posição 5,
info 7. O método removerá apenas o nó na posição 2 (dois).

4° Será criada uma Classe Teste executável para testar minha lista.

5° estes vc deve ser capaz de inserir elementos, esvaziar a lista e voltar
a preenchê-la e tentar remover elementos que não estão na lista sem que a
lista seja modificada.