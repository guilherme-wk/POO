package ExercicioCinco;

public class Caminhao extends Veiculo{
    int CapacidadeTotal;
    int CapacidadeAtual;

    public Caminhao(int ano, int chassi, float preco, float SemParar, int CapacidadeTotal){
        super(ano,chassi,preco,SemParar);
        this.CapacidadeTotal = CapacidadeTotal;
        this.CapacidadeAtual =  0;
    }

    @Override
    public void PagarPedagio(){
        if(this.getSemParar() <= 0){
            System.out.println("Caminhao sem dinheiro suficiente!");
        }else{
        this.setSemParar(this.getSemParar() - 40);
        System.out.println("Dinheiro: " + this.getSemParar());
        }
    }

    public int getCapacidadeTotal() {
        return this.CapacidadeTotal;
    }

    public int getCapacidadeAtual() {
        return this.CapacidadeAtual;
    }

    public void setCapacidadeAtual(int CapacidadeAtual) {
    if (CapacidadeAtual > CapacidadeTotal) {
        System.out.println("Carga excedida!");
    } else {
        this.CapacidadeAtual = CapacidadeAtual;
    }
}
}