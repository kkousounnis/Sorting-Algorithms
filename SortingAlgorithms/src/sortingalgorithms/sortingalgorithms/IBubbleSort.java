/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.sortingalgorithms;

import java.util.List;
import sortingalgorithms.models.Tshirt;

/**
 *
 * @author konstantinos
 */
public interface IBubbleSort {
    public List<Tshirt> bubbleSortTShirts(List<Tshirt> arr, int sortByAttribute, boolean isAsc);
    
}
