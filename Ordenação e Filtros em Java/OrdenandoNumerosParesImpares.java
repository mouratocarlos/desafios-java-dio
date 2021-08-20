import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        final Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> listaImpares = new ArrayList<Integer>();
        ArrayList<Integer> listaPares = new ArrayList<Integer>();
        final Integer numeroContador = Integer.parseInt(leitor.nextLine());
        Integer numeroDigitado;

        for(int i=1; i<=numeroContador; i++) {
            numeroDigitado = Integer.parseInt(leitor.nextLine());
            if (numeroDigitado%2 == 0) {
                listaPares.add(numeroDigitado);
            } else {
                listaImpares.add(numeroDigitado);
            }
        }

        Collections.sort(listaPares);
        Collections.sort(listaImpares, Collections.reverseOrder());

        for (int i=0; i<listaPares.size(); i++){
            System.out.println(listaPares.get(i));
        }
        for (int i=0; i<listaImpares.size(); i++) {
            System.out.println(listaImpares.get(i));
        }
    }
}
