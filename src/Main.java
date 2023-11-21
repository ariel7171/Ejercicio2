import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listaOriginal = List.of("Hola", "Mundo", "Java");

        Transformador transformadorMayusculas = s -> s.toUpperCase();

        List<String> listaTransformada = Transformador.TransformadorDeStrings.transformarLista(listaOriginal, transformadorMayusculas);

        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista Transformada: " + listaTransformada);

    }
}
