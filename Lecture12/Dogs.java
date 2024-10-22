package Lecture12;

public class Dogs extends Animals{
    String name;
    String voice;
    String color;
    //Default Constructor
    public Dogs(){}
    //Custom Constructor
    public Dogs(
        String name,
        String voice,
        String color,
        int leg,
        boolean tail,
        int food
    ){
        this.name = name;
        this.voice = voice;
        this.color = color;
        this.tail = tail;
        this.legs= leg;
        this.food = food;
    }

    void Displays(){
        System.out.println(this.name);
        System.out.println(this.voice);
        System.out.println(this.color);
        System.out.println(this.legs);
        System.out.println(this.tail);
        System.out.println(this.fh.habit[this.food]);
    }
}
