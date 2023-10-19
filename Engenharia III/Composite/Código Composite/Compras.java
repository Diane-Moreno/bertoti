public class Compras implements Item {
    private List<Item> itens;
    private double valorTotalTotal;
  
    public Compras() {
      this.itens = new ArrayList<>();
      this.valorTotal = 0.00;
    }
  
    @Override
    public void comprar() {
      System.out.println("Valor total R$"+this.valorTotal);
    }
  
    @Override
    public double getvalorTotal(){
      return this.valorTotalTotal;
    }
  
    public void addItem(Item item) {
      itens.add(item);
      this.valorTotal += item.getvalorTotal();
    }
  
    public void delItem(Item item) {
      itens.remove(item);
      this.valorTotal -= item.getvalorTotal();
    }
  
    public List<Item> getItens() {
      return itens;
    }
  }