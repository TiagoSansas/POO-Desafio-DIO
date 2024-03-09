package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import reprodutor.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico {

  @Override
  public void tocar() {
    System.out.println("TOCAR MUSICA");
  }

  @Override
  public void pausar() {

    System.out.println("PAUSAR MUSICA");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("SELECIONANDO MUSICA");
  }

  @Override
  public void ligar() {
    System.out.println("LIGANDO");
  }

  @Override
  public void atender() {
    System.out.println("ATENDER");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("INCIANDO CORREIO DE VOZ");
  }
}
