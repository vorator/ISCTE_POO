package _6_7;

public class Teste {

	public static void main(String[] args) {
        Week week = new Week();
        for (String day : week) {
            System.out.println(day);
        }
    }
}

/*

Análise do Problema:

- Classe Week: Representará uma semana, contendo uma coleção de dias da semana.

- Classe WeekDayIterator: Será um iterador personalizado para percorrer a coleção de dias da semana dentro da classe Week.

- Objetivo: Iterar sobre os dias da semana de segunda a sexta, imprimindo seus nomes.


Explicação:

Classe Week:
- DAYS_OF_WEEK: Um array estático de strings contendo os nomes dos dias da semana.

- iterator: Um atributo privado do tipo WeekDayIterator para fornecer a implementação do iterador.

- Construtor: Inicializa o iterador.

- iterator(): Retorna o iterador personalizado para a classe Week.


Classe WeekDayIterator:
- index: Um atributo para rastrear a posição atual na iteração.

- hasNext(): Retorna true se ainda houver elementos a serem iterados.

- next(): Retorna o próximo dia da semana e incrementa o índice.


Observações:
- Iterador Personalizado: Criamos um iterador personalizado para controlar a ordem de iteração sobre os dias da semana.

- Array Estático: O array DAYS_OF_WEEK armazena os nomes dos dias de forma eficiente e imutável.

- Encapsulamento: A classe Week encapsula a lógica da iteração, expondo apenas o método iterator().

- Flexibilidade: Essa implementação pode ser facilmente estendida para incluir dias do fim de semana ou outros períodos.

*/