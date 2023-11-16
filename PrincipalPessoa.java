package AtividadeFormativa;

public class PrincipalPessoa {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("João", "123.456.789-01", "98765432");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("CPF: " + pessoa1.getCpf());
        System.out.println("RG: " + pessoa1.getRg());
    }
}
