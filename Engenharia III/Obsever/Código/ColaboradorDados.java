import java.util.ArrayList;
import java.util.List;

public class ColaboradorDados {
    private List<Observer>:observers;
    private colaboradorNome:String
    
    public ColaboradorDados(){
        this.observers = new ArrayList<>();
        this.colaboradorNome = String
    }

    public void setColaboradorNome(String nome){
        this.empresaNome = nome
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    
    public void postColaboradorDados(String nome){
        setColaboradorNome(nome)
        notify(nome)
    }

    public void notify(String nome){
        this.observers.stream().forEach(item -> {
           item.update(nome) ;
        });
    }
    
}