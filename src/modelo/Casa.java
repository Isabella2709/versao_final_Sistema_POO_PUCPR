package modelo;

import exceptions.DescontoMaiorDoQueJurosException;

public class Casa extends Financiamento {
    private double tamanhoAreaConstruida;
    private double tamanhoTerreno;

    public Casa(double valordesejadoimovel, int prazoFinanciamentoAnos, double taxadejuros, double tamanhoAreaConstruida, double tamanhoTerreno) {
        super(valordesejadoimovel, prazoFinanciamentoAnos, taxadejuros);
        this.tamanhoAreaConstruida = tamanhoAreaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = taxadejuros / 12;
        int meses = prazoFinanciamentoAnos * 12;
        double valorTotal = (valordesejadoimovel * taxaMensal * Math.pow(1 + taxaMensal, meses))
                / (Math.pow(1 + taxaMensal, meses) - 1);
        return valorTotal;
    }

    // Método que calcula o pagamento mensal com desconto e verifica se o desconto é maior que os juros
    public double calcularPagamentoMensalComDesconto(double desconto) throws DescontoMaiorDoQueJurosException {
        double valorTotalSemDesconto = calcularPagamentoMensal();
        double jurosMensal = valordesejadoimovel * (taxadejuros / 12);

        // Lançar exceção se o desconto for maior que os juros
        if (desconto > jurosMensal) {
            throw new DescontoMaiorDoQueJurosException("O valor do desconto não pode ser maior do que os juros da mensalidade.");
        }

        return valorTotalSemDesconto - desconto;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "tamanho da área construída=" + tamanhoAreaConstruida +
                ", tamanho do terreno=" + tamanhoTerreno +
                ", " + super.toString() +
                '}';
    }
}
