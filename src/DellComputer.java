/**
 * Created by Andrew on 02/10/2015.
 */
public class DellComputer extends ComputerFunctionDec {

    @Override
    public String getDesc() {
        return tempComputer.getDesc() + " Dell Computer ";
    }

    @Override
    public double getCost() {
        return tempComputer.getCost() +  15.00;
    }

    public DellComputer(Computer newComputer) {
        super(newComputer);
    }
}
