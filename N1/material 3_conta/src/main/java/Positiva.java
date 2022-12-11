public class Positiva implements StadoConta {
    Conta conta;
    public Positiva(Conta c){
        this.conta =c;

    }

    @Override
    public void sacar(float valor) {
        if((conta.getSaldo() - valor) >= -100){
            conta.setSaldo(conta.getSaldo()-valor);
            System.out.println("Voce sacou "+ valor+ ", seu novo saldo é: "+ conta.getSaldo());
        }
        else
            System.out.println("Saldo insuficiente, seu saldo é de: " +conta.getSaldo());
        if(conta.getSaldo() < 0){
            System.out.println("Conta negativada");
            conta.setStado(new Negativa(conta));
        }
    }

    @Override
    public void depositar(float valor) {
        conta.setSaldo(conta.getSaldo()+valor);
        System.out.println("Voce depositou: " +valor+ ", Seu novo saldo é de: " +conta.getSaldo());
    }

}