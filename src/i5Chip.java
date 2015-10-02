/**
 * Created by Andrew on 02/10/2015.
 */
public class i5Chip extends ComputerFunctionDec {
    public i5Chip(Computer newComputer) {
        super(newComputer);
        System.out.println("Adding i5 chip");
    }

    @Override
    public String getDesc() {
        return tempComputer.getDesc() + " i5 chip ";
    }

    @Override
    public double getCost() {
        return tempComputer.getCost() + 70.00;
    }
}
