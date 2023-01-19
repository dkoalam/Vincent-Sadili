public class testtry {
   public static void main(String[] args) {
    Ninja c1=new Ninja("hayabusa", "m", "ninja");
    Samurai c2=new Samurai("alu", "m", "samurai");
    Wizard c3=new Wizard("Kagura", "F", "wizard");
        // (Samurai) - if the samurai takes damage and has his health reduced to 0,
        // there is a 50% chance to return to life and gain 1 hp. 
c1.attack(c2);
c1.attack(c2);
c1.attack(c2);
c1.attack(c2);
c1.attack(c2);
c1.attack(c2);
c1.attack(c2);
c1.attack(c2);
c1.attack(c2);
  // (Wizard) - fireBall -> damage dealt will be based on the intelligence of the
        // wizard plus 10% of the current hp of the target. decreases wizard's mp by 10
c3.fireBall(c1);
// (Wizard) - wiseSmash -> damage dealt will be based on the the intelligence of
        // the wizard plus the difference between the int of the wizard and the target.
        // increase wizard's mp by 10
c3.wiseSmash(c2);
//(Ninja) - backstab -> the ninja will have stab the enemy dealing 10 damage, this will deal 30 damage if the enemy has less than 60% of the maximum hp.
c1.backStab(c3);
c1.backStab(c3);
c1.backStab(c3);
c1.backStab(c3);
   } 
}
