/**
 * Created by Andrew on 02/10/2015.
 */
public class AppleComputer extends ComputerFunctionDec {
    @Override
    public String getDesc() {
        return tempComputer.getDesc() + " Apple Computer ";
    }

    @Override
    public double getCost() {
        return tempComputer.getCost() + 25.00;
    }

    public AppleComputer(Computer newComputer) {
        super(newComputer);
    }
}
