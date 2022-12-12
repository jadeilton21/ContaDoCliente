public class AtribultosDoCliente {



    private static String nome;
    private static String cpf;
    private static String profissao;


    public AtribultosDoCliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void status2(){
        System.out.println("--> Seu cpf é: " + AtribultosDoCliente.cpf);
        System.out.println("--> Sua profissão é: " + AtribultosDoCliente.profissao);
        System.out.println("--> A confirmação do seu nome: " + getNome());



    }
}
