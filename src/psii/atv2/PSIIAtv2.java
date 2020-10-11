package psii.atv2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class PSIIAtv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite a sua idade:");

        try {
            int idade = new Scanner(System.in).nextInt();

            if (idade >= 0 && idade < 16) {
                System.out.println("Voto proibido");
            } else if (idade >= 16 && idade < 18 || idade > 60 && idade <= 150) {
                System.out.println("Voto facultativo");
            } else if (idade >= 18 && idade <= 60) {
                System.out.println("Voto obrigatório");
            } else {
                System.out.println("Inválido");
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        }
    }
}
