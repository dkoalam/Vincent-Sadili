

import java.util.*;

public class Samurai extends Human{

    public Samurai(String name, String gender, String job, int hp, int mp, int intg, int str) {
        super(name, gender, job, hp, mp, intg, str);
    }

    public Samurai(String name, String gender, String job) {
        super(name, gender, job);
    }
    public void attackSamurai(Human target){
        if (target.getHp() < 0) {
            target.setHp(0);
            // (Samurai) - if the samurai takes damage and has his health reduced to 0,
            // there is a 50% chance to return to life and gain 1 hp.
            if (target.getJob().equalsIgnoreCase("samurai")  ) {

                if (target.getHp() <= 0) {
                    Random s = new Random();
                    int result = s.nextInt(1, 3);
                    if (result == 2) {
                        target.setHp(target.getHp() + 1);

                    }
                }
            }
        }
    }
}
