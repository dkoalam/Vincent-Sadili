import java.util.*;

//sadili_INF222
public class Wizard extends Ragnarok {

    public Wizard(String alias, int hp, int map) {
        super(alias, hp, map);
    }
   public void FocusBeam(Ragnarok target){
    if(this.getHp()<=0 || this.getMp()<=0){
        if(this.getHp()<=0){
          System.out.println(this.getAlias()+" cant attack because "+this.getAlias()+" is now dead.");  
        }
        if( this.getMp()<=0){
            System.out.println(this.getAlias()+ " mana not enough");
        }
        
    }else{
            int dmg = 30;
    Random s = new Random();
    int result = s.nextInt(1,3);
    if(result==2){
        this.setMp(this.getMp()+10);
       
    }
    System.out.println(this.getAlias()+ " use Focus Beam against "+ target.getAlias());
     this.setMp(this.getMp()-20);
     takeAttack(dmg, target);
    }

}
public void StaffSmite(Ragnarok target){
    if(this.getHp()<=0 || this.getMp()<=0){
        if(this.getHp()<=0){
          System.out.println(this.getAlias()+" cant attack because you are dead.");  
        }
        if( this.getMp()<=0){
            System.out.println(this.getAlias()+ " mana not enough");
        }
        
    }else{
            int dmg = 10;
    this.setHp(this.getHp()+10);
    this.setMp(this.getMp()+10);
    System.out.println(this.getAlias()+ " use StaffSmite against "+ target.getAlias());
    takeAttack(dmg, target);
    }

}
}