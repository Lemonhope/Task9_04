package Task9_04;

public class Plants {
    private int age;
    public String name;
    protected double height;

    public Plants(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Plants(String name) {
        this.name = name;
    }
    public void newPlant(String name){
        this.age=0;
        this.name=name;
        this.height=0;
    }
    private static Plants findPlant(String name){
        // some code
        return new Plants((name));
    }
    protected static int getTrueTreeAge(Plants tree){
        //some code
        return (tree.age * 12);
    }
}
