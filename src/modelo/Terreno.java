package modelo;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valordesejadoimovel, int prazoFinanciamentoAnos, double taxadejuros, String tipoZona) {
        super(valordesejadoimovel, prazoFinanciamentoAnos, taxadejuros);
        this.tipoZona = tipoZona;
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
        return "Terreno{" +
                "tipo de zona=" + tipoZona +
                ", " + super.toString() +
                '}';
    }
}
