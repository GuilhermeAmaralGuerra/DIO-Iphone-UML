package musica;

public class Musica {

    private String musica;
    private int volume;

    public Musica(String musica, int volume) {
        this.musica = musica;
        this.volume = volume;
    }

    public String getMusica() {
        return musica;
    }
    public void setMusica(String musica) {
        this.musica = musica;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

}
