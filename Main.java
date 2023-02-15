public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);

        // if class Gear is public:
        //GearBox.Gear first =mcLaren.new Gear(1,12.3);
        //System.out.println(first.driveSpreed(1000));

        // if I don't put addGear() in the Contructor:
//        mcLaren.addGear(1, 5.3);
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3,15.9);

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1); //an dn kanw prwta true ton simpleckti auto den

        mcLaren.operateClutch(false); //an ksexasw to operate the clutch
        System.out.println(mcLaren.wheelSpeed(1000)); //otan cluctch false tote upologismos // 1000 * 5.3 = 5300
        mcLaren.changeGear(2); //wrong
        System.out.println(mcLaren.wheelSpeed(3000)); //0.0

        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);

        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000)); //6000 * 15.9
    }
}