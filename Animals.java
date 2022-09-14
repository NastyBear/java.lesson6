package java1.lessonsforqa.lesson6;

public abstract class  Animals {
    public String name;
    public static int count;

    public Animals(String name){
        this.name = name;
        count++;
    }

    public void run (int distance){

        }

    public void swim (int swDistance){

    }
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот "+"Бегимот");
        cat1.run(400);
        cat1.swim(100);
        Dog dog1 = new Dog("Пес "+"Кисель");
        dog1.swim(5);
        Cat cat2 = new Cat("Барбос");
        System.out.println("Всего животных "+ count);

        }
    }

