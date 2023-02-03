import java.util.*;
public class Ragnarok {
    private String Alias = "Unknown";
    private int hp = 100, mp = 50;

    public Ragnarok(String alias, int hp, int map) {
        this.Alias = alias;
        this.hp = hp;
        this.mp = map;
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
    public void showStat(Ragnarok target){
        System.out.println(this.getAlias() + ": " );
        System.out.println("Hp: " + this.getHp());
        System.out.println("Mp: " + this.getMp());

        System.out.println("");
        System.out.println(target.getAlias() + ": ");
        System.out.println("Hp: " + target.getHp());
        System.out.println("Mp: " + target.getMp());
    }



    public void takeAttack(int dmg, Ragnarok target) {
        
        // Agile: Has a 30% chance to dodge an attack if the assassin has more than 30
        // energy
        if (target.getAlias().equalsIgnoreCase("Genbu")) {
            dmg = dmg + 5;
            Random s = new Random();
            int result = s.nextInt(1, 5);
            if (result == 2 && this.getMp() > 30) {
                dmg = 0;
                System.out.println(target.getAlias() + " dodge it");
            }

        }

        if(this.getAlias().equalsIgnoreCase("Mercene")){
            Random s = new Random();
            int result=s.nextInt(1,5);
            if(result==2){
                dmg=0;
                System.out.println(this.getAlias()+" miss the target");
            }else{
                this.setMp(this.getMp()+5);
                System.out.println(this.getAlias()+ " gain 5 energy ");
            }
            int tarhp=(int) (target.getHp()*.20);
            if(target.getHp()<=tarhp){
target.setHp(0);

            }
            
        }
        target.setHp(target.getHp() - dmg);

        if(this.getAlias().equalsIgnoreCase("Veigar")){
            dmg=(int) (dmg+(this.getMp()*.10));
            
        }
        if(target.getAlias().equalsIgnoreCase("Veigar")){
            int perdmg=(int) (dmg*.20);
            target.setMp(this.getMp()+perdmg);

        }

             if (target.getHp() <= 0 ) {
            if(target.getHp() <= 0){
            target.setHp(0);
            System.out.println(target.getAlias() + " is now dead ");
        }if(this.getMp() <= 0){
            System.out.println(this.getAlias()+" cant do skill hehas no energy left");
        }
    }
  else {
    
            System.out.println(target.getAlias() + " now have " + target.getHp() + " hp and mp of " + target.getMp());
            showStat(target);
        }
  

    }
}
