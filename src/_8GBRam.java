/**
 * Created by Andrew on 02/10/2015.
 */
public class _8GBRam extends ComputerFunctionDec {
    public _8GBRam(Computer newComputer) {
        super(newComputer);
    }

    @Override
    public String getDesc() {
        return tempComputer.getDesc() + " with 8GBRam ";
    }

    @Override
    public double getCost() {
        return tempComputer.getCost() + 70.00;
    }
}
