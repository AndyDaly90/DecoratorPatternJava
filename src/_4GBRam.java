/**
 * Created by Andrew on 02/10/2015.
 */
public class _4GBRam extends ComputerDecorator {
    public _4GBRam(Computer newComputer) {
        super(newComputer);
        System.out.println("Adding 4GB Ram");
    }

    @Override
    public String getDesc() {
        return tempComputer.getDesc() + " with 4GB Ram ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 40.00;
    }
}
