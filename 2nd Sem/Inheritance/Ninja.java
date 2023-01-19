public class Ninja extends Human{

    public Ninja(String name, String gender, String job, int hp, int mp, int intg, int str) {
        super(name, gender, job, hp, mp, intg, str);
    }

    public Ninja(String name, String gender, String job) {
        super(name, gender, job);
    }
    public void backStab(Human target){
//(Ninja) - backstab -> the ninja will have stab the enemy dealing 10 damage, this will deal 30 damage if the enemy has less than 60% of the maximum hp.
        int dmg = 10;
        if(target.getHp()<60){
            dmg=30;
        }
        takeAttack(dmg, target);


    }
    
}
