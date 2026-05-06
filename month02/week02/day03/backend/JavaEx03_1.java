package month02.week02.day03.backend;

public class JavaEx03_1 {
    public static void main(String[] args) {
        Integer[] numbers1 = {3, 6, 9, 12, 15};
        Integer[] numbers2 = {2, 4, 6, 8, 10, 12, 6};

        System.out.println("Ijil element: ");
        for(int i = 0; i < numbers1.length; i++){
            for(int j = 0; j < numbers2.length; j++){
                if (numbers1[i] == numbers2[j]) {
                    System.out.print(numbers1[i] + " ");
                    numbers1[i] = null;
                }
            }
        }
        
    }
}
