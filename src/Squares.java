import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Başlangıç sayısını giriniz: ");
        int initialNumber = scanner.nextInt();
        System.out.println("Bitiş sayısını giriniz: ");
        int finishNumber = scanner.nextInt();
        System.out.println(squareNumbers(initialNumber,finishNumber));
    }

    public static int squareNumbers(int initialNumber, int finishNumber) {
        int counter = 0;
        for (int i = initialNumber; i <= finishNumber; i++) {
            double sqrtnumber = Math.sqrt(i);
            double ondalikkisim = sqrtnumber - (int) sqrtnumber;
            if (ondalikkisim == 0) {
                counter++;
            }

        }
        return counter;
    }

}
