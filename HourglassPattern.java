import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number for size: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        // Top half
        for (int i = 0; i < n / 2 + 1; i++) {
            // Leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Numbers
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print((j+1 ) + " ");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Numbers
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }

       
    }
}
