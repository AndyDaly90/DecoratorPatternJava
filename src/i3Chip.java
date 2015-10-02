/**
 * Created by Andrew on 02/10/2015.
 */
public class i3Chip extends ComputerFunctionDec {

    public i3Chip(Computer newAttribute)
    {
        super(newAttribute);
        System.out.println("Adding i3 chip");
    }

    @Override
    public String getDesc() {
        return tempComputer.getDesc() + " i3 Chip ";
    }

    @Override
    public double getCost() {
        return tempComputer.getCost() + 50.00;
    }
}
