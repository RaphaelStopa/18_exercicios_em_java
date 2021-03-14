import java.util.Scanner;
//        2) Fazer uma classe para:
//        • Sortear um número de 0 a 1000 (dica: usar Math.random())
//        • Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
//        menor do que o número sorteado.
//        • Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
//        quantas tentativas ele acertou.


public class exer5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero = (Math.random() * 10);

        int numeroArredondado = (int) Math.round(numero);


        int numeroDeTentativas = 0;


        if(numeroDeTentativas == 0) {
            System.out.println("Digite um número: ");
            int numeroEscolhido = entrada.nextInt();
            numeroDeTentativas ++;

            while (numeroEscolhido != numeroArredondado ) {
                System.out.println("Errou. Digite outro número: " + numeroArredondado);
                numeroEscolhido = entrada.nextInt();
                numeroDeTentativas ++;
            }

            System.out.println("Você acertou. O número de tentativas foi: " + numeroDeTentativas);
        }


        entrada.close();
    }
}
