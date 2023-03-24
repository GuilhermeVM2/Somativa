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
        if (numMat % 4 == 0) {
            System.out.println("Você está no time do Chris");
        } else if (numMat % 3 == 0) {
            System.out.println("Você está no time do Greg");
        } else if (numMat % 2 == 0) {
            System.out.println("Você está no time do Caruso");
        } else
            System.out.println("Você está no time do Jerome");
    }

    public void logica3() {
        System.out.println("digite quantos quilos de morango você comprou ex:1,80kg");
        double morango = sc.nextDouble();
        System.out.println("digite quantos quilos de maça você comprou ex:1,80kg");
        double maca = sc.nextDouble();
        System.out.println("digite quantos quilos de banana você comprou ex:1,80kg");
        double banana = sc.nextDouble();
        if (morango + maca + banana > 8) {
            System.out.println(morango * 2.5 + maca * 1.8 + banana * 1.3
                    - ((morango * 2.5 + maca * 1.8 + banana * 1.3) / 100 * 10));
        } else
            System.out.println(morango * 2.5 + maca * 1.8 + banana * 1.3);
    }

    public void logica4() {

        System.out.println("Favor informar seus dados abaixo.");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Sexo M para masculino e F para feminino: (Maiúscula)");
        char sexo = sc.next().charAt(0);

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        System.out.println("Peso: ");
        double peso = sc.nextDouble();

        double pesoIdealM = (72.7 * altura) - 58;
        double pesoIdealF = (62.1 * altura) - 44.7;
        double imc = 0;

        if (sexo == 'M') {
            System.out.println("Seu peso ideal é: " + pesoIdealM + "kg");
            imc = pesoIdealM;
        } else if (sexo == 'F') {
            System.out.println("Seu peso ideal é: " + pesoIdealF + "kg");
            imc = pesoIdealF;
        } else {
            System.out.println("Favor inserir M ou F para que possa ser calculado seu peso ideal.");
        }

        if (peso > pesoIdealM && sexo == 'M') {
            double percaPeso = peso - pesoIdealM;
            System.out.println("Você deverá perder " + percaPeso + "kg para chegar no seu peso ideal.");
        } else if (peso < pesoIdealM && sexo == 'M') {
            double ganhaPeso = pesoIdealM - peso;
            System.out.println("Você deverá ganhar " + ganhaPeso + "kg para chegar no seu peso ideal.");
        } else {
        }

        if (peso > pesoIdealF && sexo == 'F') {
            double percaPeso = peso - pesoIdealF;
            System.out.println("Você deverá perder " + percaPeso + "kg para chegar no seu peso ideal.");
        } else if (peso < pesoIdealF && sexo == 'F') {
            double ganhaPeso = pesoIdealF - peso;
            System.out.println("Você deverá ganhar " + ganhaPeso + "kg para chegar no seu peso ideal.");
        } else {
        }

        double nivel = 0;

        if (imc < 20) {
            System.out.println("Sua Classificação é de Abaixo do Peso");
            System.out.println("ATIVIDADE DIFICIL - Voce precisa ganhar massa muscular ");
            nivel = 3;

        } else if (imc > 20 && imc < 27) {
            System.out.println("Sua Classificação Está Dentro do Normal");
            System.out.println("ATIVIDADE MODERADA - Voce pode melhorar a capacidade em aerobica");
            nivel = 2;

        } else if (imc > 27) {
            System.out.println("Sua Classificação é de Acima do Peso");
            System.out.println("ATIVIDADE LEVE - Voce precisa melhorar a resistencia e perder peso  ");
            nivel = 1;
        }

        int faixaEtaria = 0;
        if (idade > 16 && idade <= 25) {
            System.out.println("Sua faixa etária é : IDADE I");
            faixaEtaria = 1;
        } else if (idade > 25 && idade <= 35) {
            System.out.println("Sua faixa etária é : IDADE II");
            faixaEtaria = 2;
        } else if (idade > 35 && idade <= 45) {
            System.out.println("Sua faixa etária é : IDADE III");
            faixaEtaria = 3;
        } else if (idade > 45 && idade <= 55) {
            System.out.println("Sua faixa etária é : IDADE IV");
            faixaEtaria = 4;
        } else if (idade > 55 && idade <= 65) {
            System.out.println("Sua faixa etária é : IDADE V");
            faixaEtaria = 4;
        } else if (idade > 65) {
            System.out.println("Sua faixa etária é : IDADE VI");
            faixaEtaria = 6;
        } else {
            System.out.println("Coloque uma idade acima de 16 anos.");
        }

        if (nivel == 3 && (faixaEtaria == 2 || faixaEtaria == 3)) {
            System.out.println("Faça Musculação Intensa");
        }
        if (nivel == 2 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4)) {
            System.out.println("Faça Musculação Moderada");
        }
        if (nivel == 1 && (faixaEtaria == 1 || faixaEtaria == 4 || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Musculação leve");
        }
        if (nivel == 3 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4))
            System.out.println("Faça Luta");
        if (nivel == 2 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4
                || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Dança");
        }
        if (nivel == 3 && (faixaEtaria == 4 || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Pilates");
        }
        if (nivel == 2 && (faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4 || faixaEtaria == 5)) {
            System.out.println("Faça Corrida");
        }
        if (nivel == 1 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4
                || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Ioga");
        }
    }

}
