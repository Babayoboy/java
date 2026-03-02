package myfirstproject.j7varargs;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        System.out.println(avg(numbers));
    }
    static int avg(int... numbers){
        int sum = 0;
        int avrage;
        for (int number : numbers) {
            sum += number;
        }
        avrage = sum/numbers.length;
        return avrage;
    }
}