package modelo;

public abstract class Financiamento {
    protected double valordesejadoimovel;
    protected int prazoFinanciamentoAnos;
    protected double taxadejuros;

    public Financiamento(double valordesejadoimovel, int prazoFinanciamentoAnos, double taxadejuros) {
        this.valordesejadoimovel = valordesejadoimovel;
        this.prazoFinanciamentoAnos = prazoFinanciamentoAnos;
        this.taxadejuros = taxadejuros;
    }


    public abstract double calcularPagamentoMensal();


    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamentoAnos * 12;
    }

    public void mostraDados() {
        System.out.println("Valor do imóvel: " + valordesejadoimovel);
        System.out.println("Prazo de financiamento (anos): " + prazoFinanciamentoAnos);
        System.out.println("Taxa de juros anual: " + taxadejuros);
        System.out.println("Pagamento mensal: " + calcularPagamentoMensal());
        System.out.println("Total do financiamento: " + calcularTotalPagamento());
    }

    @Override
    public String toString() {
        return "Financiamento{" +
                "valor do imóvel=" + valordesejadoimovel +
                ", prazo de financiamento=" + prazoFinanciamentoAnos +
                ", taxa de juros=" + taxadejuros +
                '}';

    }
}
