public class Main {
    public static void main(String[] args) {

        ContaBanco pessoa1 = new ContaBanco();
        ContaBanco pessoa2 = new ContaBanco();

        System.out.println("Pessoa 1: ");
        pessoa1.abrirConta("CC");
        pessoa1.setNumConta(12345);
        pessoa1.depositar(500);
        pessoa1.sacar(70);

        System.out.println("Pessoa 2: ");
        pessoa2.abrirConta("CP");
        pessoa2.setNumConta(54321);
        pessoa2.depositar(500);
        pessoa2.sacar(60);
        pessoa2.fecharConta();
        pessoa2.sacar(590);
        pessoa2.fecharConta();


        pessoa1.statusAtual();
        System.out.println("-------------------");
        pessoa2.statusAtual();
    }

}