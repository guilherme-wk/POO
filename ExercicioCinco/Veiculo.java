package ExercicioCinco;

public class Veiculo{
    private int ano;
    private int chassi;
    private float preco;
    private float quilometragem;    
    private float SemParar;
    
    public Veiculo(int ano, int chassi, float preco,float SemParar){
        this.ano = ano;
        this.chassi = chassi;
        this.preco = preco;
        this.SemParar = SemParar;
    }

    public void PagarPedagio(){}
    
    public int getAno() {
    return ano;
}

public void setAno(int ano) {
    this.ano = ano;
}

public float getQuilometragem(){
    return quilometragem;
}

public void setQuilometragem(float quilometragem){
    this.quilometragem = quilometragem;
}

public int getChassi() {
    return chassi;
}

public void setChassi(int chassi) {
    this.chassi = chassi;
}

public float getPreco() {
    return preco;
}

public void setPreco(float preco) {
    this.preco = preco;
}

public float getSemParar() {
    return SemParar;
}

public void setSemParar(float SemParar) {
    this.SemParar = SemParar;
}
}