package functionalInterface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuplierExemplo {
    //nao aceita argumento e retorna um resultado do tipo T

    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem vindo";

        List<String> listSaudacao = Stream.generate(saudacao)
            .limit(5)
            .collect(Collectors.toList());

            listSaudacao.forEach(n -> System.out.println(n));
    }
}
