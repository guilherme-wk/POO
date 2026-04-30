package ExercicioCinco;

public class Radio{
    private String estacao;
    private int canal;
    private int volume;

    public Radio(String estacao){
        this.estacao = estacao;
        if(estacao.equals("AM")){
            this.canal = 20;
        }
        if(estacao.equals("FM")){
            this.canal = 80;
        }
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume(){
        return volume;
    }

    public int DiminuirVolume(){
        if(volume - 10 < 0){
            volume = 0;
        }else{
        volume -= 10;
        }
        return volume;
    }
        public int AumentarVolume(){
        if(volume + 10 > 100){
            volume = 100;
        }else{
            volume += 10;
        }
        return volume;
    }

    public String getEstacao() {
    return estacao;
}

public void setEstacao(String estacao) {
    this.estacao = estacao;
}

public void setCanal(int canal) {
    this.canal = canal;
}

public void setVolume(int volume) {
    this.volume = volume;
}
}