package Project;
import java.util.Scanner;

public class Machine {
    private final ClawStick cs = new ClawStick();
    private final Grab g = new Grab();
    private final Scanner input = new Scanner(System.in);

    public Machine() {
        System.out.println("Claw Machine Start......");
    }

    public void start() {
        while (true){
            System.out.println("1.Move a stick.");
            System.out.println("2.Grab a doll.");
            System.out.println("Choose action: ");
            int action = this.input.nextInt();
            if(action == 1) {
                this.moveStick();
            }else {
                this.grabDoll();
                break;
            }
        }
    }

    public void moveStick() {
        System.out.println("1. Move right.");
        System.out.println("2. Move left.");
        System.out.println("3. Move forward.");
        System.out.println("4. Move backward.");
        System.out.println("Choose action: ");
        int move = this.input.nextInt();
        switch (move) {
            case 1:
                cs.MoveRight();
                break;
            case 2:
                cs.MoveLeft();
                break;
            case 3:
                cs.MoveForward();
                break;
            case 4:
                cs.MoveBackward();
                break;
        }
    }

    public void grabDoll() {
        cs.MoveDown();
        g.Pinch();
        cs.MoveUp();
        cs.MoveToDropZone();
        g.Release();
    }
}