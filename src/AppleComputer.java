/**
 * Created by Andrew on 02/10/2015.
 */
public class AppleComputer implements Computer {
    @Override
    public String getDesc() {
        return "Apple Computer";
    }

    @Override
    public double getCost() {
        return 25.00;
    }

    public AppleComputer(Computer newComputer) {
        super();
    }
}
