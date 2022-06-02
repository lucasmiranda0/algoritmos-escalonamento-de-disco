import java.util.Random;

public class ArrayGenerator {
    
    private int[] arrayWith20Numbers;
    private Random random;

    public ArrayGenerator() {
        arrayWith20Numbers = new int[20];
        random = new Random();
    }

    public int[] generateNumber() {
        int number = 0;
        for(int i = 0; i < arrayWith20Numbers.length; i++) {
            boolean b = true;
            while(b) {
                number = random.nextInt(100 - 0) + 0;
                b = isThisNumberInArray(number);
            }
            arrayWith20Numbers[i] = number;
        }
        return arrayWith20Numbers;
    }

    private boolean isThisNumberInArray(int number) {
        for(int i = 0; i < arrayWith20Numbers.length; i++) {
            if(number == arrayWith20Numbers[i]) {
                return true;
            }
        }
        return false;
    }
}
