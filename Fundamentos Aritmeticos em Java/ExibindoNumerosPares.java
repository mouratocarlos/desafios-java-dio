
import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer numeroInserido = Integer.parseInt(scan.nextLine());

        for(int i=1; i<=numeroInserido; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
