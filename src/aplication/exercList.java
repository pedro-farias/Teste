package aplication;

import entidades.Funcionario;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercList {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //parte 1 - Lendo os dados:
        int n;
        System.out.print("Quantos empregados serão registrados?: ");
        n = sc.nextInt();
        List<Funcionario> list = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            System.out.println("Empregado: #" + i);
            System.out.println("Id: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Nome: ");
            String nome=sc.nextLine();
            System.out.print("Salario: ");
            double salario=sc.nextDouble();
            list.add(new Funcionario(id,nome,salario));
        }
        // Parte 2 - Mudando o salario do funcionario escolhido:
        System.out.println();
        System.out.print("Coloque o id do funcionario que terá o salario aumentado: ");
        int id=sc.nextInt();
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp==null){
            System.out.println("Esse id não existe!");
        }else{
            System.out.println("Coloque a porcentagem");
            double porcentagem=sc.nextDouble();
            emp.aumentoSalarial(porcentagem);
        }
        //Parte 3 - Listando os funcionarios:

        System.out.println();
        System.out.println("Lista dos funcionarios:");
        for(Funcionario obj:list){
            System.out.println(obj);
        }
        }
    }


