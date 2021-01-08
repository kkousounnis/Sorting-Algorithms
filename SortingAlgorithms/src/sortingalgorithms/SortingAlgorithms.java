package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;
import sortingalgorithms.models.RandomTshirt;
import sortingalgorithms.models.Tshirt;
import sortingalgorithms.sortingalgorithms.QuickSort;

public class SortingAlgorithms {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int numberOfRandomTshirt = 7;
        List<Tshirt> ListrandomTshirts = new ArrayList<>(numberOfRandomTshirt);

        //Random tshirt list Ascending by size
        ListrandomTshirts = createRandomList(ListrandomTshirts, numberOfRandomTshirt);
        System.out.println("\nQuick Sorted Array By Size Ascending");
        quickSort.quickSortTShirts(ListrandomTshirts, 0, numberOfRandomTshirt - 1, 0, true);
        printSortedList(ListrandomTshirts, numberOfRandomTshirt);

        //Random tshirt list Descending by size
        ListrandomTshirts = createRandomList(ListrandomTshirts, numberOfRandomTshirt);
        System.out.println("\nQuick Sorted Array By Size Descending");
        quickSort.quickSortTShirts(ListrandomTshirts, 0, numberOfRandomTshirt - 1, 0, false);
        printSortedList(ListrandomTshirts, numberOfRandomTshirt);

        //Random tshirt list Ascending by color
        ListrandomTshirts = createRandomList(ListrandomTshirts, numberOfRandomTshirt);
        System.out.println("\nQuick Sorted Array By Size Ascending");
        quickSort.quickSortTShirts(ListrandomTshirts, 0, numberOfRandomTshirt - 1, 1, true);
        printSortedList(ListrandomTshirts, numberOfRandomTshirt);
    }

    public static List<Tshirt> createRandomList(List<Tshirt> ListrandomTshirts,
            int numberOfRandomTshirt) {
        System.out.println("\nRandom Tshirt List.");
        for (int i = 0; i < numberOfRandomTshirt; i++) {
            ListrandomTshirts.add(new RandomTshirt());

            System.out.println(ListrandomTshirts.get(i));
        }
        return (ListrandomTshirts);
    }

    public static void printSortedList(List<Tshirt> ListrandomTshirts,
            int numberOfRandomTshirt) {
        for (int i = 0; i < numberOfRandomTshirt; i++) {

            System.out.println(ListrandomTshirts.get(i));
        }

    }
}
