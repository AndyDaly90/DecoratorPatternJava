/**
 * Created by Andrew on 02/10/2015.
 */
public class HPComputer extends ComputerFunctionDec{

    @Override
    public String getDesc() {

        return tempComputer.getDesc() +  " HP Computer ";
    }

    @Override
    public double getCost() {
        return tempComputer.getCost() + 10.00;
    }

    public HPComputer(Computer newComputer) {
        super(newComputer);
    }
}
