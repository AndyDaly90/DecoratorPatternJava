/**
 * Created by Andrew on 02/10/2015.
 */
public class ComputerFunctionDec implements Computer {

    protected Computer tempComputer;

    public ComputerFunctionDec(Computer newComputer)
    {
        tempComputer = newComputer;
    }
    @Override
    public String getDesc() {
        return tempComputer.getDesc();
        
    }

    @Override
    public double getCost() {
       return  tempComputer.getCost();
    }
}
