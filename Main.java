import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueInput = 'y'; 
        while (continueInput == 'y') {
            System.out.print("String: ");
            String s = scanner.nextLine();
            System.out.print("k-size ");
            int k = scanner.nextInt();
            scanner.nextLine(); 
            char[] chars = s.toCharArray();
            int length = chars.length;
            k = k % length;
            char[] rotated = new char[length];
            for (int i = 0; i < length; i++) {
                rotated[i] = chars[(i + k) % length]; 
            }
            for (char c : rotated) {
                System.out.print(c);
            }
            System.out.println(); 
            System.out.print("continue?//Not!- (y/n): ");
            continueInput = scanner.nextLine().charAt(0);
        }
        System.out.println("End!.");
    }
}
