public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Telefone telefone;

    public Cliente(String nome, String cpf, String Endereco, String Telefone) {
        this.nome= nome;
        this.endereco= endereco;
        this.cpf= cpf;
        this.telefone= telefone;
    }


}