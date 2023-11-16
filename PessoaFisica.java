package AtividadeFormativa;
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;

    public PessoaFisica(String nome, String cpf, String rg) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}