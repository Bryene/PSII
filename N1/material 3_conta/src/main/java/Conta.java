/**
 * Conta
 */
public class Conta {

    private float saldo;
    private StadoConta state;

    public Conta (){
        this.state = new Positiva(this);
    }
    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }
    /**
     * @return the state
     */
    public StadoConta getState() {
        return state;
    }
    /**
     * @param state the state to set
     */
    public void setStado(StadoConta state) {
        this.state = state;
    }
    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(float valor){
        state.sacar(valor);
    }
    public void depositar(float valor){
        state.depositar(valor);
    }
    
}