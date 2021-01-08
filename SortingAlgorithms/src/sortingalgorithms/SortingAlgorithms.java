package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;
import sortingalgorithms.models.RandomTshirt;
import sortingalgorithms.models.Tshirt;
import sortingalgorithms.sortingalgorithms.BubleSort;
import sortingalgorithms.sortingalgorithms.QuickSort;

public class SortingAlgorithms {

    public static void main(String[] args) {

        //------------------------------Quick Sort--------------------------//
        System.out.println("/----------Quick Sort-------------------------/");
        QuickSort quickSort = new QuickSort();
        int numberOfRandomTshirt = 7;
        
        List<Tshirt> ListrandomTshirtsAS = new ArrayList<>(numberOfRandomTshirt);

        //Random tshirt list Ascending by size
        ListrandomTshirtsAS = createRandomList(ListrandomTshirtsAS, numberOfRandomTshirt);
        System.out.println("\nQuick Sorted list By Size Ascending");
        quickSort.quickSortTShirts(ListrandomTshirtsAS, 0, numberOfRandomTshirt - 1, 0, true);
        printSortedList(ListrandomTshirtsAS, numberOfRandomTshirt);
        
        List<Tshirt> ListrandomTshirtsDS = new ArrayList<>(numberOfRandomTshirt);

        //Random tshirt list Descending by size
        ListrandomTshirtsDS = createRandomList(ListrandomTshirtsDS, numberOfRandomTshirt);
        System.out.println("\nQuick Sorted list By Size Descending");
        quickSort.quickSortTShirts(ListrandomTshirtsDS, 0, numberOfRandomTshirt - 1, 0, false);
        printSortedList(ListrandomTshirtsDS, numberOfRandomTshirt);
        
        List<Tshirt> ListrandomTshirtsAC = new ArrayList<>(numberOfRandomTshirt);

        //Random tshirt list Ascending by color
        ListrandomTshirtsAC = createRandomList(ListrandomTshirtsAC, numberOfRandomTshirt);
        System.out.println("\nQuick Sorted list By Color Ascending");
        quickSort.quickSortTShirts(ListrandomTshirtsAC, 0, numberOfRandomTshirt - 1, 1, true);
        printSortedList(ListrandomTshirtsAC, numberOfRandomTshirt);
        
        List<Tshirt> ListrandomTshirtsDC = new ArrayList<>(numberOfRandomTshirt);

        //Random tshirt list Descending by color
        ListrandomTshirtsDC = createRandomList(ListrandomTshirtsDC, numberOfRandomTshirt);
        System.out.println("\nQuick Sorted list By Color Descending");
        quickSort.quickSortTShirts(ListrandomTshirtsDC, 0, numberOfRandomTshirt - 1, 1, false);
        printSortedList(ListrandomTshirtsDC, numberOfRandomTshirt);

        List<Tshirt> ListrandomTshirtsAF = new ArrayList<>(numberOfRandomTshirt);
        //Random tshirt list Ascending by fabric
        ListrandomTshirtsAF = createRandomList(ListrandomTshirtsAF, numberOfRandomTshirt);
        System.out.println("\nQuick Sorted list By Fabric Ascending");
        quickSort.quickSortTShirts(ListrandomTshirtsAF, 0, numberOfRandomTshirt - 1, 2, true);
        printSortedList(ListrandomTshirtsAF, numberOfRandomTshirt);
        
        List<Tshirt> ListrandomTshirtsDF = new ArrayList<>(numberOfRandomTshirt);
        //Random tshirt list Descending by fabric
        ListrandomTshirtsDF = createRandomList(ListrandomTshirtsDF, numberOfRandomTshirt);
        System.out.println("\nQuick Sorted list By Fabric Descending");
        quickSort.quickSortTShirts(ListrandomTshirtsDF, 0, numberOfRandomTshirt - 1, 2, false);
        printSortedList(ListrandomTshirtsDF, numberOfRandomTshirt);

        //-----------------------Buble Sort-----------------------------------//
        System.out.println("/-------------------Bubble Sort-----------------/");

        int numberOfRandomTshirt1 = 7;
        
        BubleSort bubblesort = new BubleSort();
        List<Tshirt> ListrandomTshirtsASBubl = new ArrayList<>(numberOfRandomTshirt1);
        //Random tshirt list Ascending by size
        ListrandomTshirtsASBubl = createRandomList(ListrandomTshirtsASBubl, numberOfRandomTshirt1);
        System.out.println("Buble Sort list By Size Ascending");
        bubblesort.bubbleSortTShirts(ListrandomTshirtsASBubl, 0, true);
        printSortedList(ListrandomTshirtsASBubl, numberOfRandomTshirt1);       
        
        List<Tshirt> ListrandomTshirtsDSBubl = new ArrayList<>(numberOfRandomTshirt1);
        //Random tshirt list Descending by size
        ListrandomTshirtsDSBubl = createRandomList(ListrandomTshirtsDSBubl, numberOfRandomTshirt1);
        System.out.println("Buble Sort list By Size Descending");
        bubblesort.bubbleSortTShirts(ListrandomTshirtsDSBubl, 0, false);
        printSortedList(ListrandomTshirtsDSBubl, numberOfRandomTshirt1);
        
        List<Tshirt> ListrandomTshirtsACBubl = new ArrayList<>(numberOfRandomTshirt1);
        //Random tshirt list Ascending by color
        ListrandomTshirtsACBubl = createRandomList(ListrandomTshirtsACBubl, numberOfRandomTshirt1);
        System.out.println("Buble Sort list By Color Ascending");
        bubblesort.bubbleSortTShirts(ListrandomTshirtsACBubl, 1, true);
        printSortedList(ListrandomTshirtsACBubl, numberOfRandomTshirt1);
        
        List<Tshirt> ListrandomTshirtsDCBubl = new ArrayList<>(numberOfRandomTshirt1);
        //Random tshirt list Descending by color
        ListrandomTshirtsACBubl = createRandomList(ListrandomTshirtsACBubl, numberOfRandomTshirt1);
        System.out.println("Buble Sort list By Color Descending");
        bubblesort.bubbleSortTShirts(ListrandomTshirtsACBubl, 1, false);
        printSortedList(ListrandomTshirtsACBubl, numberOfRandomTshirt1);
        
        List<Tshirt> ListrandomTshirtsAFBubl = new ArrayList<>(numberOfRandomTshirt1);
        //Random tshirt list Ascending by fabric
        ListrandomTshirtsAFBubl = createRandomList(ListrandomTshirtsAFBubl, numberOfRandomTshirt1);
        System.out.println("Buble Sort list By Fabric Ascending");
        bubblesort.bubbleSortTShirts(ListrandomTshirtsAFBubl, 2, true);
        printSortedList(ListrandomTshirtsAFBubl, numberOfRandomTshirt1);
        
        List<Tshirt> ListrandomTshirtsDFBubl = new ArrayList<>(numberOfRandomTshirt1);
        //Random tshirt list Ascending by fabric
        ListrandomTshirtsDFBubl = createRandomList(ListrandomTshirtsDFBubl, numberOfRandomTshirt1);
        System.out.println("Buble Sort list By Fabric Ascending");
        bubblesort.bubbleSortTShirts(ListrandomTshirtsDFBubl, 2, false);
        printSortedList(ListrandomTshirtsDFBubl, numberOfRandomTshirt1);
        
        

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
