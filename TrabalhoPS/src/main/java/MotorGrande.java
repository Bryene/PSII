
public class MotorGrande implements Motor {

    int cavalosForca;

    public MotorGrande() {
        this.cavalosForca = 350;
    }

    @Override
    public int liga() {
        System.out.println("O motor grande está em funcionamento!");
        return cavalosForca;
    }

}