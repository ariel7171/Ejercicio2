import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> listaOriginal = List.of("Hola", "mundO", "java");

        System.out.println("--------------Lista original---------------");
        listaOriginal.stream().forEach(System.out::println);

        System.out.println("--------------Lista Transformada-----------");
        transformador(listaOriginal).stream().forEach(System.out::println);

    }

    public static List<String> transformador(List<String> lista){
        return lista.stream().map(palabra -> palabra.toUpperCase()).collect(Collectors.toList());
    }

}
