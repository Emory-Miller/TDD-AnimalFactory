package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;
import rocks.zipcodewilmington.animals.Cat;
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

        CatHouse.add(cat);

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void removeByIDTest(){
        Cat cat1 = new Cat("Ducky", new Date(), 1);
        Cat cat2 = new Cat("Nacho", new Date(), 2);
        Cat cat3 = new Cat("Kimba", new Date(), 3);
        int expected = 2;

        CatHouse catHouse = new CatHouse();

        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);

        CatHouse.remove(3);

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void removeByNameTest(){
        Cat cat1 = new Cat("Ducky", new Date(), 1);
        Cat cat2 = new Cat("Nacho", new Date(), 2);
        Cat cat3 = new Cat("Kimba", new Date(), 3);
        int expected = 2;

        CatHouse catHouse = new CatHouse();

        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);

        CatHouse.remove(cat3);

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void getCatByIdTest(){
        Cat cat1 = new Cat("Ducky", new Date(), 1);
        Cat cat2 = new Cat("Nacho", new Date(), 2);
        Cat cat3 = new Cat("Kimba", new Date(), 3);

        CatHouse catHouse = new CatHouse();

        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);


        Cat actual = CatHouse.getCatById(1);

        Assert.assertEquals(cat1, actual);
        CatHouse.clear();
    }

    @Test
    public void getNumberofCatsTest(){
        Cat cat1 = new Cat("Ducky", new Date(), 1);
        Cat cat2 = new Cat("Nacho", new Date(), 2);
        Cat cat3 = new Cat("Kimba", new Date(), 3);
        int expected = 3;

        CatHouse catHouse = new CatHouse();

        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
}
