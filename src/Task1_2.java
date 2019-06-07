import java.util.Random;

/*Write a Java program which randomly pick up int from Enum (which has 30 int values) and print it to console.*/
public class Task1_2 {

    private enum IntNumber {
        VAL1(1),
        VAL2(15),
        VAL3(21),
        VAL4(6),
        VAL5(16);

        private int value;
         IntNumber(int value){
        this.value = value;


        }
         private static final IntNumber[] VALUES= values();
         private static final int SIZE = VALUES.length;
         private static final Random RANDOM = new Random();


        public int getValue() {
            return value;
        }

        private static IntNumber getRandomNumber(){
            return VALUES[RANDOM.nextInt(SIZE)];

        }
    }


    public static void main(String[] args){


       int pickUp = IntNumber.getRandomNumber().getValue();

              System.out.println(pickUp);

    }
}

