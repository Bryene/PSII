
public class Cliente implements Dao{

    private int codigo;
    private String nome;

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inserir() {
        System.out.println("Cliente inserido...");
    }

    public void excluir() {
        System.out.println("Cliente excluido...");
    }

    public void localizar() {
        System.out.println("Cliente localizado...");
    }
}