package internet;

public class Pagina {

    private String url;
    private int quantidadeAbas;
    
    public Pagina(String url, int quantidadeAbas) {
        this.url = url;
        this.quantidadeAbas = quantidadeAbas;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public int getQuantidadeAbas() {
        return quantidadeAbas;
    }
    public void setQuantidadeAbas(int quantidadeAbas) {
        this.quantidadeAbas = quantidadeAbas;
    }

    public void incrementarAbas() {
        quantidadeAbas++;
    }

}
