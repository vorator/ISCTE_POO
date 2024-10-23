package _6_7;

import java.util.Iterator;

public class Week implements Iterable<String> {
    private static final String[] DAYS_OF_WEEK = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
    private final WeekDayIterator iterator;

    public Week() {
        iterator = new WeekDayIterator();
    }

    public Iterator<String> iterator() {
        return iterator;
    }

    private class WeekDayIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < DAYS_OF_WEEK.length;
        }

        @Override
        public String next() {
            return DAYS_OF_WEEK[index++];
        }
    }
}


/*
Week:
- Possui um atributo iterator do tipo WeekDayIterator.
- O construtor cria um novo WeekDayIterator.
- O método iterator() retorna o iterador para permitir o uso do for-each loop.


WeekDay:
- É um enum que representa os dias da semana.
- O método values() retorna um array com todos os valores do enum.


WeekDayIterator:
- Implementa a interface Iterator para fornecer os dias da semana.
- days: Um array de WeekDay para armazenar todos os dias da semana.
- currentIndex: Um índice para acompanhar a posição atual na iteração.
- hasNext(): Verifica se há mais elementos a serem iterados.
- next(): Retorna o próximo dia da semana e incrementa o índice.


Benefícios da Solução
- Clareza: A estrutura é simples e intuitiva, facilitando a compreensão do código.
- Reusabilidade: A classe Week pode ser utilizada em diversos contextos onde se deseja iterar sobre os dias da semana.
- Extensibilidade: A classe WeekDay pode ser facilmente expandida para incluir outros dias (sábado, domingo) 
  ou informações adicionais sobre cada dia.
- Eficiência: A utilização de um enum e um array torna a iteração eficiente.


Considerações Adicionais
- Personalização: Você pode adicionar métodos à classe Week para obter informações específicas sobre a semana, 
  como o primeiro dia ou o último dia.
- Localização: Para adaptar a aplicação a diferentes localidades, você pode criar uma classe Locale que mapeia 
  os dias da semana para diferentes idiomas.
- Feriados: Se precisar considerar feriados, você pode adicionar um método à classe Week para verificar se um 
  determinado dia é feriado.

*/