package strategy.exercise;

public class AesAlgorithm implements Encryption{

    @Override
    public void encryptMessage(String message) {
        System.out.println("Encrypting message using AES");
    }
}
