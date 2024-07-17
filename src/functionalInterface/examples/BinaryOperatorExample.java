package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        //combina dois argumentos T e retorn T
        List<Integer> numeros = Arrays.asList(1,2,3,4);

        BinaryOperator<Integer> somar =(num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
            .reduce(0, somar);

        System.out.println("A soma dos números é " + resultado);

    }
}
