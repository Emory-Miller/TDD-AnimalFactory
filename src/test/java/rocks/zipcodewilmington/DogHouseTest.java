package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.*;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        clear();

        // When
        add(animal);

        // Then
        getNumberOfDogs();
    }

    @Test
    public void addTest(){
        Dog dog = new Dog("Rudy", new Date(), 1);
        int expected = 1;
        clear();

        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog);

        int actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
        dogHouse.clear();
    }

    @Test
    public void removeByIDTest(){
        Dog dog1 = new Dog("Rudy", new Date(), 1);
        Dog dog2 = new Dog("Claire", new Date(), 2);
        Dog dog3 = new Dog("Layla", new Date(), 3);
        int expected = 2;

        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog1);
        dogHouse.add(dog2);
        dogHouse.add(dog3);

        dogHouse.remove(1);

        int actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
        dogHouse.clear();
    }

    @Test
    public void removeByNameTest(){
        Dog dog1 = new Dog("Rudy", new Date(), 1);
        Dog dog2 = new Dog("Claire", new Date(), 2);
        Dog dog3 = new Dog("Layla", new Date(), 3);
        int expected = 2;

        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog1);
        dogHouse.add(dog2);
        dogHouse.add(dog3);

        dogHouse.remove(dog3);

        int actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
        dogHouse.clear();
    }

    @Test
    public void getDogByIDTest(){
        Dog dog1 = new Dog("Rudy", new Date(), 1);
        Dog dog2 = new Dog("Claire", new Date(), 2);
        Dog dog3 = new Dog("Layla", new Date(), 3);

        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog1);
        dogHouse.add(dog2);
        dogHouse.add(dog3);

        Dog actual = dogHouse.getDogById(1);

        Assert.assertEquals(dog1, actual);
        dogHouse.clear();
    }

    @Test
    public void getNumberOfDogsTest(){
        Dog dog1 = new Dog("Rudy", new Date(), 1);
        Dog dog2 = new Dog("Claire", new Date(), 2);
        Dog dog3 = new Dog("Layla", new Date(), 3);
        int expected = 3;

        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog1);
        dogHouse.add(dog2);
        dogHouse.add(dog3);

        int actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
        dogHouse.clear();
    }
}
