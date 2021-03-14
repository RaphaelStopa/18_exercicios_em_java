import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//        3) Faça um programa que receba um nome completo na forma de uma String e
//        mostre a abreviatura deste nome. Não se devem abreviar as palavras com 2 ou
//        menos letras. A abreviatura deve vir separada por pontos. Ex: Paulo Jose de
//        Almeida Prado. Abreviatura: P. J. de A. P.

public class exer6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();

        String[] textoSeparado = nome.split(" ");
        List<String> myList = new ArrayList<String>();

        for( int i = 0; i < textoSeparado.length; i ++){

            myList.add(textoSeparado[i].substring(0, 1));
        }

        System.out.println( String.join(". ", myList) + ".");

        entrada.close();

    }
}
