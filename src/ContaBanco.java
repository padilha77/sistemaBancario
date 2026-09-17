public class ContaBanco {

    private String tipo;
    private int numConta;
    private double saldo;
    private String status;


   public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
       this.tipo = tipo;
    }
    public int getNumConta() {
       return this.numConta;
    }
    public void setNumConta(int numConta) {
       this.numConta = numConta;
    }
    public double getSaldo() {
       return this.saldo;
    }
    public void setSaldo(double saldo) {
       this.saldo = saldo;
    }
    //-----------------------------------------------//
    public void statusConta(){
        System.out.println("Conta Corrente: "+this.numConta+" - "+this.saldo);
    }

    public void abrirConta(String tipo){
        this.tipo = tipo;
    }
    public void fecharConta(){
        this.saldo = 0;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void pagarMensal(){
        this.saldo = 0;
    }

}
