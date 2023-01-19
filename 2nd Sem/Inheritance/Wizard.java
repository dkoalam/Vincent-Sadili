public class Wizard extends Human {

    public Wizard(String name, String gender, String job, int hp, int mp, int intg, int str) {
        super(name, gender, job, hp, mp, intg, str);
    }

    public Wizard(String name, String gender, String job) {
        super(name, gender, job);
    }

    public void wiseSmash(Human target) {
        // (Wizard) - wiseSmash -> damage dealt will be based on the the intelligence of
        // the wizard plus the difference between the int of the wizard and the target.
        // increase wizard's mp by 10
        int diff = this.getIntg() - target.getIntg();
        int dmg = this.getIntg() + diff;
        this.setMp(this.getMp() + 10);
        System.out.println(this.getName()+" use wise smash to "+target.getName() );
        System.out.println("MP+10="+this.getMp());
        takeAttack(dmg, target);
    }

    public void fireBall(Human target) {
        // (Wizard) - fireBall -> damage dealt will be based on the intelligence of the
        // wizard plus 10% of the current hp of the target. decreases wizard's mp by 10
        float hp = (float) (this.getHp() * 0.10);
        int dmg = (int) (this.getIntg() + hp);
        this.setMp(this.getMp() - 10);
        System.out.println(this.getName()+" use fire ball to "+target.getName() );
        System.out.println("MP-10="+this.getMp());
        takeAttack(dmg, target);

    }
}
