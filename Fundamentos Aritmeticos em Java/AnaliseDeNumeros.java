
import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer pares = 0;
        Integer impares = 0;
        Integer positivos = 0;
        Integer negativos = 0;
        Integer numeroDigitado;

        for (int i=1; i<=5; i++) {
            numeroDigitado = Integer.parseInt(scan.nextLine());

            if (numeroDigitado > 0){
                positivos+=1;
            }
            else if (numeroDigitado < 0) {
                negativos+=1;
            }

            if (numeroDigitado%2==0){
                pares+=1;
            }
            else{
                impares+=1;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}
