package com.benno;

public class User {
    private static String username = "RizkiAdam";
    private static String password = "terbaikselalu";
    private boolean status;

    private boolean cekAkun(String parUsername, String parPassword) {
        status = parUsername.equals(username) && parPassword.equals(password);
        return status;
    }

    private void hasilLogin(boolean status, String parUsername) {
        if (status == true) {
            System.out.println("******Hallo "+ parUsername.toUpperCase() + "******");
            System.out.println("Selamat datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, username atau password anda salah");
        }
    }

    public void pengecekkanLogin(String parUsername, String parPassword){
        cekAkun(parUsername, parPassword);
        hasilLogin(status, parUsername);
    }
}