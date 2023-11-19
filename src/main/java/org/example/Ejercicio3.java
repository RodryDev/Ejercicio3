package org.example;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {

//Ejercicio 1
List <String> listaInicio = List.of("Practicando","El","Ejercicio","Uno","Lambdas","Colecciones");

List<String> listaMayusculas = listaInicio.stream()
        .map(frase -> frase.toUpperCase())
        .collect(Collectors.toList());

        System.out.println(listaMayusculas);



    //Ejercicio 2


    List<String> listaNueva = List.of("Practicando","El","Ejercicio","Uno","Lambdas","Colecciones");
    int num = 6;

    String listaConcatena = listaNueva.stream()
            .filter(palabra -> palabra.length() >= num)
            .collect(Collectors.joining(", "));


System.out.println(listaConcatena);

}

}

