package month02.week03.day02.backend;

public class Javadasgal05 {
    static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    static int max(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
    static int min(int[] arr){
        int min = 999999;
        for(int i = 0; i < arr.length; i++){
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }
    static double average(int[] arr){
        return (double) sum(arr) / arr.length;
    }
    static int count(int[] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]) count++; 
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {3, 7, 2, 9, 1};
        System.out.print("Sum: " + sum(a));
        System.out.print("   Max: " + max(a));
        System.out.print("   Min: " + min(a));
        System.out.println("   Average: " + average(a));
        System.out.println("Count of 3: " + count(a, 3));
    }
}
