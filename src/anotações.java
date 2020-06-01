        /*a+=b quer dizer a = a+b
        // a=variavel<=>variavel ? valor verdadeiro : valor falso
        //%f para double     exemplo: (%.3f%n)
        //%s para string
        //%d para inteiro
        //%n quebra de linha
        //Locale.setDefault(Locale.US);
        //.toLowerCase()   <<-- deixa todas as letras minusculas
        //.toUpperCase()   <<-- deixa todas as letras maiusculas
        //.trim()  <<-- tira os espaços nos cantos
        //.substring(2,9)  <<-- começa a string a partir do valor dado e pode ser lido até outro valor
        //.replace('a','x') <<-- substitui alguma letra, no caso as letras "as" por "x"
        //.indexOf() <<-- mostra onde é a primeira ocorrencia do valor dado
        //.lastIndexOf() <<-- mostra onde é a ultima ocorrencia do valor dado
        //.split (" ") <<-- separa em vetores os valores, no caso, a cada espaço ele cria um vetor, 0,1,2..

        TIPO LIST

        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;
        public class Program {
        public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size());
        for (String x : list) {
        System.out.println(x);
        }
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
        System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
        System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

         */

