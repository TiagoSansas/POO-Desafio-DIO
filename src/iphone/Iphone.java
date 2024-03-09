package iphone;

import reprodutor.ReprodutorMusical;

public class Iphone implements ReprodutorMusical {

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
}
