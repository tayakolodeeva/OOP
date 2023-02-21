package sem_4.Weapons;

import java.util.Random;

public class Sword extends Weapon {

    public Sword(int pointOfDamage) {
        super(pointOfDamage);
    }

    @Override
    public String toString() {
        return String.format("Sword damage = %d", pointOfDamage);
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }
    
}
