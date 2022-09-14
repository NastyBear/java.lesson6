package java1.lessonsforqa.lesson6;

public class Cat extends Animals{
    public Cat(String name) {
        super(name);
        this.name = name;
    }
    int maxDistance = 200;

    @Override
    public void run( int distance) {
        super.run(distance);
        if (distance < maxDistance) {
            System.out.println(this.name + " пробежал " + distance);
        }else {
            System.out.println(this.name + " устал ");
        }
    }
    @Override
    public void swim(int swDistance) {
        super.swim(swDistance);
        System.out.println(this.name + " не умеет плавать " );
    }
}

