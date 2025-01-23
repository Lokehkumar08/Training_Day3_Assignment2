package day333;
import java.util.Random;

public class HeadsOrTails {
   
    public String getHeadsOrTails() {
        Random random = new Random();
        int result = random.nextInt(2); 
        return switch (result) {
            case 0 -> "Heads";
            case 1 -> "Tails";
            default -> throw new IllegalStateException("Unexpected value: " + result);
        };
    }
}

