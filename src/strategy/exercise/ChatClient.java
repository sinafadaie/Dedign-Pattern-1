package strategy.exercise;

//ChatClient class hasn't different state
//it just use different algorithm to encrypt message
//so it's a Strategy, it's not State!

public class ChatClient {
    private Encryption encryption;


    public void send(String message) {
        /*throw new UnsupportedOperationException("Unsupported encryption algorithm");*/

        encryption.encryptMessage(message);
        System.out.println("Sending the encrypted message...");
    }

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }
}