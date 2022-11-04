package Unit5_WritingClasses.HeroVillainExample;

public class Villain {
    private String villainName;
    private Power superPower;

    public Villain(String villainName, Power superPower) {
        this.villainName = villainName;
        this.superPower = new Power(superPower.getPowerName(), superPower.getPowerStrength());;
    }

    public String toString(){
        String output = "";
        output += "Villain Name: " + this.villainName + "\n";
        output += this.superPower.toString();
        return output;
    }

    public String getVillainName() {
        return villainName;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}
