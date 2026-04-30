package ExercicioCinco;

public class Carro extends Veiculo{
    Radio frequencia = new Radio("FM");
    Radio amplitude = new Radio("AM");
    boolean automatico;

    public Carro(int ano, int chassi, float preco, float SemParar, boolean automatico){
        super(ano, chassi, preco, SemParar);
        this.automatico = automatico;
    }

    @Override
    public void PagarPedagio(){
        if(this.getSemParar() <= 0){
            System.out.println("Carro sem dinheiro suficiente!");
        }else{
        this.setSemParar(this.getSemParar() - 20);
        System.out.println("Dinheiro: " + this.getSemParar());
        }
    }

    public boolean getAutomatico(){
        return automatico;
    }
    public void setAutomatico(boolean automatico){
        this.automatico = automatico;
    }
}