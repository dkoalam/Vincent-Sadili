public class Hunter extends Ragnarok{
    public Hunter(String alias, int hp, int map) {
        super(alias, hp, map);
    }
    public void Snipe(Ragnarok target){
        if(this.getHp()<=0 || this.getMp()<=0){
            if(this.getHp()<=0){
                System.out.println(this.getAlias()+" cant attack because "+this.getAlias()+" is now dead.");  
            }
            if( this.getMp()<=0){
                System.out.println(this.getAlias()+ " mana not enough");
            }
            
        }else{
            int dmg = 40;
        this.setMp(this.getMp()-15);
        System.out.println(this.getAlias()+" use Snipe againts "+target.getAlias());
        takeAttack(dmg, target);
        }
        
    }
    public void Arrowshot(Ragnarok target){
        if(this.getHp()<=0 || this.getMp()<=0){
            if(this.getHp()<=0){
              System.out.println(this.getAlias()+" cant attack because you are dead.");  
            }
            if( this.getMp()<=0){
                System.out.println(this.getAlias()+ " mana not enough");
            }
            
        }else{
          int dmg =20;
        System.out.println(this.getAlias()+" use Arrow Shot againts "+target.getAlias());
        takeAttack(dmg,target);   
        }
       

    }
       
}
