package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    //aceita argumento T e retorna Boolean

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("PYTHON", "JAVA", "KOTLIN", "C", "RUBY");
        
        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;

        palavras.stream()
            .filter(maisDeCincoLetras)
            .forEach(System.out::println);
    
}
}

