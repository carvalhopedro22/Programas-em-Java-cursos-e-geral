import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<String> list = new ArrayList<>();
    list.add("Maria"); //adiciona na lista
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add(2, "Marco"); //adiciona na posição 2
    System.out.println(list.size()); //tamanho da lista

    for (String x : list) {
        System.out.println(x);
    }
    System.out.println("---------------------");
    list.removeIf(x -> x.charAt(0) == 'M'); //predicado, retorna V ou F. Se for V remove quem tem nome iniciado com M
    
    for (String x : list) {
        System.out.println(x);
    }
    System.out.println("---------------------");
    System.out.println("Index of Bob: " + list.indexOf("Bob")); //encontra a posição do elemento, se não existe retorna -1
    System.out.println("Index of Marco: " + list.indexOf("Marco"));
    System.out.println("---------------------");
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Imprime apenas quem tem o nome iniciado com A
    
    for (String x : result) {
        System.out.println(x);
    }
    System.out.println("---------------------");
    String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); //Nesse caso se o primeiro elemento começa com J. Se for F retorna NULL
    System.out.println(name);

    sc.close();
  }
}