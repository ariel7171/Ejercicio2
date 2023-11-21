import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<String> listaOriginal = List.of("Hola", "Mundo", "Java");

        System.out.println("--------------Lista original---------------");
        listaOriginal.stream().forEach(System.out::println);

        System.out.println("--------------Lista Transformada-----------");
        listaOriginal.stream().map(palabra -> palabra.toUpperCase()).forEach(System.out::println);

    }
}
