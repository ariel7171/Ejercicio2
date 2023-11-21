import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Transformador {
    String transformar(String input);

    public class TransformadorDeStrings {

        public static List<String> transformarLista(List<String> lista, Transformador transformador) {

            List<String> resultado = new ArrayList<>();

            for (String elemento : lista) {
                String elementoTransformado = transformador.transformar(elemento);
                resultado.add(elementoTransformado);
            }

            return resultado;
        }
    }
}
