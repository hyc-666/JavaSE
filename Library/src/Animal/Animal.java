package Animal;

public class Animal implements Cloneable{
    int[] arr = new int[]{1,2,3};
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){

    }

    @Override
    public Animal clone() throws CloneNotSupportedException {

        return (Animal)super.clone();
    }
}
