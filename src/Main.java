public class Main {
    public static void main(String[] args) {
        AirPurifier a = new AirPurifier("PRO","001",280.5,110);
        AirPurifier b = new AirPurifier("NOOB","002",220.2,100);
        AirPurifier c = new AirPurifier("NOOB","003",220.2,100);
        a.showAllValue();
        b.showAllValue();
        c.showAllValue();

//        ---Test-TurnOn()---
//        System.out.println("Test-TurnOn()");
//        a.turnOn();
//        b.turnOn();
//        c.turnOn();
//        a.showAllValue();
//        b.showAllValue();
//        c.showAllValue();

//        ---Test-TurnOff()---
//        System.out.println("Test-TurnOff()");
//        a.turnOff();
//        b.turnOff();
//        c.turnOff();
//        a.showAllValue();
//        b.showAllValue();
//        c.showAllValue();

//        ---Test-getPM()---
//        System.out.println("Test-getPM()");
//        System.out.printf("PM_001 = %.2f%n",a.getPM());
//        System.out.printf("PM_002 = %.2f%n",b.getPM());
//        System.out.printf("PM_003 = %.2f%n",c.getPM());

//        ---Test-setFanSpeed(double)---
//        System.out.println("Test-setFanSpeed(double)");
//        a.setFanSpeed(99.99);
//        b.setFanSpeed(77.77);
//        c.setFanSpeed(66.66);
//        a.showAllValue();
//        b.showAllValue();
//        c.showAllValue();

//        ---Test-mostPopularModel()---
//        System.out.println(AirPurifier.mostPopularModel());

//        ---Test-showModelCount()---
//          AirPurifier.showModelCount();
    }
}