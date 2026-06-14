package strategy.exercise;

public class Main {
    public static void main(String[] args){
        ChatClient chatClient = new ChatClient();
        chatClient.setEncryption(new DesAlgorithm());

        chatClient.send("Hello");
    }
}
