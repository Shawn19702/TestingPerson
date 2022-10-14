import org.testng.Assert;

import org.junit.jupiter.api.Test;

public class TestPerson {

    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person();
        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);
        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);


        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();


        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        Person person = new Person();
        Integer expected = 200;

        person.setWeight(expected);

        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetSkinColor() {
        Person person = new Person();
        String expected = "brown";

        person.setSkincolor(expected);

        String actual = person.getSkincolor();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void TestSetTatoos(){
        Person person = new Person();
        boolean expected = true;

        person.setTatoos(expected);

        boolean actual = person.getTatoos();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestSetHairColor(){
        Person person = new Person();
        String expected = "black";

        person.setHairColor(expected);

        String actual = person.getHairColor();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestEyeColor(){
        Person person = new Person();
        String expected = "blue";

        person.setEyeColor(expected);

        String actual = person.getEyeColor();

        Assert.assertEquals(expected, actual);
    }

}


