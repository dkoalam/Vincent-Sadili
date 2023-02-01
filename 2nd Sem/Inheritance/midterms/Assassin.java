public class Assassin extends Ragnarok {
    public Assassin(String alias, int hp, int map) {
        super(alias, hp, map);
    }

    // Backstab(): deals 30 Damage plus 20% of the target’s current health – costs
    // 20 energy to cast
    public void Backstab(Ragnarok target) {
        if (this.getHp() <= 0 || this.getMp() <= 0) {
            if (this.getHp() <= 0) {
                System.out.println(this.getAlias()+" cant attack because "+this.getAlias()+" is now dead.");  
            }
            if (this.getMp() <= 0) {
                System.out.println(this.getAlias() + " mana not enough");
            }

        } else {
            int dmg = (int) (30 + (target.getHp() * .20));
            this.setMp(this.getMp() - 20);
            System.out.println(this.getAlias() + " use back stab to " + target.getAlias());
            takeAttack(dmg, target);
        }

    }

    // Punch(): deals 10 physical damage to a target and increases the assassin’s
    // energy by 15
    public void Punch(Ragnarok target) {
        if (this.getHp() <= 0 || this.getMp() <= 0) {
            if (this.getHp() <= 0) {
                System.out.println(this.getAlias()+" cant attack because "+this.getAlias()+" is now dead.");  
            }
            if (this.getMp() <= 0) {
                System.out.println(this.getAlias() + " mana not enough");
            }

        } else {
            int dmg = 10;
            this.setMp(this.getMp() + 15);
            System.out.println(this.getAlias() + " use punch to " + target.getAlias());
            takeAttack(dmg, target);
        }

    }

}
