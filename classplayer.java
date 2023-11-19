public class player {
    String name;
    short age;
    short rank;

    void pass(){
        System.out.println(name + "passes the ball ");
    }
    void pass_2(){
        System.out.println(name + "passes the ball ");
    }
    void shoot (){
        System.out.println(name + "shoots the ball ");
    }
    void jump(){
        System.out.println(name + "jumps");
    }
    void score (){
        System.out.println(name + "scored a Goal ");
    }
    void info(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Rank : " + rank);
    }
}
