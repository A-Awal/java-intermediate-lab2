package org.example.design_patterns.template;

import java.security.Key;

public abstract class EncryptionTemplate {

    protected abstract Key generateKey() throws Exception;

    protected abstract byte[] encrypt(byte[] data, Key key) throws Exception;

    protected abstract byte[] decrypt(byte[] cipherText, Key key) throws Exception;

    public byte[] encryptData(byte[] data) throws Exception {
        Key key = generateKey();
        return encrypt(data, key);
    }

    public byte[] decryptData(byte[] cipherText) throws Exception {
        Key key = generateKey();
        return decrypt(cipherText, key);
    }
}
