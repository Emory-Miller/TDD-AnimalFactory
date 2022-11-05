package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        Dog dog = AnimalFactory.createDog("Rudy", new Date());

        String expected = "rocks.zipcodewilmington.animals.Dog";

        String actual = dog.getClass().getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCatTest(){
        Cat cat = AnimalFactory.createCat("Kimba", new Date());

        String expected = "rocks.zipcodewilmington.animals.Cat";

        String actual = cat.getClass().getName();

        Assert.assertEquals(expected, actual);
    }
}
