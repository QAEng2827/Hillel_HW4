

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

    public class HappyNumbers {

        public static void main(String[] args) {

            HappyNumbers hn = new HappyNumbers();
           File file = new File(args[1]);
            BufferedReader br;
            String[] numbers;
            try {
                // Read in file
                br = new BufferedReader(new FileReader(file));
                String line;
                // Store each line as a string in an array
                while ((line = br.readLine()) != null) {
                    numbers = line.split("\n");
                    for (int i = 0; i < numbers.length; i++) {
                        if (hn.isHappy(numbers[i])) {
                            System.out.println(1);
                        } else {
                            System.out.println(0);
                        }
                    }
                }
                System.exit(0);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.exit(-1);
            }
        }

        // Separates digits, squares them and adds them together
        public boolean isHappy(String str) {

            int sum = 0;
            // Holds numbers after they are squared and added together
            ArrayList<Integer> happy = new ArrayList<Integer>();
            // Separates the digits to be squared
            while ((sum != 1) && !happy.contains(sum)) {

                for (int i = 0; i < str.length(); i++) {
                    Character c = new Character(str.charAt(i));
                    String character = c.toString();
                    int digit = Integer.parseInt(character);
                    sum += (digit * digit);
                }
                happy.add(sum);
            }
            happy.clear();
            return sum == 1;
        }
    }
