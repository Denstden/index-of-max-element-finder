package fm.ask;

import java.util.List;

public class IndexOfMaxElementFinder {
    public int getIndexOfMaxElement(List<Integer> elements) {
        if (elements.isEmpty()) {
            return -1;
        }
        return getIndexOfMaxElement(elements, 0, elements.size() - 1);
    }

    private int getIndexOfMaxElement(List<Integer> elements, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            throw new IllegalArgumentException();
        }

        if (startIndex == endIndex) {
            return startIndex;
        }

        if (endIndex - startIndex == 1) {
            return elements.get(startIndex) >= elements.get(endIndex)
                    ? startIndex
                    : endIndex;
        }

        int middleElementIndex = (startIndex + endIndex) / 2;
        Integer middleElement = elements.get(middleElementIndex);
        Integer nextElement = elements.get(middleElementIndex + 1);

        if (middleElement > nextElement) {
            return getIndexOfMaxElement(elements, startIndex, middleElementIndex);
        } else {
            return getIndexOfMaxElement(elements, middleElementIndex, endIndex);
        }
    }
}
