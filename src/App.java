import iphone.Iphone;

public class App {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    iphone.selecionarMusica();
    iphone.tocar();
    iphone.pausar();
    System.out.println("");

    iphone.atender();
    iphone.ligar();
    iphone.iniciarCorreioVoz();
    System.out.println("");

    iphone.exibirPagina();
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
  }
}
