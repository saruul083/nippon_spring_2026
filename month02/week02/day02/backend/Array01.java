package month02.week02.day02.backend;

public class Array01 {
    public static void main(String[] args) {
        // int a = 5;
        // double b = 1.5;
        // String name = "Eegi";
        // char letter = 'C';
        // boolean hudal = false;

        // int[] buheltoonuud = {1, 10, 5, 7, 6};

        // String[] surnames = {"Baatarkhuu", "Enkhtuya", "Otgonjargal"};
        // boolean[] yesyesyesyes = {true, true, true, true};
        // double[] burahaitoonuud = {1.3, 1.5, 2.4, 5.6, 6.2};
        // char[] alphabets = {'A', 'B', 'C', 'D'};

        // System.out.println(surnames[0]);
        // System.out.println(surnames[2]);

        // burahaitoonuud[1] = 4.50;
        // System.out.println(burahaitoonuud[1]);

        // System.out.println(alphabets.length);

        double[] myNumbers = {1.3, 2.3, 3.3, 4.5, 5.6, 6.7, 7.8, 8.9, 9.1, 9.3};

        myNumbers[4]++;

        myNumbers[0] = 0;

        myNumbers[myNumbers.length - 1] = myNumbers[myNumbers.length - 1] + 8;

        // System.out.println(myNumbers[0]);
        // System.out.println(myNumbers[1]);
        // System.out.println(myNumbers[2]);
        // System.out.println(myNumbers[3]);
        // System.out.println(myNumbers[4]);
        // System.out.println(myNumbers[5]);
        // System.out.println(myNumbers[6]);
        // System.out.println(myNumbers[7]);
        // System.out.println(myNumbers[8]);
        // System.out.println(myNumbers[9]);

        for(int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }
    }
}
