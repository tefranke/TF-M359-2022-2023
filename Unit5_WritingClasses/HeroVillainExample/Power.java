package Unit5_WritingClasses.HeroVillainExample;

public class Power {
    private String powerName;
    private double powerStrength;

    /**
     * Constructor or Power object
     * @param powerName This is the name of the super power
     * @param powerStrength This is the strength of the super power (1-10)
     */
    public Power(String powerName, double powerStrength) {
        this.powerName = powerName;
        this.powerStrength = powerStrength;
    }

    public String toString(){
        String output = "";
        output += "Name: " + this.powerName + "\n";
        output += "Power Strength: " + this.powerStrength + "\n";
        return output;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public double getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(double powerStrength) {
        this.powerStrength = powerStrength;
    }

}
