import iphone.Iphone;

public class App {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    iphone.selecionarMusica();
    iphone.tocar();
    iphone.pausar();

    iphone.atender();
    iphone.ligar();
    iphone.iniciarCorreioVoz();
  }
}
