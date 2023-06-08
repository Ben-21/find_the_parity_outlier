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
                oddArray[i] = arrayOfIntegers[i];
                oddCounter++;
            }

            if (arrayOfIntegers[i] % 2 == 0){
                evenArray[i] = arrayOfIntegers[i];
                evenCounter++;
            }
        }

        if (oddCounter < evenCounter){
            result = oddArray[evenCounter];
        } else {
            result = evenArray[oddCounter];
        }



        return result;


    }
}
