public class Main {
    public static void main(String[] args) {
        char[][] keypad= {{'1', '2', '3'},
                      {'4', '5', '6'},
                      {'7', '8', '9'},
                      {'*', '0', '#'}};
        for (char[] row : keypad) {
            for (char chr : row) {
                System.out.print(chr + " ");
            }
            System.out.println();
        }
    }
}