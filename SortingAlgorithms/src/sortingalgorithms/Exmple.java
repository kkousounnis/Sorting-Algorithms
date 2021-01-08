package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;
import static sortingalgorithms.SortingAlgorithms.createRandomList;
import static sortingalgorithms.SortingAlgorithms.printSortedList;
import sortingalgorithms.models.RandomTshirt;
import sortingalgorithms.models.Tshirt;

public class Exmple {

    public static void bubbleSort(Tshirt arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getSize().ordinal() > arr[j + 1].getSize().ordinal()) {
                    // swap arr[j+1] and arr[j] 
                    Tshirt temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    
    public static void ExampleB(List<Tshirt> arr2){
        int n = arr2.size();
        for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getSize().ordinal() > arr2.get(j + 1).getSize().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                Tshirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
    }

    public static void main(String[] args) {
        int numberOfRandomTshirt = 7;
        List<Tshirt> ListrandomTshirts = new ArrayList<>(numberOfRandomTshirt);
        ListrandomTshirts = createRandomList(ListrandomTshirts, numberOfRandomTshirt);
        System.out.println("Buble Sort list By Size Ascending");
        ExampleB(ListrandomTshirts);
        printSortedList(ListrandomTshirts, numberOfRandomTshirt);
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int[] arr = {1, 5, 6, 7, 8, 2, 2};
//        for (int a : arr) {
//            System.out.print(a);
//
//        }
//        System.out.println("");
//        bubbleSort(arr);
//        for (int a : arr) {
//            System.out.print(a);
//
//        }
        
        
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
