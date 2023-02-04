import java.util.*;

//sadili_INF222
public class Wizard extends Ragnarok {

    public Wizard(String alias, int hp, int mp) {
        super(alias, hp, mp);
    }

    public void FocusBeam(Ragnarok target) {
        if (this.getHp() <= 0 || this.getMp() <= 0) {
            if (this.getHp() <= 0) {
                System.out.println(this.getAlias() + " cant attack because " + this.getAlias() + " is now dead.");
            }
            if (this.getMp() <= 0) {
                System.out.println(this.getAlias() + " mana not enough");
            }

        } else {
            int dmg = 30;
            Random s = new Random();
            int result = s.nextInt(1, 3);
            
            this.setMp(this.getMp() - 25);
            System.out.println(this.getAlias() + " use FocusBeam to " + target.getAlias());
            if (result == 2) {
                this.setMp(this.getMp() + 10);
                System.out.println(this.getAlias() + " increase energy by 10");
            }
            takeDamage(dmg, target);
        }

    }

    public void StaffSmite(Ragnarok target) {
        if (this.getHp() <= 0 || this.getMp() <= 0) {
            if (this.getHp() <= 0) {
                System.out.println(this.getAlias() + " cant attack because " + this.getAlias() + " is now dead.");
            }
            if (this.getMp() <= 0) {
                System.out.println(this.getAlias() + " mana not enough");
            }

        } else {
            int dmg = 10;
            this.setHp(this.getHp() + 10);
            this.setMp(this.getMp() + 10);
            System.out.println(this.getAlias() + " use  StaffSmite to " + target.getAlias());
            takeDamage(dmg, target);
        }

    }

}