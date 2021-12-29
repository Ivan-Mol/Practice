package lesson4.classes;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for {@link Box}
 */
public class BoxTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testEmptyBox_weightIsCorrect() {
        Box<Apple> appleBox = new Box<>();
        assertEquals("Weight of an empty box should be equal to 0", 0d, appleBox.getWeight(), 0.001d);
    }

    @Test
    public void testBoxWith1Apple_weightIsCorrect() {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        assertEquals("Weight of a box containing 1 apple should be equal to 1", 1d, appleBox.getWeight(), 0.001d);
    }

    @Test
    public void test2EmptyBoxes_weightsAreTheSame() {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> anotherAppleBox = new Box<>();
        assertTrue("Weights of 2 empty boxes should be the same", appleBox.compare(anotherAppleBox));
    }

    @Test
    public void test2BoxesWith1AppleRespectively_weightsAreTheSame() {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.addFruit(new Apple());
        anotherAppleBox.addFruit(new Apple());
        assertTrue("Weights of 2 boxes containing 1 apple respectively should be the same", appleBox.compare(anotherAppleBox));
    }

    @Test
    public void testAddIncompatibleFruitToEmptyBox_expectingError() {
        thrown.expect(IllegalArgumentException.class);
        thrown.reportMissingExceptionWithMessage("Adding orange to an empty apple box should lead to exception");
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Orange());
    }

    @Test
    public void testAddIncompatibleFruitToNonEmptyBox_expectingError() {
        thrown.expect(IllegalArgumentException.class);
        thrown.reportMissingExceptionWithMessage("Adding apple to a non-empty orange box should lead to exception");
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Apple());
    }

    @Test
    public void test2DifferentEmptyBoxes_weightsAreTheSame() {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        assertTrue("Weights of 2 empty boxes of different fruits should be the same", appleBox.compare(orangeBox));
    }

    @Test
    public void test2DifferentNonEmptyBoxes_weightsAreTheSame() {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        assertTrue("Weights of a box containing 3 apples and a box containing 2 oranges should be the same", appleBox.compare(orangeBox));
    }

    @Test
    public void testPutFromEmptyBoxToAnotherEmptyBox_weightsAreCorrect() {
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box<>();
        orangeBox.putToAnotherBox(anotherOrangeBox);
        assertTrue("Weights of 2 empty boxes after put should remain the same", orangeBox.compare(anotherOrangeBox));
        assertEquals("Weight of an empty box after picking fruits should remain the same", 0d, orangeBox.getWeight(), 0.001d);
        assertEquals("Weight of an empty box after putting 0 fruits should remain the same", 0d, anotherOrangeBox.getWeight(), 0.001d);
    }

    @Test
    public void testPutFromEmptyBoxToNonEmptyBox_weightsAreCorrect() {
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box<>();
        anotherOrangeBox.addFruit(new Orange());
        orangeBox.putToAnotherBox(anotherOrangeBox);
        assertEquals("Weight of an empty box after picking fruits should remain the same", 0d, orangeBox.getWeight(), 0.001d);
        assertEquals("Weight of a non-empty box after putting 0 fruits should remain the same", 1.5d, anotherOrangeBox.getWeight(), 0.001d);
    }

    @Test
    public void testPutFromNonEmptyBoxToEmptyBox_weightsAreCorrect() {
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.putToAnotherBox(anotherOrangeBox);
        assertEquals("Weight of a non-empty box after picking fruits should be equal to 0", 0d, orangeBox.getWeight(), 0.001d);
        assertEquals("Weight of an empty box after putting 1 orange should be equal to 1.5", 1.5d, anotherOrangeBox.getWeight(), 0.001d);
    }

    @Test
    public void testPutFromNonEmptyBoxToAnotherNonEmptyBox_weightsAreCorrect() {
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        anotherOrangeBox.addFruit(new Orange());
        orangeBox.putToAnotherBox(anotherOrangeBox);
        assertEquals("Weight of a non-empty box after picking fruits should be equal to 0", 0d, orangeBox.getWeight(), 0.001d);
        assertEquals("Weight of a box containing 1 orange after putting 1 orange should be equal to 3", 3d, anotherOrangeBox.getWeight(), 0.001d);
    }

    @Test
    public void testPutToNullBox_expectingError() {
        thrown.expect(IllegalArgumentException.class);
        thrown.reportMissingExceptionWithMessage("Putting fruits to a null box should lead to exception");
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.putToAnotherBox(null);
    }

    @Test
    public void testPutToTheSameBox_weightIsCorrect() {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.putToAnotherBox(orangeBox);
        assertEquals("Weight of a non-empty box after putting fruits to the same box should remain the same", 1.5d, orangeBox.getWeight(), 0.001d);
    }
}
