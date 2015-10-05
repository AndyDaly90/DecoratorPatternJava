/**
 * Created by Andrew on 02/10/2015.
 */
public class graphicsCard extends ComputerDecorator {
    public graphicsCard(Computer newComputer) {
        super(newComputer);
        System.out.println("Adding graphics card");

    }

    @Override
    public String getDesc() {
        return tempComputer.getDesc() + "Nvidia GeForce GTX 750 Graphics ";
    }

    @Override
    public double getCost() {
        return tempComputer.getCost() + 100.00;
    }
}
