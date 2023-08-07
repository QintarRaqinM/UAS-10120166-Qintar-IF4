/**
 * NIM : 10120166
 * NAMA : Qintar Raqin Maulana
 * KELAS : IF-4
 */
package com.uas.notes.helper;

public class StringHelper {
    // Generate Username From Email
    public static String usernameFromEmail(java.lang.String email) {
        if (!email.contains("@")) return email;

        return email.split("@")[0];
    }
}
