/**
 * Created by Andrew on 02/10/2015.
 */
public class SonyComputer implements Computer {
    @Override
    public String getDesc() {
        return " Sony Computer ";
    }

    @Override
    public double getCost() {
        return 20.00;
    }

    public SonyComputer(Computer newComputer) {
        super();
    }
}
