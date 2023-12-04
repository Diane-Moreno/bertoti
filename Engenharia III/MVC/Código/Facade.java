import java.util.List;

public class Facade {
    private Controller controller;
    private View view;

    public Facade() {
        this.controller = new Controller();
        this.view = new View(controller);
    }

    public List<Sapato> ganharBrinde() {
        return controller.lista();
       
    }

    public List<Sapato> emitir() {
        return controller.lista();
       
    }
}