import internet.Pagina;
import iphone.Iphone;
import musica.Musica;
import telefone.Contato;

public class Main {
    public static void main(String[] args) {
        Pagina pagina = new Pagina("www.dio.com.br", 0);
        Musica musica = new Musica("Soldier", 5);
        Contato contato = new Contato("9 9999-9999", "Guilherme");
        Iphone iphone = new Iphone(pagina);

        iphone.ligar(contato.getNumero());
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina(pagina.getUrl());
        iphone.adicionarNovaAba();
        iphone.atualizarAba();

        iphone.selecionarMusica(musica.getMusica());
        iphone.tocar();
        iphone.pausar();
    }
}
