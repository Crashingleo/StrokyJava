import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        char[] result = s.toCharArray();
        int count = 0;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int[] array = new int[100];
        for (int i = 0; i < result.length; i++) {

            if (result[i] == 'a') {
                int aCheck = countA;
                countA++;
            } else if (result[i] == 'b') {
                int bCheck = countB;
                countB++;
            } else if (result[i] == 'c') {
                int cCheck = countC;
                countC++;
            } else if (result[i] == 'd') {
                int dCheck = countD;
                countD++;
            }
            if ((countA == 2 && countB + countD + countC == 0)) {
                countA--;
            } else if (countB == 2 && countA + countC + countD == 0) {
                countB--;
            } else if (countC == 2 && countA + countB + countD == 0) {
                countC--;
            } else if (countD == 2 && countA + countB + countC == 0) {
                countD--;
            }

            if (countA > 0 && countB > 0 && countC > 0 && countD > 0) {
                count = countA + countB + countC + countD;
                array[i] = count;
                i = i - count + 1;
                count = 0;
                countA = 0;
                countB = 0;
                countC = 0;
                countD = 0;
            }
        }
        int smaller = 100000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && smaller > array[i]) {
                smaller = array[i];
            }
        }
        if (smaller == 100000) {
            System.out.println("-1");
        } else {
            System.out.println("Самая маленькая хорошая строка" + smaller);
        }


    }
}




