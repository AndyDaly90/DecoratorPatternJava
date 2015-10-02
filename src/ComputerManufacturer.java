/**
 * Created by Andrew on 02/10/2015.
 */
public class ComputerManufacturer {
    public static void main(String[] args) {

        String newLine = System.getProperty("line.separator");

         Computer c1 = new _4GBRam(new graphicsCard(new i3Chip(new nullOp())));
        System.out.println("Computer has : " + c1.getDesc());
        System.out.println("Price : " + c1.getCost() + newLine);



         Computer c2 = new _8GBRam(new graphicsCard(new i5Chip(new nullOp())));
        System.out.println("Computer has : " + c2.getDesc());
        System.out.println("Price : " + c2.getCost() + newLine);



        Computer c3 = new _8GBRam(new graphicsCard(new i7Chip(new nullOp())));
        System.out.println("Computer has : " + c3.getDesc());
        System.out.println("Price : " + c3.getCost() + newLine);


        Computer c4 = new AppleComputer(new graphicsCard(new _8GBRam(new i7Chip(new nullOp()))));
        System.out.println("Computer has : " + c4.getDesc());
        System.out.println("Price : " + c4.getCost());











    }
}