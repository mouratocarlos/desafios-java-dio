import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        final Scanner leitor = new Scanner(System.in);
        final Integer contador = Integer.parseInt(leitor.nextLine());      
        String[][] listaUniformes = new String[contador][3]; 
        String[] separaValores;
        String recebeNome;
        String recebeCamiseta;

        for (int i=1; i<=contador; i++) {
            recebeNome = leitor.nextLine();
            recebeCamiseta = leitor.nextLine();
            separaValores = recebeCamiseta.split(" ");
            for (int c=0; c<=2; c++) {
                if (c==0) {
                    listaUniformes[i-1][c] = separaValores[0];
                } else if (c==1) {
                    listaUniformes[i-1][c] = separaValores[1];
                } else if (c==2) {
                    listaUniformes[i-1][c] = recebeNome;
                }
            }
        }

        Arrays.sort(listaUniformes, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String time1 = entry1[2];
                final String time2 = entry2[2];
                return time1.compareTo(time2);
            }
        });

        Arrays.sort(listaUniformes, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String time1 = entry1[1];
                final String time2 = entry2[1];
                return time2.compareTo(time1);
            }
        });

        Arrays.sort(listaUniformes, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String time1 = entry1[0];
                final String time2 = entry2[0];
                return time1.compareTo(time2);
            }
        });

        for (int i=1; i<=contador; i++) {
            for (int c=0; c<=2; c++) {
                if (c==2) {
                    System.out.print(listaUniformes[i-1][c]);
                } else {
                    System.out.print(listaUniformes[i-1][c]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        leitor.close();
    }
}
