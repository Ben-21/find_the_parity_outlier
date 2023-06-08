import java.sql.Array;

public class Functions {



    public  int find(int[] arrayOfIntegers){
        int result = 0;
        int oddCounter = 0;
        int evenCounter = 0;
        int[] oddArray = new int[arrayOfIntegers.length];
        int[] evenArray = new int[arrayOfIntegers.length];


        for (int i = 0; i < arrayOfIntegers.length; i++){
            if (arrayOfIntegers[i] % 2 != 0){
                oddCounter++;
            }

            if (arrayOfIntegers[i] % 2 == 0){
                evenCounter++;
            }
        }

        if (oddCounter < evenCounter) {
            for (int i = 0; i < arrayOfIntegers.length; i++) {
                if (arrayOfIntegers[i] % 2 != 0) {
                    result = arrayOfIntegers[i];
                }
            }
        } else {
                for (int i = 0; i < arrayOfIntegers.length; i++){
                    if (arrayOfIntegers[i] % 2 == 0){
                        result = arrayOfIntegers[i];
                }
            }



        }



        return result;


    }
}
