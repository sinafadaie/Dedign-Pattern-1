package memento.excersize;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        Document document = new Document(history);


        document.setContent("Cena");
        document.setFontName("Nazanin");
        document.setFontSize(18);

        history.push(new Memento(document));     //we can develop a method like createMemento
        System.out.println(document);            //on Document class
                                                 //this method take snapshot (instantiate Memento)

        document.setFontSize(20);
        history.push(new Memento(document));

        System.out.println(document);
    }
}
