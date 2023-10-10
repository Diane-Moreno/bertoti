public class Cliente {

    private String pagamentoDescricao;
    private Fatura fatura;

    public Cliente(String descricao, Fatura fatura) {
        this.pagamentoDescricao = descricao;
        this.fatura = fatura;
    }

    public String getPagamentoDescricao() {
        return pagamentoDescricao;
    }

    public void pagar() {
        fatura.pagar()
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}