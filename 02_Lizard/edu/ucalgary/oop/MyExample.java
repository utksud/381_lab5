package edu.ucalgary.oop;

class Animal {
    private int age;

    public Animal(int age) {
        this.setAge(age);
    }

    public Animal() {
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Nom nom nom");
    }
}

class Reptile extends Animal {
    private String scales;

    public Reptile(int age) {
        super(age);
    }

    public Reptile(int age, String scales) {
        super(age);
        setScales(scales);
    }

    public String getScales() {
        return this.scales;
    }

    public void setScales(String scales) {
        this.scales = scales;
    }
}

class Lizard extends Reptile {
    private int tailLength;
    private int tongueLength;

    public Lizard(int age) {
        super(age);
    }

    public Lizard(String scales, int age) {
        super(age, scales);
    }

    public Lizard(String scales, int age,
                  int tailLength, int tongueLength) {
        super(age, scales);
        setTailLength(tailLength);
        setTongueLength(tongueLength);
    }

    public int getTailLength() {
        return this.tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public int getTongueLength() {
        return this.tongueLength;
    }

    public void setTongueLength(int tongueLength) {
        this.tongueLength = tongueLength;
    }

    public void run() {
        System.out.println("The lizard is running.");
    }
}

public class MyExample {
    public static void main(String[] args) {
        Lizard chameleon =
                new Lizard("multi-hued", 2);

        Lizard gecko =
                new Lizard("green", 1, 3, 1);

        System.out.println("Chameleons are " +
                chameleon.getScales() +
                " and this one is " +
                chameleon.getAge() +
                " years old.");

        chameleon.run();

        System.out.println("The gecko has a tail " +
                gecko.getTailLength() +
                " centimetres long and a tongue " +
                gecko.getTongueLength() +
                " centimetres long.");

        gecko.run();
        gecko.eat();
    }
}