package command.Cenna;

//every button should have label
//every button should have click()

public class Button {
    private String label;

    public void click(ClickCommand clickCommand){
      clickCommand.doSomething();
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
