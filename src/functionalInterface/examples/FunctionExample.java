package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    // recebe um argumento T e retorna um resultado R
public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1,2,3,4,5);
    
    Function<Integer, Integer> dobrar = numero -> numero*2; //Integer de entrada -> Integer de saida
    
    //usar a função ppara dobrar todos os numeros no Stream e armazena-los em outra List
    List<Integer> numerosDobrados = numeros.stream()
    .map(dobrar)
    .toList();
    
    numerosDobrados.forEach(System.out::println);
    
}
}
