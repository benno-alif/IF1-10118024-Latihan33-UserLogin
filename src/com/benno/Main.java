package com.benno;
import java.util.Scanner;

    /*
        Nama        : Benno Alif Anggara
        Kelas       : IF1
        NIM         : 10118024
        Deskripsi   : User login
     */

public class Main {

    private static String usName, passWord;

    public static void main(String[] args) {
	    User user = new User();
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username\t= ");
        usName = scanner.nextLine();

        System.out.print("Masukkan Password\t= ");
        passWord = scanner.nextLine();

        System.out.println();
        user.pengecekkanLogin(usName, passWord);
    }
}
