public class ContaBanco {


    private String tipo;
    private int numConta;
    private double saldo;
    private boolean status;

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


    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            setSaldo(50);
        } else if (t == "CP") {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! ");
    }
    public void fecharConta(){
        if (saldo > 0) {
            System.out.println("Conta com dinheiro, retire o dinheiro para fechar!");
        } else if (saldo < 0) {
            System.out.println("Conta negativada!");
        } else {
            setStatus(false);
            System.out.println("Sua conta foi fechada com  sucesso! ");
        }
    }

    public void depositar(double vd) {    //vd = valor depositado
        if (getStatus()) {   //getStatus() = status == true
            setSaldo(getSaldo() + vd);  // setSaldo(getSaldo() + vd) = saldo = saldo + vd
        } else {
            System.out.println("Erro ao depositar!");
        }
    }

    public void sacar(double vs) {  //vs = valor sacado
        if (getStatus()) {
            if (getSaldo() > vs) {
                setSaldo(getSaldo() - vs);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Erro ao sacar!");
        }
    }

    public void pagarMensal(){
        double vm = 0;    //vm = valor mensalidade

        if (tipo == "CC") {
            vm = 12;
        } else if (tipo == "CP") {
            vm = 20;
        }
        if (getStatus()) {     //se status = true
            if (saldo > vm) {
                setSaldo(getSaldo() - vm);
            } else {
                System.out.println("Erro ao pagar!");
            }
        }
    }
}
