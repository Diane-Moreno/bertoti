import java.util.List;

public class View implements Observer{
  private Brinde brinde;
  private List<Sapato> sapatos;
  
  public void setBrinde(Brinde b){
    this.brinde = b;
  }
  
  public void update(List<Sapato> s){
    this.sapatos = s;
  }
  
}