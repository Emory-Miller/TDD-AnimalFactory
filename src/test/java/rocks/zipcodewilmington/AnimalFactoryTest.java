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
        Dog dog = AnimalFactory.createDog("Rudy", new Date(1986, 7, 29));

        String expectedClass = "rocks.zipcodewilmington.animals.Dog";
        String expectedName = "Rudy";
        Date expectedDate = new Date(1986 ,7, 29);


        String actualClass = dog.getClass().getName();
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(expectedClass, actualClass);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void createCatTest(){
        Cat cat = AnimalFactory.createCat("Kimba", new Date(1986, 7, 29));

        String expectedClass = "rocks.zipcodewilmington.animals.Cat";
        String expectedName = "Kimba";
        Date expectedDate = new Date(1986 ,7, 29);

        String actualClass = cat.getClass().getName();
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(expectedClass, actualClass);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
