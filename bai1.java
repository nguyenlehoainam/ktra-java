import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hay nhap 1 chuoi ky tu :");
        int T = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < T; i++) {
            String input = scanner.nextLine();
            System.out.print("so khoang trong la :");
            System.out.println(demkhoang(input));
        }
        scanner.close();
    }
    
    public static int demkhoang(String str) {
        int count = 0;
        boolean a = false;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!a) {
                    count++;
                    a = true;
                }
            } else {
                a = false;
            }
        }
        
        return count;
    }
}

