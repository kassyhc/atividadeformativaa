package AtividadeFormativa;

public class Principal {
    public static void main(String[] args) {
     
        Usuario usuario1 = new Usuario(1, "Pedro", "1234", 3, "pedro123");
        Usuario usuario2 = new Usuario(1, "Joao", "senha123", 2, "joao123");

        
        System.out.println("Usuário 1: ID - " + usuario1.id + ", Nome - " + usuario1.nome + ", Senha - " + usuario1.password + "Permissão - " + usuario1.permissao );
        System.out.println("Usuário 2: ID - " + usuario2.id + ", Nome - " + usuario2.nome + ", Senha - " + usuario2.password + "Permissão - " + usuario2.permissao);
    }
}
