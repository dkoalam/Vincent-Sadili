public class Assassin extends Ragnarok {

    public Assassin(String alias, int hp, int mp) {
        super(alias, hp, mp);
    }

    public void Backstab(Ragnarok target) {
        if (this.getHp() <= 0 || this.getMp() <= 0) {
            if (this.getHp() <= 0) {
                System.out.println(this.getAlias() + " cant attack because " + this.getAlias() + " is now dead.");
            }
            if (this.getMp() <= 0) {
                System.out.println(this.getAlias() + " mana not enough");
            }

        } else {
            int dmg = (int) (40 + (target.getHp() * .20));
            this.setMp(this.getMp() - 20);
            System.out.println(this.getAlias() + " use Backstab to " + target.getAlias());
            takeDamage(dmg, target);
        }

    }

    public void Punch(Ragnarok target) {
        if (this.getHp() <= 0 || this.getMp() <= 0) {
            if (this.getHp() <= 0) {
                System.out.println(this.getAlias() + " cant attack because " + this.getAlias() + " is now dead.");
            }
            if (this.getMp() <= 0) {
                System.out.println(this.getAlias() + " mana not enough");
            }

        } else {
            int dmg = 10;
            this.setMp(this.getMp() + 15);
            System.out.println(this.getAlias() + " use Punch to " + target.getAlias());
            takeDamage(dmg, target);
        }
    }

}
