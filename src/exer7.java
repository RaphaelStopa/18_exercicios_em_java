import java.util.Scanner;

//        Fazer um programa que receba uma string do usuário e mostre o conteúdo desta
//        string de forma invertida.

public class exer7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu texto");
        String texto = entrada.nextLine();

        System.out.println(new StringBuilder(texto).reverse());

        entrada.close();

    }
}
