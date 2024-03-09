package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;

import reprodutor.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

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

  @Override
  public void exibirPagina() {
    System.out.println("EXIBINDO PAGINA");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("ADICIONANDO NOVA ABA");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("ATUALIZAR PAGINA");
  }

}
