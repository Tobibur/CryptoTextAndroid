package com.tobibur.cryptotextandroid;

import com.tozny.crypto.android.AesCbcWithIntegrity;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public class CryptoText {

    private AesCbcWithIntegrity.SecretKeys keys;
    String ciphertextString = null;

    public String encryptInput(String plainText){

        try {
            keys = AesCbcWithIntegrity.generateKey();

            AesCbcWithIntegrity.CipherTextIvMac cipherTextIvMac = AesCbcWithIntegrity.encrypt(plainText, keys);
            //store or send to server
            ciphertextString = cipherTextIvMac.toString();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return ciphertextString;
    }

    public String decryptOutput(String cipherTextString){
        //Use the constructor to re-create the CipherTextIvMac class from the string:
        AesCbcWithIntegrity.CipherTextIvMac cipherTextIvMac = new AesCbcWithIntegrity.CipherTextIvMac(cipherTextString);
        String plainText = null;
        try {
            plainText = AesCbcWithIntegrity.decryptString(cipherTextIvMac, keys);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }

        return plainText;
    }
}
