public class Hunter extends Ragnarok {

    public Hunter(String alias, int hp, int mp) {
        super(alias, hp, mp);
    }

    public void firstSkill(Ragnarok target) {
        if (this.getHp() <= 0 || this.getMp() <= 0) {
            if (this.getHp() <= 0) {
                System.out.println(this.getAlias() + " cant attack because " + this.getAlias() + " is now dead.");
            }
            if (this.getMp() <= 0) {
                System.out.println(this.getAlias() + " mana not enough");
            }

        } else {
            int dmg = 40;
            this.setMp(this.getMp() - 15);
            System.out.println(this.getAlias() + " use Snipe to " + target.getAlias());
            System.out.println("Snipe cannot be dodge");
            undodgeable(dmg, target);
        }

    }

    public void secondSkill(Ragnarok target) {
        if (this.getHp() <= 0 || this.getMp() <= 0) {
            if (this.getHp() <= 0) {
                System.out.println(this.getAlias() + " cant attack because " + this.getAlias() + " is now dead.");
            }
            if (this.getMp() <= 0) {
                System.out.println(this.getAlias() + " mana not enough");
            }

        } else {
            int dmg = 20;
            System.out.println(this.getAlias() + " use Arrowshot to " + target.getAlias());
            Arrowshothits(dmg, target);
        }

    }

}
