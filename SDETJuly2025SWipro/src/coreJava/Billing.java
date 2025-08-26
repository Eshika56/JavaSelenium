package coreJava;

abstract class Bill {
    abstract void generateBill();
}

class ElectricityBill extends Bill {
    int units;
    double ratePerUnit;

    ElectricityBill(int units, double ratePerUnit) {
        this.units = units;
        this.ratePerUnit = ratePerUnit;
    }

    
    void generateBill() {
        double total = units * ratePerUnit;
        System.out.println("Electricity Bill:");
        System.out.println("Units consumed: " + units);
        System.out.println("Rate per Unit: " + ratePerUnit);
        System.out.println("Total Amount: " + total);
    }
}

class WaterBill extends Bill {
    int literUsed;
    double ratePer1000Liters;

    WaterBill(int literUsed, double ratePer1000Liters) {
        this.literUsed = literUsed;
        this.ratePer1000Liters = ratePer1000Liters;
    }

    
    void generateBill() {
        double total = (literUsed / 1000.0) * ratePer1000Liters;
        System.out.println("Water Bill:");
        System.out.println("Liters Used: " + literUsed);
        System.out.println("Rate per 1000 Liters: " + ratePer1000Liters);
        System.out.println("Total Amount: " + total);
    }
}

public class Billing {
    public static void main(String[] args) {
        ElectricityBill obj = new ElectricityBill(300, 8);
        obj.generateBill();

        System.out.println(); 

        WaterBill obj1 = new WaterBill(2000, 10);
        obj1.generateBill();
    }
}
