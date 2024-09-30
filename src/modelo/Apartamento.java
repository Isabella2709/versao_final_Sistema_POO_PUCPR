package modelo;

public class Apartamento extends Financiamento {
    private int numeroVagasGaragem;
    private int numeroAndar;

    public Apartamento(double valordesejadoimovel, int prazoFinanciamentoAnos, double taxadejuros, int numeroVagasGaragem, int numeroAndar) {
        super(valordesejadoimovel, prazoFinanciamentoAnos, taxadejuros);
        this.numeroVagasGaragem = numeroVagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = taxadejuros / 12;
        int meses = prazoFinanciamentoAnos * 12;
        double valorTotal = (valordesejadoimovel * taxaMensal * Math.pow(1 + taxaMensal, meses))
                / (Math.pow(1 + taxaMensal, meses) - 1);
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "número de vagas na garagem=" + numeroVagasGaragem +
                ", número do andar=" + numeroAndar +
                ", " + super.toString() +
                '}';

    }
}

