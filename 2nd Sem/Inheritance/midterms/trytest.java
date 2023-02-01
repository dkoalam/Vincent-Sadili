//sadili_INF222
public class trytest {

    public static void main(String[] args) {
        Assassin c1 = new Assassin("Genbu",80, 50);
        Hunter c2 = new Hunter("Mercene", 100, 40);
        Wizard c3 = new Wizard("Veigar", 100, 80);
 //
 //
 //
 //
 
 c3.FocusBeam(c1);
 System.out.println();
 c1.Backstab(c3);
 System.out.println();
 c2.Snipe(c1);
 System.out.println();
 c2.Snipe(c3);
 System.out.println();
 c1.Punch(c3);
 System.out.println();
 c2.Arrowshot(c1);
 System.out.println();
 c3.FocusBeam(c2);
 System.out.println();
 c3.StaffSmite(c1);
    }
}
