package org.example.design_patterns.template;

import java.nio.charset.StandardCharsets;
import java.security.Key;

public class Application {
    public static void main(String[]args) throws Exception {
        //Create encryption class
        AESEncryption encryption = new AESEncryption();

        //Encrypt data
        Key encryptionKey = encryption.generateKey();
        var encryptedHello = encryption.encrypt("hello".getBytes(StandardCharsets.UTF_8), encryptionKey);

        //Print encrypted data
        System.out.println(encryptedHello);

        //Decrypt data
        var decryptedHello = encryption.decrypt(encryptedHello, encryptionKey);

        //print decrypted hello
        System.out.println(new String( decryptedHello, StandardCharsets.UTF_8));
    }

}
