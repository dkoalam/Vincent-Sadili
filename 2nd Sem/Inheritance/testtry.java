public class testtry {
   public static void main(String[] args) {
      Ninja c1 = new Ninja("steven", "Ninja", 11, 3, 4);
      Wizard c2 = new Wizard("Elijah", "Wizard", 2, 1, 15);
      Samurai c3 = new Samurai("Vionne", "Samurai", 3, 14, 1);
      // wizard skills
      // (Wizard) - fireBall -> damage dealt will be based on the intelligence of the
      // wizard plus 10% of the current hp of the target. decreases wizard's mp by 10
      // c2.fireBall(c3);
      // (Wizard) - wiseSmash -> damage dealt will be based on the the intelligence of
      // the wizard plus the difference between the int of the wizard and the target.
      // increase wizard's mp by 10
      //c2.wiseSmash(c1);

      // Ninja Skill (Ninja) - backstab -> the ninja will have stab the enemy dealing
      // 10 damage, this will deal 30 damage if the enemy has less than 60% of the
      // maximum hp.
      // (Wizard) - the wizard will take plus 5 damage from any source "FRAGILE
      // CHARACTER"
      // c1.backstab(c2);

      // Samurai revived (Samurai) - if the samurai takes damage and has his health
      // reduced to 0, there is a 50% chance to return to life and gain 1 hp.
      // c2.fireBall(c3);
      // c2.fireBall(c3);
      // c2.fireBall(c3);
      // c2.fireBall(c3);
      // c2.fireBall(c3);

      // Ninja crit (Ninja) - backstab -> the ninja will have stab the enemy dealing
      // 10 damage, this will deal 30 damage if the enemy has less than 60% of the
      // maximum hp.
      // c1.backstab(c3);
      // c1.backstab(c3);
      // c1.backstab(c3);
      // c1.backstab(c3);
      // c1.backstab(c3);
      // c1.backstab(c3);

   }
}
