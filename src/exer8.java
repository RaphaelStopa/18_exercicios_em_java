import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//        Um dos sistemas de encriptação mais antigos é atribuído a Júlio César: se uma
//        letra a ser encriptada é a letra de número N do alfabeto, substitua-a com a letra
//                (N+K), onde K é um número inteiro constante (César utilizava K = 3).
//        Usualmente consideramos o espaço como zero e todos os cálculos são
//        realizados com módulo-27. Dessa forma, para K = 1 a mensagem “Ataque ao
//        amanhecer” se torna “bubrfabpabnboifdfs”. Faça um programa que receba como
//        entrada uma mensagem e um valor de J e retorne a mensagem criptografada
//        pelo código de César. Fraquezas: apenas 26 chaves possíveis. É possível utilizar
//        conhecimento da linguagem para facilitar a busca.

public class exer8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a mensagem: ");
        String mensagem = entrada.nextLine();

        System.out.println("Digite o valor: ");
        int valor = entrada.nextInt();

//        número para tabela ASCII
        List<Character> sb = new ArrayList<Character>();
        for (char c : mensagem.toCharArray()){

            if ((int)c + valor <= 122) {
                sb.add((char) (((int)c) + valor));
            } else {
                int nova = 122 - 25;

                sb.add((char) ((((int)c) + valor - nova) - nova));
            }
        }

        for( int i = 0; i < sb.size(); i ++) {
            System.out.print(sb.get(i));
        }

        entrada.close();
    }
}
