
public class Main{

    public static void main(String[] args) {

        Veiculo veiculo = new Onibus(new MotorPequeno());
        veiculo.dirigir();
        veiculo.colocaMotor(new MotorGrande());
        veiculo.dirigir();

        veiculo = new Carro(new MotorPequeno());
        veiculo.dirigir();
        veiculo.colocaMotor(new MotorPequeno());
        veiculo.dirigir();

    }

}