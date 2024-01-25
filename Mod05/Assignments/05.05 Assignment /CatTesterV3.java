// Gavin Perry, 12/15/2023, The purpose of this program is to test the instantiate and test the methods of the CatV3 class
public class CatTesterV3
{
    public static void main(String[] args) {
        String name = "Bones";
        int age = 3;
        String owner = "James";
        
        CatV3 bones = new CatV3();
        int lives = bones.getLives(age);
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

    }
}

