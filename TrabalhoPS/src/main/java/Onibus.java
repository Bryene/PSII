

public class Onibus extends Veiculo {

    public Onibus(final Motor motor) {
        this.pesoEmKilos = 3000;
        this.motor = motor;
    }

    @Override
    public void dirigir() {
        System.out.println("\nO onibus será pilotado!");
        final int cavalosForca = motor.liga();
        avisarDeAcordoComVelocidade(cavalosForca);
    }

}