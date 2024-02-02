// Gavin Perry, 12/15/23, The purpose of this program is create a Cat class with a default constructor and methods.
public class CatV3 {
    public CatV3() {
    }

    public int getLives(int age) {
        return 9 - (age / 3);
    }

    public void fall(String name) {
        System.out.println("Oh No! " + name + " fell!");
        System.out.println("...");
        System.out.println(name + " stuck the landing!");
    }

    public void judge(String person) {
        System.out.println(person + " looks... interesting...");
    }
}