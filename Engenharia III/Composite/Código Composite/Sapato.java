public class Sapato implements Produto {
  private String nome;
  private double valor;
  private String tamanho;

  public Sapato(String nome, double valor, String tamanho) {
    this.nome = nome;
    this.valor = valor;
    this.tamanho = tamanho;
  }

public void setSapato(String nome, double valor, String tamanho){
    this.nome = nome;
    this.valor = valor;
    this.tamanho = tamanho;
}

  public double getValor() {
    return this.valor;
  }

  @Override
  public void comprar() {
      System.out.println("Comprando sapato " + this.nome + "valor:  " + this.valor);
  }
}