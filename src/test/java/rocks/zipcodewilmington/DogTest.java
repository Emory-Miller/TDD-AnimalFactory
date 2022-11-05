package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest() {

        String givenName = "Rudy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {
        String givenName = "Rudy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        String expected = "bark!";

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        String givenName = "Rudy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Date expected = new Date(1986, 7, 29);

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        String givenName = "Rudy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        int expected = 6;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Food food = new Food();

        dog.eat(food);
        dog.eat(food);
        dog.eat(food);
        dog.eat(food);
        dog.eat(food);
        dog.eat(food);

        int actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest() {
        String givenName = "Rudy";
        Date givenBirthDate = new Date();
        Integer givenID = 99;

        int expected = 99;

        Dog dog = new Dog(givenName, givenBirthDate, givenID);

        int actual = dog.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest() {
        String givenName = "Rudy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        String givenName = "Rudy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
