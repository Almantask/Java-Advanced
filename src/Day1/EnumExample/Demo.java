package Day1.EnumExample;

public class Demo {
    public static void main(String[] args) {

        System.out.println("==================normal way");
        //convert to meters
        String chosenUnitString="INCH";
        double convMeterVal=1.0;
        double convCentiMeterVal=0.01;
        double convInchVal=0.025;
        double convFootVal=0.3;

        switch(chosenUnitString) {
            case "FOOT":
                System.out.println("Foot unit is selected.... use " + convFootVal);
                break;
            case "METER":
                System.out.println("Meter unit is selected.... use " + convMeterVal);
                break;
            case "INCH":
                System.out.println("Inch unit is selected.... use " + convInchVal);
                break;
            case "CENTIMETER":
                System.out.println("Centimeter unit is selected.... use " + convCentiMeterVal);
                break;
        }//==================20lines of code



        System.out.println("\n================== Enum way");
        LengthUnit chosenUnit = LengthUnit.valueOf("INCH");
        System.out.println(chosenUnit.convertToMeters());

        System.out.println("\n================== Iteration");
        for(LengthUnit tempVar: LengthUnit.values()){
            System.out.println(tempVar + ": " + tempVar.convertToMeters());
        }
    }


}

enum LengthUnit {
    METER(1),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025);

    double value;
    LengthUnit(double value) {
        this.value = value;
        System.out.println("Constructor..." + value);
    }

    double convertToMeters() {
        return value;
    }
}