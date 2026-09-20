public class ContaBanco {


    private String tipo;
    private int numConta;
    private String dono;
    private double saldo;
    private boolean status;

    // getters, setters e construtores

    public void Construtor() {   //toda conta aberta começara com 0 de saldo
        this.saldo = 0;
        this.status = false;
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


    /*-------------  métodos simples  -------------*/

    public void statusAtual() {
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

    public void setDono(String d) {
        this.dono = d;
    }
    public String getDono() {
        return dono;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {     // aqui posso usar o .equals
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! ");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, retire o dinheiro para fechar!");
        } else if (this.getSaldo() < 0) {
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
            if (getSaldo() >= vs) {
                this.setSaldo(this.getSaldo() - vs);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Erro ao sacar, conta fechada!");
        }
    }

    public void pagarMensal(){
        double vm = 0;    // variavel local / vm = valor mensalidade

        if (this.tipo == "CC") {  // aqui posso usar o .equals
            vm = 12;
        } else if (this.tipo == "CP") {
            vm = 20;
        }
        if (this.getStatus()) {     //se status = true
            if (getSaldo() > vm) {
                this.setSaldo(this.getSaldo() - vm);
                System.out.println("Mensalidade paga com sucesso!");
            } else {
                System.out.println("Erro ao pagar mensalidade!");
            }
        }
    }
}

