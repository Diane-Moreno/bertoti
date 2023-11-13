public class Sapato{
    private String nome;
    private String tamanho;
    private double preco;
    
    public Sapato(String nome, String tamanho, double preco){
      this.nome = nome;
      this.tamanho = tamanho;
      this.preco  =  preco;
    }
    
    public String getNome(){
      return this.nome;
    }

    public String getTamanho(){
      return this.tamanho;
    }

    public double getPreco(){
      return this.preco;
    }
    
}