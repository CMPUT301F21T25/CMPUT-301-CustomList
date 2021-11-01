import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestListCity {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    /**
     * this function is sued to test add
     */
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(),listSize+1);

    }
    @Test
    public void testHasCity(){

        City city = new City("Regina","Saskatchewan");
        list.hasCity(city);
        list.addCity(city);
        assertTrue(list.hasCity(city));

    }

    @Test
    public void testDelete(){
        City city = new City("Yellowknife", "Northwest Territories");

        list.delete(city);

        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));

    }

    @Test
    public void testCountCities() {

        City city = new City("Charlottetown", "Prince Edward Island");

        list.addCity(city);
        list.countCity();

        assertFalse(list.countCity());


    }

}
