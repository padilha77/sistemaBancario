import java.util.Scanner;
public class ContaBanco {


    private String tipo;
    private int numConta;
    private double saldo;
    private boolean status;
    private double valorSacado;
    private double valorDepositado;

    // getters, setters e construtores

    public void Construtor() {
        saldo = 0;
        status = false;
    }

    public void setNumConta(int n) {  //setters possuem parametros
        this.numConta = n;
    }
    public int getNumConta() {  //getters nao possuem parametros
        return numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return tipo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    public boolean getStatus() {
        return status;
    }


    /*-------------  métodos  -------------*/


    public void statusConta(){
        System.out.println("Status da conta: " + this.status);
    }

    public void abrirConta() {
        System.out.println("Conta aberta! ");
    }
    public void fecharConta(){
        System.out.println("Conta Fechada! ");
    }

    public void depositar() {
        Scanner usuarioD = new Scanner(System.in);
        System.out.println("Qual valor você quer depositar? ");
        this.valorDepositado = usuarioD.nextDouble();
        System.out.println("Você depositou R$" + this.valorDepositado);
    }

    public void sacar() {
        Scanner usuarioS = new Scanner(System.in);
        System.out.println("Qual valor você quer sacar? ");
        this.valorSacado = usuarioS.nextDouble();
        System.out.println("Você sacou R$" + this.valorSacado);

    }
    public void pagarMensal(){
        this.saldo = 0;
    }


}
