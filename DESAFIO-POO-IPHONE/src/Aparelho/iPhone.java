package Aparelho;
import multifunctionalDevice.AparelhoTelefonico;
import multifunctionalDevice.NavegadorInternet;
import multifunctionalDevice.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Não estou no momento, pof favor, deixe seu recado após o sinal.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música Selecionada: " + musica);
    }
}