package Comand;

public class DollsShow implements Command {

    private Toys dolls;

    public DollsShow(Toys dolls) {
        this.dolls = dolls;
    }

    @Override
    public void execute() {
        this.dolls.isGirl();
    }

}
