// Gavin Perry, 12/15/2023, The purpose of this program is to create a cat class that includes an overloaded and default constructor as well as overloaded methods and getters and setters
public class CatV8 {
    private int lives = 9;
    private String name;
    private int age;
    private String color;
    
    public CatV8() {
    }
    
    public CatV8(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fall(String name) {
        System.out.println("Oh No! " + name + " fell!");
        System.out.println("...");
        System.out.println(name + " stuck the landing!");
    }

    public void judge(String person) {
        System.out.println(person + " looks... interesting...");
    }

    public void judge(String person, int personAge) {
        if (personAge > 20) {
            System.out.println(person + " looks like they are going to fossilize they're so old.");
        } else {
            System.out.println("Wait is that an person or a gremlin?");
        }
    }

    public void gainLife() {
        System.out.println(name + " has gained a life!");
        lives++;
    }
}