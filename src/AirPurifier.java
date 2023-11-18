import java.util.LinkedList;
/*
instance variable:
    - model (String)
    - serialNo (String)
    - power (boolean)
    - powerUsage (double)
    - PM (double)
    - FanSpeed (double)
    - weight (double)
instance method:
    - turnOn (void)
    - turnOff (void)
    - getPM (double)
    - setFanSpeed (void {Input double})
    - showAllValue (void)
class variable:
    - modelCount (int)
    - List (LinkedList-String)
class method:
    - mostPopularModel (String)
    - showModelCount (void)
 */

public class AirPurifier {
    String model;
    String serialNo;
    boolean power;
    double powerUsage;
    double PM;
    double FanSpeed;
    double weight;

    static LinkedList<String> List = new LinkedList<>();
    static int modelCount;

    AirPurifier(String model, String serialNo , double powerUsage , double weight) {
        this.model = model;
        this.serialNo = serialNo;
        this.powerUsage = powerUsage;
        this.weight = weight;

        List.add(this.model);
        modelCount++;
    }

    void turnOn() {
        PM = Math.random();
        FanSpeed = 111.69;
        power = true;
    }

    void turnOff() {
        PM = 0;
        FanSpeed = 0;
        power = false;
    }

    double getPM(){
        return PM;
    }

    void setFanSpeed(double s){
        if(power) this.FanSpeed = s;
    }

    static String mostPopularModel(){
        int max = 0;
        String result = " ";
        for(int i = 0;i<List.size();i++){
            int count  = 0;
            for (String s : List) {
                if (List.get(i).equals(s)) {
                    count++;
                }
                if(count > max){
                    max = count;
                    result = List.get(i);
                }
            }
        }
        System.out.print("PopularModel = ");
        return result;
    }

    void showAllValue(){
        System.out.println("------------- Model : "+model+" --------------");
        System.out.println("SerialNo = "+ serialNo);
        System.out.println("TurnOn = " + power);
        System.out.println("PowerUsage = " + powerUsage + " W");
        System.out.print("PM = ");System.out.printf("%.2f",PM);System.out.println(" µg/m");
        System.out.println("FanSpeed = " + FanSpeed +" RPM");
        System.out.println("Weight = " + weight +" kg");
        System.out.println("-----------------------------------------");
    }

    static void showModelCount(){
        System.out.println("ModelCount = " + modelCount);
    }
}