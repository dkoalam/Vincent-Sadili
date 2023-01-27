import java.util.*;

public class Human {
    // ● Add the strength, agility, and intelligence attributes with a default of 3

    // ● Add the hp and mp attribute with a default of 100
    private String name, job;
    private int agi = 3, str = 3, inte = 3, hp = 100, mp = 100;

    public Human(String name, String job, int agi, int str, int inte, int hp, int mp) {
        this.name = name;
        this.job = job;
        this.agi = agi;
        this.str = str;
        this.inte = inte;
        this.hp = hp;
        this.mp = mp;
    }

    public Human(String name, String job, int agi, int str, int inte) {
        this.name = name;
        this.job = job;
        this.agi = agi;
        this.str = str;
        this.inte = inte;
    }

    public Human(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void chara() {

    }

    // Character Status
    public void showStat(Human target) {
        System.out.println(this.getName() + ": " + this.getHp());
        System.out.println("Hp: " + this.getHp());
        System.out.println("Mp: " + this.getMp());
        System.out.println("intelligence: " + this.getInte());
        System.out.println("strength: " + this.getStr());
        System.out.println("agility: " + this.getAgi());
        System.out.println("");
        System.out.println(target.getName() + ": " + target.getHp());
        System.out.println("Hp: " + target.getHp());
        System.out.println("Mp: " + target.getMp());
        System.out.println("intelligence: " + target.getInte());
        System.out.println("strength: " + target.getStr());
        System.out.println("agility: " + target.getAgi());
    }

    // ● Add the attack(Human) method that reduces the health of the attacked human
    // by the strength of the current human and reduces the attacker's mp by 3.
    public void Attack(Human target) {
        int dmg = 0;
        System.out.println(this.getName() + " vs " + target.getName());

        if (this.getJob().equalsIgnoreCase("Wizard")) {
            // if the attacker is a wizard the damage should be based on the intelligence of
            // the character+ strength
            dmg = this.getStr() + this.getStr();
        } else if (this.getJob().equalsIgnoreCase("Samurai")) {
            // if the attacker is samurai the damage dealt will be strength of the attacker
            // x2 but will also deal damage to himself by half of his strength.
            dmg = this.getStr() * 2;
            this.setHp(this.getHp() - (this.getStr() / 2));

        } else if (this.getJob().equalsIgnoreCase("Ninja")) {
            // if the attacker is a ninja damage dealt will be character agi + strength of
            // the target.
            dmg = this.getAgi() + target.getStr();
        }


        takeAttack(dmg, target);
    }

    public void takeAttack(int dmg, Human target) {
        if (target.getJob().equalsIgnoreCase("Ninja")) {
            // if the target is a ninja there is 50% chance that the ninja takes no damage
            // from the attack.
            Random s = new Random();
            int result = s.nextInt(1, 3);
            if (result == 1) {
                dmg = 0;
                System.out.println("Ninja takes no Damage");
            }
        }
        // (Wizard) - the wizard will take plus 5 damage from any source "FRAGILE
        // CHARACTER"
        if (target.getJob().equalsIgnoreCase("wizard")) {

            dmg = dmg + 5;
            System.out.println(target.getName() + " is FRAGILE CHARACTER");

        }
        target.setHp(target.getHp() - dmg);
        if (target.getHp() <= 0) {
            target.setHp(0);
            System.out.println(target.getName() + " is now dead");
            // (Samurai) - if the samurai takes damage and has his health reduced to 0,
            // there is a 50% chance to return to life and gain 1 hp.
            if (target.getJob().equalsIgnoreCase("Samurai")) {

                if (target.getHp() <= 0) {
                    // (Samurai) - if the samurai takes damage and has his health reduced to 0,
                    // there is a 50% chance to return to life and gain 1 hp.
                    Random s = new Random();
                    int result = s.nextInt(1, 3);
                    if (result == 1) {
                        target.setHp(1);
                        System.out.println(target.getName()+"The Samurai gets revived");

                    }
                }

            } 

        } else {
            System.out.println(this.getName() + " attacks " + target.getName() + "\n" + target.getName() + " now have "
                    + target.getHp()
                    + " hp");
        }

        showStat(target);

    }

}
