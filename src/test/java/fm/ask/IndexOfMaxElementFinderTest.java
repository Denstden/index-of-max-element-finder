package fm.ask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IndexOfMaxElementFinderTest {

    private final IndexOfMaxElementFinder finder = new IndexOfMaxElementFinder();

    @Parameters
    public static Collection<Object[]> data() {
        return asList(new Object[][] {
                { emptyList(), -1 },
                { singletonList(1), 0 },
                { asList(2, 1), 0 },
                { asList(1, 2), 1 },
                { asList(1, 2, 3), 2 },
                { asList(3, 2, 1), 0 },
                { asList(1, 2, 3, 4, 5, 1), 4 },
                { asList(1, 5, 3, 2, 1, 0), 1 },
                { asList(5, 4, 3, 2, 1, 0), 0 },
                { asList(1, 2, 3, 0), 2 },
                { asList(1, 2, 3, 4), 3}
        });
    }

    private final List<Integer> input;
    private final int expected;

    public IndexOfMaxElementFinderTest(List<Integer> input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void shouldReturnIndexOfMaxElement() {
        assertEquals(expected, finder.getIndexOfMaxElement(input));
    }
}