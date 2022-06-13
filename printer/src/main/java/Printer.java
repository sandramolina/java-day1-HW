public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper){
        this.paper = paper;
        this.toner = 100;
    }

    public int getPaperLeft() {
        return this.paper;
    }

    public String print(int pages, int copies){
        int printed = pages * copies;
        if(this.paper >= printed) {
            this.paper -= printed;
            this.toner -= printed;
            return String.format("%s pages printed", printed);
        } else {
            return "There is not enough paper";
        }

    }

    public int getTonerLeft() {
        return this.toner;
    }

}
