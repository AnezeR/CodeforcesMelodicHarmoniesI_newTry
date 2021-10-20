import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt(), count = 0;

        for (int i = 0; i < n; i++) {

            double alice = sc.nextDouble();
            double bob = sc.nextDouble();

            double aliceOctave = Math.log(alice / 110) / Math.log(2);
            double bobOctave = Math.log(bob / 110) / Math.log(2);

            double bobNote = Math.log(bob / (110d * bobOctave)) / Math.log(2) * 12;
            double aliceNote = Math.log(alice / (110d * aliceOctave)) / Math.log(2) * 12;

            bobNote = Math.round(bobNote) + 8 * bobOctave;
            aliceNote = Math.round(aliceNote) + 8 * aliceOctave;

            count += bobNote - aliceNote;
        }

        System.out.println(count);
    }
}