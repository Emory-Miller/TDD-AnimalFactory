package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){
        Cat cat = new Cat("Ducky", new Date(), 1);
        int expected = 1;

        CatHouse catHouse = new CatHouse();

        catHouse.add(cat);

        int actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
        catHouse.clear();
    }

    @Test
    public void removeByIDTest(){
        Cat cat1 = new Cat("Ducky", new Date(), 1);
        Cat cat2 = new Cat("Nacho", new Date(), 2);
        Cat cat3 = new Cat("Kimba", new Date(), 3);
        int expected = 2;

        CatHouse catHouse = new CatHouse();

        catHouse.add(cat1);
        catHouse.add(cat2);
        catHouse.add(cat3);

        catHouse.remove(3);

        int actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
        catHouse.clear();
    }

    @Test
    public void removeByNameTest(){
        Cat cat1 = new Cat("Ducky", new Date(), 1);
        Cat cat2 = new Cat("Nacho", new Date(), 2);
        Cat cat3 = new Cat("Kimba", new Date(), 3);
        int expected = 2;

        CatHouse catHouse = new CatHouse();

        catHouse.add(cat1);
        catHouse.add(cat2);
        catHouse.add(cat3);

        catHouse.remove(cat3);

        int actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
        catHouse.clear();
    }
    @Test
    public void getCatByIdTest(){
        Cat cat1 = new Cat("Ducky", new Date(), 1);
        Cat cat2 = new Cat("Nacho", new Date(), 2);
        Cat cat3 = new Cat("Kimba", new Date(), 3);

        Cat expected = cat1;

        CatHouse catHouse = new CatHouse();

        catHouse.add(cat1);
        catHouse.add(cat2);
        catHouse.add(cat3);


        Cat actual = catHouse.getCatById(1);

        Assert.assertEquals(expected, actual);
        catHouse.clear();
    }
    @Test
    public void getNumberofCatsTest(){
        Cat cat1 = new Cat("Ducky", new Date(), 1);
        Cat cat2 = new Cat("Nacho", new Date(), 2);
        Cat cat3 = new Cat("Kimba", new Date(), 3);
        int expected = 3;

        CatHouse catHouse = new CatHouse();

        catHouse.add(cat1);
        catHouse.add(cat2);
        catHouse.add(cat3);

        int actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
        catHouse.clear();
    }


}
