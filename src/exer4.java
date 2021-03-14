import java.util.Scanner;

//        1) Fazer uma classe Ex1Primos para:
//        • Receber um inteiro N do usuário
//        • Testar se este inteiro é primo ou não e informar

public class exer4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Favor, digitar um número: ");
        int primo = entrada.nextInt();


        boolean isPrimo = true;
        int divisor = 0;
        for (int i = 2; i <= primo; i++) {
            if ( ( (primo % i) == 0) && (i != primo) ) {
                isPrimo = false;
                divisor = i;
                break;
            }
        }
        if (isPrimo) {
            System.out.println( "é primo" );
        } else {
            System.out.println( "Não é primo --> " + divisor );
        }

        entrada.close();
    }
}
