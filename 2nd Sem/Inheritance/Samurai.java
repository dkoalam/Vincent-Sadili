public class Samurai extends Human {

    public Samurai(String name, String job, int agi, int str, int inte, int hp, int mp) {
        super(name, job, agi, str, inte, hp, mp);
    }

    public Samurai(String name, String job, int agi, int str, int inte) {
        super(name, job, agi, str, inte);
    }

    public Samurai(String name, String job) {
        super(name, job);
    }

}
