

import java.util.Random;

public class Human {
   private String name,gender,job;
   private int hp=100,mp=100,intg=3,str=3,agi=3;
public Human(String name, String gender, String job, int hp, int mp, int intg, int str) {
    this.name = name;
    this.gender = gender;
    this.job = job;
    this.hp = hp;
    this.mp = mp;
    this.intg = intg;
    this.str = str;
}
public Human(String name, String gender, String job) {
    this.name = name;
    this.gender = gender;
    this.job = job;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public String getJob() {
    return job;
}
public void setJob(String job) {
    this.job = job;
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
public int getIntg() {
    return intg;
}
public void setIntg(int intg) {
    this.intg = intg;
}
public int getStr() {
    return str;
}
public void setStr(int str) {
    this.str = str;
}
public int getAgi() {
    return agi;
}
public void setAgi(int agi) {
    this.agi = agi;
} 
public void attack(Human target){
System.out.println(this.getName()+" VS " + target.getName());
int dmg=0;
if(this.getJob().equalsIgnoreCase("Wizard")){
    //    1. if the attacker is a wizard the damage should be based on the intelligence of the character+ strength
   dmg=this.getIntg()+this.getStr();

}else if(this.getJob().equalsIgnoreCase("Samurai")){
    //    2. if the attacker is samurai the damage dealt will be strength of the attacker x2 but will also deal damage to himself by half of his strength.
    dmg=this.getStr()*2;
    this.setHp(this.getHp()-(this.getStr()/2));
}else if(this.getJob().equalsIgnoreCase("ninja")){
    //    3. if the attacker is a ninja damage dealt will be character agi + strength of the target.
    dmg=this.getAgi()+target.getStr();
}

takeAttack(dmg, target);
}

public void takeAttack(int dmg,Human target){
//    4. if the target is a ninja there is 50% chance that the ninja takes no damage from the attack.
     if(target.getJob().equalsIgnoreCase("ninja")){
        Random s = new Random();
        int result = s.nextInt(1,3);
        if(result==2){
            dmg=0;
            System.out.println("ninja takes no damage");
        }
    }
    //(Wizard) - the wizard will take plus 5 damage from any source "FRAGILE CHARACTER"
    if(!this.getJob().equalsIgnoreCase("wizard")){
        dmg=dmg+5;
    } 
      target.setHp(target.getHp()-dmg);
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
    if (target.getHp() < 0) {
        target.setHp(0);

    }
    if(target.getHp()>0){
        if (target.getJob().equalsIgnoreCase("samurai") ){

            System.out.println("samurai died pero nabuhay uli: gain 1hp");
        } 
  System.out.println(this.getName()+" attack "+target.getName());
    System.out.println(target.getName()+" take "+dmg+", now has a hp of "+target.getHp());
    System.out.println("attackers hp is "+this.getHp());
    }else{
        if(target.getHp()<0){
            target.setHp(0);

        }

        System.out.println(target.getName()+" take "+dmg+", now has a hp of "+target.getHp());
       System.out.println("dead na si "+target.getName()); 
       
    }
      
 
}

   
}
