package sem_4.Weapons;

public abstract class Weapon implements Weaponable {

    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }
    
}
