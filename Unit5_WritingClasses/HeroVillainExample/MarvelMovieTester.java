package Unit5_WritingClasses.HeroVillainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        Power superSpeed = new Power("super speed", 10);
        System.out.println(superSpeed);

        SuperHero flash = new SuperHero("Flash", superSpeed);
        Villain reverseFlash = new Villain("Reverse Flash", superSpeed);
        System.out.println(flash);
        System.out.println(reverseFlash);

        // Downgrade Flash's super power to 7 strength

        flash.getSuperpower().setPowerStrength(7);
        System.out.println(flash);
        System.out.println(reverseFlash);

        battle(flash, reverseFlash);
        System.out.println(flash);
        System.out.println(reverseFlash);
    }

    /**
     * Hero (h) and Villain (v) will battle, and the person with the higher power strength wins 60% of the time. (If
     * they have the smae power strength, then 50/50).
     *  Winner will gain 10% of the strength of the loser
     *  Loser will lose between 5-35% (inclusive) of its OWN strength
     * @param h This is the hero object
     * @param v This is the villain object
     */
    public static void battle(SuperHero h, Villain v){
        double hStr = h.getSuperpower().getPowerStrength();
        double vStr = v.getSuperPower().getPowerStrength();

        if (hStr > vStr) {
            // hero is stronger
            if (Math.random() < .6) {
                // means hero won

                // hero will gain 10% of v's strength
                double newHeroStr = hStr + .1 * vStr;
                h.getSuperpower().setPowerStrength(newHeroStr);
                // villain loses 5-35% of its own strength
                double newVillainStr = vStr - vStr * (Math.random() * .3 + .05);
                v.getSuperPower().setPowerStrength(newVillainStr);
            } else if (hStr < vStr) {
                // means villain won

                // villain will gain 10% of h's strength
                double newVillainStr = vStr + .1 * hStr;
                v.getSuperPower().setPowerStrength(newVillainStr);
                // hero loses 5-35% of its own strength
                double newHeroStr = hStr - hStr * (Math.random() * .3 + .05);
                h.getSuperpower().setPowerStrength(newVillainStr);
            }
        }
        else{
            if(Math.random()<.5){
                // means hero won

                // hero will gain 10% of v's strength
                double newHeroStr = hStr + .1*vStr;
                h.getSuperpower().setPowerStrength(newHeroStr);
                // villain loses 5-35% of its own strength
                double newVillainStr = vStr - vStr*(Math.random()*.3+.05);
                v.getSuperPower().setPowerStrength(newVillainStr);
            }
            else{
                // means villain won

                // villain will gain 10% of h's strength
                double newVillainStr = vStr + .1*hStr;
                v.getSuperPower().setPowerStrength(newVillainStr);
                // hero loses 5-35% of its own strength
                double newHeroStr = hStr - hStr*(Math.random()*.3+.05);
                h.getSuperpower().setPowerStrength(newVillainStr);
            }
        }
    }
}


