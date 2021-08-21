import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        LinkedHashSet<String> listaSemRepetidos = new LinkedHashSet<>();
        ArrayList<String> listaCompras = new ArrayList<>();
        String[] separaValores;
        String recebeValores;
        String recebeTodoOValor;

        final Integer contador = Integer.parseInt(leitor.nextLine());

        for (int i=1; i<=contador; i++) {
            recebeValores = leitor.nextLine();
            separaValores = recebeValores.split(" ");

            for (int c=0; c<separaValores.length; c++) {
                listaSemRepetidos.add(separaValores[c]);
            }

            ArrayList<String> listaAlfabetica = new ArrayList<>(listaSemRepetidos);
            Collections.sort(listaAlfabetica);

            recebeTodoOValor = listaAlfabetica.toString();
            listaCompras.add(recebeTodoOValor);
            listaSemRepetidos.clear();
        }

        for (int i=0; i<listaCompras.size(); i++) {
            String listaComprasString = listaCompras.get(i).toString();
            String lista = listaComprasString.replaceAll("[\\[\\]\\,]", "");
            System.out.println(lista);
        }

        leitor.close();
    }
}
