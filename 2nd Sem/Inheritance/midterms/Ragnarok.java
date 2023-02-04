import java.util.*;

public class Ragnarok {

    private String Alias = "Unknown";
    private int hp = 100, mp = 50;

    public Ragnarok(String alias, int hp, int mp) {
        Alias = alias;
        this.hp = hp;
        this.mp = mp;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
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

    public void showStat(Ragnarok target) {
        System.out.println("Alias: " + this.getAlias());
        System.out.println("Hp: " + this.getHp());
        System.out.println("Mp: " + this.getMp());

        System.out.println("");
        System.out.println("Alias: " + target.getAlias());
        System.out.println("Hp: " + target.getHp());
        System.out.println("Mp: " + target.getMp());
    }

    public void takeDamage(int dmg, Ragnarok target) {


        // Traits/(Passive):
        if (this.getAlias().equalsIgnoreCase("Veigar")) {
            // Greedy: Any attacks dealt by the wizard will deal additional damage be based
            // on 10% of his current energy
            int addDmg = (int) (this.getMp() * .10);
            dmg = dmg + addDmg;
            System.out.println(this.getAlias()+" will deal additional damage be based on 10% of his current energy");
        }
        if (target.getAlias().equalsIgnoreCase("Veigar")) {
            /*
             * Absorption: if the wizard takes damage, 20% of the damage taken will be
             * converted to energy.
             * Note:
             * 
             * Absorption will not block the attack. Damage will still be applied but he
             * will also convert 20% of the damage taken into energy.
             */
            int Absorption = (int) (dmg * .20);
            target.setMp(target.getMp()+Absorption);
        }
        if (target.getAlias().equalsIgnoreCase("Genbu")) {
            // Fragile: Assassin will take additional 5 damage from any source.
            dmg = dmg + 5;
            // Agile: Has a 30% chance to dodge an attack if the assassin has more than 30
            // energy
            Random s = new Random();
            int result = s.nextInt(1, 4);
            if (result == 2 && target.getMp() > 30) {
                dmg = 0;
                System.out.println(target.getAlias()+ " dodge it");
            }
        }
        if (this.getAlias().equalsIgnoreCase("mercene")) {
            // Focus: if the target has 20% or less health remaining instantly kill the
            // target.
            if (target.getHp() <= 20) {
                target.setHp(0);
            }
            Random s = new Random();
            int result = s.nextInt(1, 6);
            if (result == 2) {
                dmg = 0;
                System.out.println(this.getAlias() + " miss the target");
            } 
        }

        // computation of target's health and dmg
        target.setHp(target.getHp() - dmg);
        if (target.getHp() <= 0) {
            target.setHp(0);
            System.out.println(target.getAlias() + " KO");
        }
        showStat(target);
    }

    public void undodgeable(int dmg, Ragnarok target) {
        // same method statement sa takeDamage method, tinanggal ko lng yung passive na
        // dodge ni Genbu(Assasin)


        // Traits/(Passive):
        if (this.getAlias().equalsIgnoreCase("Veigar")) {
            // Greedy: Any attacks dealt by the wizard will deal additional damage be based
            // on 10% of his current energy
            int addDmg = (int) (this.getMp() * .10);
            dmg = dmg + addDmg;
            System.out.println(this.getAlias()+" will deal additional damage be based on 10% of his current energy");
        }
        if (target.getAlias().equalsIgnoreCase("Veigar")) {
            /*
             * Absorption: if the wizard takes damage, 20% of the damage taken will be
             * converted to energy.
             * Note:
             * 
             * Absorption will not block the attack. Damage will still be applied but he
             * will also convert 20% of the damage taken into energy.
             */
            int Absorption = (int) (dmg * .20);
            target.setMp(target.getMp()+Absorption);
        }
        if (target.getAlias().equalsIgnoreCase("Genbu")) {
            // Fragile: Assassin will take additional 5 damage from any source.
            dmg = dmg + 5;

            // -------------------------------------------------------------

        }
        if (this.getAlias().equalsIgnoreCase("mercene")) {
            // Focus: if the target has 20% or less health remaining instantly kill the
            // target.
            if (target.getHp() <= 20) {
                target.setHp(0);
            }
            Random s = new Random();
            int result = s.nextInt(1, 6);
            if (result == 2) {
                dmg = 0;
                System.out.println(this.getAlias() + " miss the target");
            }else {
                // Arrowshot(): deals 20 physical damage to a target and if it hits gain 5
                // energy.
                this.setMp(this.getMp() + 5);
                System.out.println(this.getAlias() + " gain 5 energy.");
            }
        }

        // computation of target's health and dmg
        target.setHp(target.getHp() - dmg);
        if (target.getHp() <= 0) {
            target.setHp(0);
            System.out.println(target.getAlias() + " KO");
        }
        showStat(target);
    }

    public void Arrowshothits(int dmg, Ragnarok target) {
        // same method statement sa takeDamage method, dinagdag ko lng yung passive ng
        // Arrow shot ni Mercene(Hunter)

        // Traits/(Passive):
        if (this.getAlias().equalsIgnoreCase("Veigar")) {
            // Greedy: Any attacks dealt by the wizard will deal additional damage be based
            // on 10% of his current energy
            int addDmg = (int) (this.getMp() * .10);
            dmg = dmg + addDmg;
            System.out.println(this.getAlias()+" will deal additional damage be based on 10% of his current energy");
        }
        if (target.getAlias().equalsIgnoreCase("Veigar")) {
            /*
             * Absorption: if the wizard takes damage, 20% of the damage taken will be
             * converted to energy.
             * Note:
             * 
             * Absorption will not block the attack. Damage will still be applied but he
             * will also convert 20% of the damage taken into energy.
             */
            int Absorption = (int) (dmg * .20);
            target.setMp(target.getMp()+Absorption);
        }
        if (target.getAlias().equalsIgnoreCase("Genbu")) {
            // Fragile: Assassin will take additional 5 damage from any source.
            dmg = dmg + 5;
            // Agile: Has a 30% chance to dodge an attack if the assassin has more than 30
            // energy
            Random s = new Random();
            int result = s.nextInt(1, 4);
            if (result == 2 && target.getMp() > 30) {
                dmg = 0;
                System.err.println(target.getAlias()+" dodge it");
            }
        }
        if (this.getAlias().equalsIgnoreCase("mercene")) {
            // Focus: if the target has 20% or less health remaining instantly kill the
            // target.
            if (target.getHp() <= 20) {
                target.setHp(0);
            }
            Random s = new Random();
            int result = s.nextInt(1, 6);
            if (result == 2) {
                dmg = 0;
                System.out.println(this.getAlias() + " miss the target");
            } else {

                // ----------------------------------------------------------------------------------------------------------

                // Arrowshot(): deals 20 physical damage to a target and if it hits gain 5
                // energy.
                this.setMp(this.getMp() + 5);
                System.out.println(this.getAlias() + " gain 5 energy.");
            }
        }

        // computation of target's health and dmg
        target.setHp(target.getHp() - dmg);
        if (target.getHp() <= 0) {
            target.setHp(0);
            System.out.println(target.getAlias() + " KO");
        }
        showStat(target);
    }

}
