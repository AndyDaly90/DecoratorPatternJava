/**
 * Created by Andrew on 02/10/2015.
 */
public class i7Chip extends ComputerFunctionDec {
    public i7Chip(Computer newComputer) {
        super(newComputer);
        System.out.println("Adding i7 chip");
    }

    @Override
    public String getDesc() {
        return tempComputer.getDesc() + " i7 chip ";
    }

    @Override
    public double getCost() {
        return tempComputer.getCost() + 100.00;
    }
}
