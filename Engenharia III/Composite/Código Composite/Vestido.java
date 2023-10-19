public class Vestido implements Produto {
    private String nome;
    private double valor;
    private String tamanho;
  
    public Vestido(String nome, double valor, String tamanho) {
      this.nome = nome;
      this.valor = valor;
      this.tamanho = tamanho;
    }
  
  public void setVestido(String nome, double valor, String tamanho){
      this.nome = nome;
      this.valor = valor;
      this.tamanho = tamanho;
  }
  
    public double getValor() {
      return this.valor;
    }
  
    @Override
    public void comprar() {
        System.out.println("Comprando vestido " + this.nome + "valor:  " + this.valor);
    }
  }