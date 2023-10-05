package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

public static void main(String[] args) {
    
Consumer<String> print = System.out::print;

Stream<String> langs = Stream.of("Java", " Lua", " Js\n"); // usando metodo statico
langs.forEach(print);                           //criando stream usando o stream.of com todos os valores

String[] maisLangs = {"Python", " lisp", " perl", " go\n"}; //usando um array com todo os valores

Stream.of(maisLangs).forEach(print);
Arrays.stream(maisLangs, 1, 3).forEach(print);		

List<String> outraLangs = Arrays.asList("C", " PHP", " KOTLIN\n");
outraLangs.stream().forEach(print);
		




























































}






























}