package Somativa;

import java.util.Scanner;

public class logica {
    Scanner sc = new Scanner(System.in);

    public void logica1() {
        System.out.println("Digite o primeiro N°");
        double num1 = sc.nextDouble();
        System.out.println("Digite qual operação deseja 1-Adição 2-Subtração 3-Multiplicação 4-DIvisão");
        int op = sc.nextInt();
        System.out.println("Digite o segundo N°");
        double num2 = sc.nextDouble();
        if (op == 1) {
            System.out.println(num1 + num2);
        } else if (op == 2) {
            System.out.println(num1 - num2);
        } else if (op == 3) {
            System.out.println(num1 * num2);
        } else
            System.out.println(num1 / num2);
    }

    public void logica2() {
        System.out.println("digite seu número de matrícula ex:1234");
        int numMat = sc.nextInt();
        if (numMat%4==0) {
            System.out.println("Você está no time do Chris");
        }
        else if (numMat%3==0) {
            System.out.println("Você está no time do Greg");
        }
        else if (numMat%2==0) {
                System.out.println("Você está no time do Caruso");   
        }
        else
            System.out.println("Você está no time do Jerome");
    }

    public void logica3() {
        System.out.println("digite quantos quilos de morango você comprou ex:1,80kg");
        double morango = sc.nextDouble();
        System.out.println("digite quantos quilos de maça você comprou ex:1,80kg");
        double maca = sc.nextDouble();
        System.out.println("digite quantos quilos de banana você comprou ex:1,80kg");
        double banana= sc.nextDouble();
        if (morango+maca+banana>8 ) {
            System.out.println(morango*2.5+maca*1.8+banana*1.3-((morango*2.5+maca*1.8+banana*1.3)/100*10));
        }
        else
            System.out.println(morango*2.5+maca*1.8+banana*1.3);
    }

}
