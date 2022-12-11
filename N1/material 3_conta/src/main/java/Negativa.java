public class Negativa implements StadoConta{
    Conta conta;
    public Negativa(Conta c){
        this.conta =c;

    }

    @Override
    public void sacar(float valor) {
        if((conta.getSaldo() - valor) >= -100){
            conta.setSaldo(conta.getSaldo()-valor);
            System.out.println("Voce sacou "+ valor+ ", seu novo saldo é: "+ conta.getSaldo());
        }
        else{
            System.out.println("Conta bloqueada");
            conta.setStado(new Bloqueada(conta));
        }
    }

    @Override
    public void depositar(float valor) {
        conta.setSaldo(conta.getSaldo()+valor);

        if(conta.getSaldo()>=0){
            System.out.println("Parabéns, sua conta está positiva");
            System.out.println("Seu novo saldo é de " + conta.getSaldo());
            conta.setStado(new Positiva(conta));
        }
    }

}