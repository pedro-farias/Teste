package aplication;

import entidades.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Republica {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados?: ");
        int n = sc.nextInt();
        int jota, a = 1, b;
        Aluguel[] teste = new Aluguel[9];
        Aluguel banana = new Aluguel();

        for (jota = 0; jota < n; jota++) {
            sc.nextLine();
            System.out.println("Quarto #" + (a) + ": ");
            System.out.print("Nome: ");
            banana.setNome(sc.nextLine());
            System.out.print("Email: ");
            banana.setEmail(sc.nextLine());
            System.out.print("Numero do quarto: ");
            b = (sc.nextInt());
            teste[b] = new Aluguel(banana.getNome(), banana.getEmail(), b);
            a++;
        }
        for (int i = 0; i < teste.length; i++) {
            if (teste[i] != null) {
                System.out.println(teste[i]);
            }
        }
    }
}

