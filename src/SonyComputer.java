/**
 * Created by Andrew on 02/10/2015.
 */
public class SonyComputer extends ComputerFunctionDec {
    @Override
    public String getDesc() {
       return tempComputer.getDesc() +  " Sony Computer ";
    }

    @Override
    public double getCost() {
        return tempComputer.getCost() +  20.00;
    }

    public SonyComputer(Computer newComputer) {
        super(newComputer);
    }
}
