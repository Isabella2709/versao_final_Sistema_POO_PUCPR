package main;

import modelo.Casa;
import modelo.Apartamento;
import modelo.Terreno;
import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Financiamento> listaDeFinanciamento = new ArrayList<>();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        System.out.println("Bem-vindo ao sistema de financiamento!");


        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = (int) interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJuros = interfaceUsuario.pedirTaxaJuros();


        System.out.println("Escolha o tipo de financiamento: ");
        System.out.println("1 - Casa");
        System.out.println("2 - Apartamento");
        System.out.println("3 - Terreno");
        int escolha = input.nextInt();

        Financiamento financiamento = null;

        switch (escolha) {
            case 1:

                System.out.print("Digite o tamanho da área construída: ");
                double tamanhoAreaConstruida = input.nextDouble();
                System.out.print("Digite o tamanho do terreno: ");
                double tamanhoTerreno = input.nextDouble();
                financiamento = new Casa(valorImovel, prazoFinanciamento, taxaJuros, tamanhoAreaConstruida, tamanhoTerreno);
                break;

            case 2:

                System.out.print("Digite o número de vagas na garagem: ");
                int numeroVagasGaragem = input.nextInt();
                System.out.print("Digite o número do andar: ");
                int numeroAndar = input.nextInt();
                financiamento = new Apartamento(valorImovel, prazoFinanciamento, taxaJuros, numeroVagasGaragem, numeroAndar);
                break;

            case 3:

                System.out.print("Digite o tipo de zona (residencial/comercial): ");
                input.nextLine(); // Limpar o buffer
                String tipoZona = input.nextLine();
                financiamento = new Terreno(valorImovel, prazoFinanciamento, taxaJuros, tipoZona);
                break;

            default:
                System.out.println("Opção inválida!");
                return; // Saída do programa se a opção for inválida
        }


        financiamento.mostraDados();


        listaDeFinanciamento.add(financiamento);


        System.out.println("\nLista de financiamentos cadastrados:");
        for (Financiamento f : listaDeFinanciamento) {
            System.out.println(f);
        }


        input.close();
    }
}
