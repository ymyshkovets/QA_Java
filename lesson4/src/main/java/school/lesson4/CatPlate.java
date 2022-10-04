package school.lesson4;

public class CatPlate {

    protected String name;
    protected int appetite;
    protected boolean bellyful;

    public CatPlate(String name, int appetite, boolean b) {
        this.name = name;
        this.appetite = appetite;
        this.bellyful = bellyful;


    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }


}