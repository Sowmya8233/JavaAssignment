package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
class MinMax {

	@Test
	void test() {
		fail("Not yet implemented");
	}

} */



class MinMaxTest {

    public static int getMaxValue(int[] array) {
        int value = Integer.MIN_VALUE;

        if (array.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                value = array[i];
            }
        }
        return value;
    }

    public static int getMinValue(int[] array) {
        int value = Integer.MAX_VALUE;

        if (array.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        for (int i=0; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
            }
        }
        return value;
    }   
}


public class MinMax {

	int[] array = new int[] {56, 34, 7,3, 54, 3, 34, 34, 53};
	
    @Test
    public void shouldBeMaxValue() {
        int maxValue = MinMaxTest.getMaxValue(array);
        assert(maxValue == 229);
    }

    @Test
    public void shouldBeMinValue() {
        int minValue = MinMaxTest.getMinValue(array);
        assert(minValue == 1);
    }

    //@Test(expected = IllegalArgumentException.class)
    public void shouldBeIllegalArgumentException() {
        int[] emptyArray = new int[] {};
        int maxValue = MinMaxTest.getMaxValue(emptyArray);
        int minValue = MinMaxTest.getMinValue(emptyArray);
    }

	
		

	}
    
