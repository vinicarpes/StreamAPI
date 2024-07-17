package functionalInterface.examples;

import java.util.Optional;

public class OptionalExample {
    //evita o NullPointerException(NPE), que força a parada do funcionamento casa alguma variável tenha referencia nula

    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");

        System.out.println(result);
    }
}
