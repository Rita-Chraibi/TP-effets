package exemple;

public class Enchainement {
    private Effet effet;
    private Scenario scenario;

    private int repetition;

    public Enchainement( Effet effet, Scenario scenario, int repetition){
        this.effet=effet;
        this.scenario=scenario;
        this.repetition=repetition;
    }
    public Effet getEffet (){
        return effet;
    }
    public int getRepetition() {
        return repetition;
    }
}
