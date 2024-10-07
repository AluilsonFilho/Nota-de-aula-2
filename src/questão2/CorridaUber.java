public class CorridaUber {
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;

    public CorridaUber(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    public double calcularValorCorrida() {
        return (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    public void exibirDetalhesCorrida() {
        double valorFinal = calcularValorCorrida();
        System.out.println("Percurso: " + distancia + " km");
        System.out.println("Tempo de aguardo: " + tempoEspera + " minutos");
        System.out.println("Valor inicial: R$" + tarifaBase);
        System.out.println("Multiplicador de demanda: " + fatorDemanda);
        System.out.println("Custo total da corrida: R$" + valorFinal);
    }
}
