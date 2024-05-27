/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caesarcipher1;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class CaesarCipher1 {

    public static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        k = k % 26;

        for (char c : s.toCharArray()) {
            char change = c;

            if (c >= 'A' && c <= 'Z') {
                change = (char) (c + k);
                if (change > 'Z') {
                    change = (char) (change - 26);
                }
            } else if (c >= 'a' && c <= 'z') {
                change = (char) (c + k);
                if (change > 'z') {
                    change = (char) (change - 26);
                }
            }

            sb.append(change);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(caesarCipher(s, k));
    }

}
