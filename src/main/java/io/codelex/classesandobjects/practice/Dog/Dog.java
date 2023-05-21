package io.codelex.classesandobjects.practice.Dog;

class Dog {
    private String name;
    private String sex;
    private Dog mother;
    private Dog father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String toString() {
        return "Name: " + name + ", Sex: " + sex;
    }

    public String fathersName() {
        if (father != null) {
            return father.name;
        }
        return "Unknown";
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        return this.mother != null && otherDog.mother != null && this.mother.equals(otherDog.mother);
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public void setFather(Dog father) {
        this.father = father;
    }
}

