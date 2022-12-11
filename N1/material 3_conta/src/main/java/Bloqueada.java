public class Bloqueada implements StadoConta {

    Conta conta;
    public Bloqueada(Conta c){
        this.conta =c;
    }

    @Override
    public void sacar(float valor) {
        System.out.println("Conta bloqueada, impossibilitado de realizar saques");
    }

    @Override
    public void depositar(float valor) {
        conta.setSaldo(conta.getSaldo()+valor);
        if (conta.getSaldo()>= -100 && conta.getSaldo() <0) {
            System.out.println("Conta desbloqueada e negativada, seu saldo é de: "+ conta.getSaldo());
            conta.setStado(new Negativa(conta));
        }
        else if (conta.getSaldo() >=0){
            System.out.println("Parabens, conta positiva, seu saldo é de: "+conta.getSaldo());
            conta.setStado(new Positiva(conta));
        }
    }

}