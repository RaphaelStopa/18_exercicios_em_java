import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {

//        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por
//        linha, inclusive o X, se for o caso.
//
//        Entrada
//        O arquivo de entrada contém 1 valor inteiro qualquer.
//
//                Saída
//        Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
//
//
//        Exemplo de Entrada	Exemplo de Saída
//        8
//
//        1
//        3
//        5
//        7
//

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        for (int i = 1; i <= num; i = i + 2 ) { //complete seu codigo aqui
            System.out.println(i);
        }
    }
}
