package sortingalgorithms.sortingalgorithms;

import java.util.List;
import sortingalgorithms.models.Tshirt;

public interface IQuickSort {

    public void quickSortTShirts(List<Tshirt> arr, int low, int high, int sortByAttribute, boolean isASC);

    public int partition(List<Tshirt> arr, int low, int high, int sortByAttribute, boolean isASC);

}
