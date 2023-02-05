//sadili_INF222
public class trytest {

    public static void main(String[] args) {
        Ragnarok c1 = new Assassin("Genbu", 80, 50);
        Ragnarok c2 = new Hunter("Mercene", 100, 40);
        Ragnarok c3 = new Wizard("Veigar", 100, 80);

        // c3.firstSkill(c1);;//--target hp computation (FocusBeam(dmg = 30)+ genbu
        // Fragile(5)+(this.getMp() * .10))-genbu(hp= 80)
        // System.out.println();
        // c1.firstSkill(c3);;//-- target hp computation (Backstab(dmg = 40
        // )+(target.getHp() * .20))-veigar(hp=100)
        // System.out.println();
        // c2.firstSkill(c1);;//--target hp computation (Snipe(dmg = 40)+genbu
        // fragile(5))-80
        // System.out.println();
        // c2.firstSkill(c3);; //--target hp computation (Snipe(dmg = 40)-veigar(hp -
        // 100)
        // System.out.println();
        // c1.secondSkill(c3);;//--target hp computation Punch(dmg =10)+veigar(hp - 100)
        // System.out.println();
        // c2.secondSkill(c1);;//--target hp computation (Arrowshot(dmg = 20)+genbu
        // fragile(5))-genbu(hp=80)
        // System.out.println();
        // c3.firstSkill(c2);;//--target hp computation (FocusBeam(dmg =30)+ Wizard
        // Greedy)-Mercene(hp = 100 )
        // System.out.println();
        // c3.secondSkill(c1);;//--target hp computation (StaffSmite(dmg = 10)+genbu
        // fragile(5)+Wizard Greedy)-genbu(hp=80)

        // --All mana computation is correct
    }
}
