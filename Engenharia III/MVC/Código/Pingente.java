public class Pingente implements Brinde{
  private View view;
  private Loja loja;
  
  public void ganharBrinde(){
    System.out.println("Você ganhou um Pingente ao comprar um sapato!");
  }
  
  public void setView(View v){
    this.view = v;
  }
  
}