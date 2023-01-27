public class Ninja extends Human {

    public Ninja(String name, String job, int agi, int str, int inte, int hp, int mp) {
        super(name, job, agi, str, inte, hp, mp);
    }

    public Ninja(String name, String job, int agi, int str, int inte) {
        super(name, job, agi, str, inte);
    }

    public Ninja(String name, String job) {
        super(name, job);
    }

    public void backstab(Human target) {
        // (Ninja) - backstab -> the ninja will have stab the enemy dealing 10 damage,
        // this will deal 30 damage if the enemy has less than 60% of the maximum hp.
        System.out.println(this.getName() + " use Back Stab to " + target.getName());
        int dmg = 10;
        if (target.getHp() < 60) {
            dmg = 30;
        }
        takeAttack(dmg, target);

    }
}
