public class Wizard extends Human {

    public Wizard(String name, String job, int agi, int str, int inte, int hp, int mp) {
        super(name, job, agi, str, inte, hp, mp);
    }

    public Wizard(String name, String job, int agi, int str, int inte) {
        super(name, job, agi, str, inte);
    }

    public void wiseSmash(Human target) {
        // (Wizard) - wiseSmash -> damage dealt will be based on the the intelligence of
        // the wizard plus the difference between the int of the wizard and the target.
        // increase wizard's mp by 10
        System.out.println(this.getName() + " use Wise Smash to " + target.getName());
        int dmg = 0;
        dmg = this.getInte() + (this.getInte() - target.getInte());
        this.setMp(this.getMp() + 10);

        takeAttack(dmg, target);

    }

    // (Wizard) - fireBall -> damage dealt will be based on the intelligence of the
    // wizard plus 10% of the current hp of the target. decreases wizard's mp by 10
    public void fireBall(Human target) {
        System.out.println(this.getName() + " use Fireball to " + target.getName());
        int dmg = 0;
        dmg = (int) (this.getInte() + (target.getHp() * .10));
        this.setMp(this.getMp() - 10);

        takeAttack(dmg, target);
    }
}
