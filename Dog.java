package java1.lessonsforqa.lesson6;

public class Dog extends Animals{

    public Dog(String name) {
        super(name);
        this.name = name;
    }
    int maxDistance = 500;
    int maxDistanceSw = 10;

    @Override
    public void run(int distance) {
        super.run(distance);
        if (distance < maxDistance) {
            System.out.println(this.name + " пробежал " + distance);
        } else {
            System.out.println(this.name + "устал");
        }
    }

    @Override
    public void swim(int swDistance) {
        super.swim(swDistance);
        if (swDistance < maxDistanceSw) {
            System.out.println(this.name + " проплыл " + swDistance);
        }else {
            System.out.println(this.name + " устал");
        }
    }
}
