public class ContaDoCliente {

    private static String titular;
    private static int numero;
    private static int agenica;
    private static float saldo;


    public ContaDoCliente(String titular, int numero, int agenica, float saldo) {
        this.titular = titular;
        this.numero = numero;
        this.agenica = agenica;
        this.saldo = saldo ;
    }

    public void deposito(double valor){
        this.saldo += valor;


    }
    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }

    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgenica() {
        return agenica;
    }

    public float getSaldo() {
        return saldo;
    }

    public void status(){

        System.out.println("--> Sua Agencia é: " + ContaDoCliente.agenica);
        System.out.println("--> Seu número é: " + ContaDoCliente.numero);
        System.out.println("--> Seu nome é: " + getTitular());
        System.out.println("--> Seu saldo é: " + getSaldo());

    }
}
