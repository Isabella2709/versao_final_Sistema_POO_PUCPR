package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

    Scanner input = new Scanner(System.in);

    public double pedirValorImovel() {
        double valorImovel = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Digite o valor do imóvel (mínimo 150.000): ");
                valorImovel = input.nextDouble();
                if (valorImovel < 150000) {
                    System.out.println("O valor informado é inválido. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                input.next();
            }
        } while (!entradaValida);

        return valorImovel;
    }

    public double pedirPrazoFinanciamento() {
        double prazoFinanciamento = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Digite o prazo do financiamento (mínimo 36 meses): ");
                prazoFinanciamento = input.nextDouble();
                if (prazoFinanciamento < 36) {
                    System.out.println("O prazo informado é inválido. Tente novamente.");
                } else {
                    entradaValida = true;  // A entrada é válida
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                input.next();
            }
        } while (!entradaValida);

        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJuros = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Digite a taxa de juros anual (mínimo 3.5%): ");
                taxaJuros = input.nextDouble();
                if (taxaJuros < 3.5) {
                    System.out.println("A taxa de juros informada é inválida. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                input.next();
            }
        } while (!entradaValida);

        return taxaJuros;
    }

    public double pedirTamanhoAreaConstruida() {
        double areaConstruida = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Digite o tamanho da área construída (m²): ");
                areaConstruida = input.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                input.next();
            }
        } while (!entradaValida);

        return areaConstruida;
    }

    public double pedirTamanhoTerreno() {
        double tamanhoTerreno = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Digite o tamanho do terreno (m²): ");
                tamanhoTerreno = input.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                input.next();
            }
        } while (!entradaValida);

        return tamanhoTerreno;
    }

    public int pedirNumeroVagasGaragem() {
        int vagasGaragem = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Digite o número de vagas na garagem: ");
                vagasGaragem = input.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                input.next();
            }
        } while (!entradaValida);

        return vagasGaragem;
    }

    public int pedirNumeroAndar() {
        int numeroAndar = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Digite o número do andar: ");
                numeroAndar = input.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                input.next();
            }
        } while (!entradaValida);

        return numeroAndar;
    }

    public String pedirTipoZona() {
        String tipoZona = "";

        try {
            System.out.print("Digite o tipo de zona (residencial/comercial): ");
            input.nextLine();
            tipoZona = input.nextLine();
        } catch (Exception e) {
            System.out.println("Erro inesperado ao ler a zona: " + e.getMessage());
        }

        return tipoZona;
    }
}
