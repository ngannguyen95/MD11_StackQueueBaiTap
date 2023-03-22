package chuyenDoiThapPhanSangNhiphan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stackSoDu = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương từ bàn phím:");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("vui lòng nhập lại");
        } else {
            while (number > 0) {
                int soDu = number % 2;
                System.out.print(soDu);
                stackSoDu.push(soDu + " ,");
                number = number / 2;
            }
            System.out.println("\nsố nhị phân: ");
            int n=stackSoDu.size();
            for (int i = 0; i < n; i++) {
                System.out.print(stackSoDu.pop());
            }
        }
    }
}
