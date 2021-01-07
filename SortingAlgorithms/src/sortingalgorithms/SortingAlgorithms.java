/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;
import sortingalgorithms.models.RandomTshirt;
import sortingalgorithms.models.Tshirt;
import sortingalgorithms.sortingalgorithms.QuickSort;

/**
 *
 * @author konstantinos
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int numberOfRandomTshirt = 7;
        List<Tshirt> ListrandomTshirts = new ArrayList<>(numberOfRandomTshirt);
        
        for (int i = 0; i < numberOfRandomTshirt; i++) {
            ListrandomTshirts.add(new RandomTshirt());
            System.out.println(ListrandomTshirts.get(i));
        }
        
        System.out.println("\nQuick Sorted Array By Size Ascending");
        quickSort.quickSortTShirts(ListrandomTshirts, 0, numberOfRandomTshirt-1, 1, true);
        
        for (int i = 0; i < numberOfRandomTshirt; i++) {
            ListrandomTshirts.add(new RandomTshirt());
            System.out.println(ListrandomTshirts.get(i));
        }
    }
    
}
