
import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer positivos = 0;
        Double numeroDigitado;

        for(int i=0; i<=5; i++){
            numeroDigitado = Double.parseDouble(scan.nextLine());

            if(numeroDigitado > 0) {
                positivos += 1;
            }
        }

        System.out.printf(positivos + " valores positivos");
    }
}
