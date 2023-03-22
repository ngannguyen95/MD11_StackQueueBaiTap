package daoNguocMangSoNguyen;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Test {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("********Stack Number**********");
        stackNumber();
        System.out.println("\n*********Stack String**********");
        stackString();
    }
    public static void stackNumber(){
        System.out.println("Nhập số phần tử mảng: ");
        int n = scanner.nextInt();

        Stack<Integer> stackNumber = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
          stackNumber.push(scanner.nextInt());
        }
        System.out.println("mảng đảo ngược: ");
        for (int i = 0; i < n; i++) {
            System.out.print(stackNumber.pop()+" ,");
        }
        scanner.nextLine();
    }
    public static void stackString(){
        Stack<String> stackString = new Stack<>();
        System.out.println("Nhập vào chuỗi String: ");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackString.push(s.charAt(i) + "");
        }
        System.out.println("chuỗi đảo ngược: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackString.pop());
        }
    }
}
