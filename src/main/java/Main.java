import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = scanner.nextInt();
        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");
    }
}
