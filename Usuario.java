package AtividadeFormativa;
public class Usuario {
   
    public int id;
    public String nome;
    public String password;
    public int permissao;
    public String usuario;

  
    public Usuario() {
        
        this.id = 0;
        this.nome = "";
        this.password = "";
        this.permissao = 0;
        this.usuario = "";
    }

    
    public Usuario(int id, String nome, String password, int permissao, String usuario) {
        this.id = id;
        this.nome = nome;
        this.password = password;
        this.permissao = permissao;
        this.usuario = usuario;
    }
}

