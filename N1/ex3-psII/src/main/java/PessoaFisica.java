
public class PessoaFisica extends Pessoa{

    private String RG;

    public PessoaFisica(String RG, String nome) {
        super(nome);
        this.RG = RG;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double calcularIR(double salario) {
        double faixa0 = 0, faixa10 = 0, faixa20 = 0, faixa27 = 0;
        if(salario > 1500) {
            faixa10 = (3000 - 1500) * 0.10;
        }
        if(salario > 3000) {
            faixa20 = (10000 - 3000) * 0.20;
        }
        if(salario > 10000) {
            faixa27 = (salario - 10000) * 0.27;
        }
        return faixa0 + faixa10 + faixa20 + faixa27;
    }

}