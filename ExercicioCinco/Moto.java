package ExercicioCinco;

public class Moto extends Veiculo{
    int cilindradas;

    public Moto(int ano, int chassi, float preco, float SemParar, int cilindradas){
        super(ano,chassi,preco,SemParar);
        this.cilindradas = cilindradas;
    }

    @Override
    public void PagarPedagio(){
        if(this.getSemParar() <= 0){
            System.out.println("Moto sem dinheiro suficiente!");
        }else{
        this.setSemParar(this.getSemParar() - 10);
        System.out.println("Dinheiro: " + this.getSemParar());
        }
    }

    public int getCilindradas(){
        return cilindradas;
    }
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
}