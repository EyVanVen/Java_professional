package homework10.task3;

public class Animal implements Cloneable{
    int age = 10;
    int kids = 4;
    String breed;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", kids=" + kids +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
