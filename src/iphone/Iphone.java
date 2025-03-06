package iphone;

import internet.NavegadorInternet;
import internet.Pagina;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    private Pagina pagina;

    public Iphone(Pagina pagina) {
        this.pagina = pagina;
    }

    @Override
    public void ligar(String numero){
        System.out.println("Ligado para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligacao...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correrio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        pagina.incrementarAbas();
        System.out.println("adicionando nova aba..., quantidade: " + pagina.getQuantidadeAbas());
    }

    @Override
    public void atualizarAba() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("pausando musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar musica: " + musica);
    }

}
