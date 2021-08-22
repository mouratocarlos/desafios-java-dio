import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        final Scanner leitor = new Scanner(System.in);
        final Integer contador = Integer.parseInt(leitor.nextLine());
        ArrayList<Integer> filaBanco = new ArrayList<Integer>();
        ArrayList<Integer> filaOrdenada = new ArrayList<Integer>();

        for (int i=1; i<=contador; i++) {
            String recebeValor;
            String[] separaValor;
            Integer naoTrocouDeLugar = 0;
            Integer quantidadePessoas = Integer.parseInt(leitor.nextLine());
            recebeValor = leitor.nextLine();
            separaValor = recebeValor.split(" ");

            for (int c=0; c<quantidadePessoas; c++) {
                filaBanco.add(Integer.parseInt(separaValor[c]));
                filaOrdenada.add(Integer.parseInt(separaValor[c]));
            }

            Collections.sort(filaBanco, Collections.reverseOrder());            

            for (int c=0; c<quantidadePessoas; c++) {
                if (filaOrdenada.get(c) == filaBanco.get(c)) {
                    naoTrocouDeLugar += 1;
                }
            }

            System.out.println(naoTrocouDeLugar);
            filaBanco.clear();
            filaOrdenada.clear();
        }

        leitor.close();
    }
}
