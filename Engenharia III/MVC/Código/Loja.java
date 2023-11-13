import java.util.List;

public class Loja implements Subject{
  private List<Sapato> sapatos;
  private List<Observer> observers;
  
  public void registerObserver(Observer o){
    this.observers.add(o);
  }
  
  public void notifyObservers(List<Sapato> s){
    this.observers.stream().forEach(ob -> {
      System.out.println("Novos sapatos adicionadas:");
      l.stream().forEach(p -> {
        System.out.println(". " + p.getNome());
      });
    });
  }
  
  public void addBolo(Sapato s){
    this.sapatos.add(s);
  }
 
  public Sapato buscarSapato(String nome){
    return this.sapatos.stream().filter(r -> r.getNome().equalsIgnoreCase(nome)).findFirst().get();
  }
}
  