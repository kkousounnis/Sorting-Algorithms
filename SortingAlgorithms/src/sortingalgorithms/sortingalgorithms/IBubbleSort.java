package sortingalgorithms.sortingalgorithms;

import java.util.List;
import sortingalgorithms.models.Tshirt;

public interface IBubbleSort {

    public List<Tshirt> bubbleSortTShirts(List<Tshirt> arr, int sortByAttribute, boolean isAsc);

}
