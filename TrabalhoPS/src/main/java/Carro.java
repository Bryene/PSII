
public class Carro extends Veiculo {

    public Carro(final Motor motor) {
        this.pesoEmKilos = 600;
        this.motor = motor;
    }

    @Override
    public void dirigir() {
        System.out.println("\nO carro será pilotado!");
        final int cavalosForca = motor.liga();
        avisarDeAcordoComVelocidade(cavalosForca);
    }
}