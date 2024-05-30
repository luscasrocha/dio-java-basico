import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar(String numero){}
    public void atender(){}
    public void iniciarCorreioVoz(){}

    public void exibirPagina(String url){}
    public void adicionarNovaAba(){}
    public void atualizarPagina(){}

    public void tocar(){}
    public void pausar(){}
    public void selecionarMusica(String musica){}

}
