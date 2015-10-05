/**
 * Created by Andrew on 02/10/2015.
 */
public class ComputerDecorator implements Computer {

    protected Computer tempComputer;

    public ComputerDecorator(Computer newComputer)
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
