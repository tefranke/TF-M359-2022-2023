package Unit5_WritingClasses.HeroVillainExample;

public class SuperHero {
    private String heroName;
    private Power superPower;

    // keeps track of total # of SuperHero objects created so far
    private static int numHeroes = 0;

    public SuperHero(String heroName, Power superPower) {
        this.heroName = heroName;
        this.superPower = new Power(superPower.getPowerName(), superPower.getPowerStrength());

        // somebody called the constructor, so we're creating a new SuperHero object - update the count!
        numHeroes++;
    }

    public static int getNumHeroes(){
        return numHeroes;
    }

    public String toString(){
        String output = "";
        output += "Hero Name: " + this.heroName + "\n";
        output += this.superPower.toString();
        return output;
    }


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Power getSuperpower() {
        return superPower;
    }

    public void setSuperpower(Power superpower) {
        this.superPower = superpower;
    }
}
