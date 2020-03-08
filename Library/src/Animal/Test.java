package Animal;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal = new Animal("cat");
        Animal animal1 = animal.clone();
        System.out.println(animal.name.hashCode());
        System.out.println(animal1.name.hashCode());

        System.out.println(animal.name == animal1.name);

        System.out.println(animal == animal1);

        animal1.name= "dog";
        System.out.println(animal.name.hashCode());
        System.out.println(animal1.name.hashCode());
        System.out.println(animal.name);
        System.out.println(animal1.name);

        System.out.println(Arrays.toString(animal.arr));
        System.out.println(Arrays.toString(animal1.arr));
        animal.arr[0] = 4;

        System.out.println(Arrays.toString(animal.arr));
        System.out.println(Arrays.toString(animal1.arr));



    }
}
