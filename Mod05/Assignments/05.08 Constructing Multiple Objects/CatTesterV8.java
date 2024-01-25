// Gavin Perry, 12/15/2023, The purpose of this program is to test the instantiate and test the methods of the CatV8 class
public class CatTesterV8
{
    public static void main(String[] args) {
        String name = "Bones";
        int age = 3;
        String owner = "James";
        
        CatV8 bones = new CatV8();
        CatV8 jones = new CatV8("Jones", 15, "Brown");
        CatV8 gnomes = new CatV8();
        int lives = bones.getLives();
        System.out.println("\t= CatTesterV3 =");
        System.out.println("=================================");
        System.out.println("\t- Life count: -");
        System.out.println(name + " Has " + lives + " More Lives!");
        System.out.println("--------------------------");

        System.out.println("\t- Fall test: -");
        bones.fall(name);
        System.out.println("--------------------------");
        System.out.println("\t- Judge test: -");
        bones.judge(owner);
        System.out.println("\t- Overloaded judget test -");
        jones.judge("Gavin", 89);

        System.out.println(" = Constructor objects: = ");
        System.out.println(jones.getName());
        System.out.println(jones.getAge());
        System.out.println(jones.getColor());

    }
}

