package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (cat data)
        String givenName = "FATCAT";
        Date givenBirthDate = new Date();

        String expected = "CHONKY";

        // When (a cat is constructed)
        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);

        // When
        cat.setName("CHONKY");
        String actual = cat.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        String givenName = "FATCAT";
        Date givenBirthDate = new Date();

        String expected = "meow!";

        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        // Given (cat data)
        String givenName = "FATCAT";
        Date givenBirthDate = new Date();

        Date expected = new Date(1986, 7, 29);

        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);

        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        String givenName = "FATCAT";
        Date givenBirthDate = new Date();
        int expected = 6;

        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);
        Food food = new Food();

        cat.eat(food);
        cat.eat(food);
        cat.eat(food);
        cat.eat(food);
        cat.eat(food);
        cat.eat(food);

        int actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest() {
        String givenName = "FATCAT";
        Date givenBirthDate = new Date();
        int givenID = 99;

        int expected = 99;

        Cat cat = new Cat(givenName, givenBirthDate, givenID);

        int actual = cat.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest() {
        String givenName = "FATCAT";
        Date givenBirthDate = new Date();

        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);

        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        String givenName = "FATCAT";
        Date givenBirthDate = new Date();

        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);

        Assert.assertTrue(cat instanceof Mammal);
    }
}
