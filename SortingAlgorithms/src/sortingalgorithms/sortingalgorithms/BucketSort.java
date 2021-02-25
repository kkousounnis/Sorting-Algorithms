package sortingalgorithms.sortingalgorithms;

import java.util.List;
import sortingalgorithms.models.Tshirt;

public interface BucketSort {

    public List<Tshirt> bucketSort(List<Tshirt> tshirts, int maxValue, int sortByProperty, boolean sortType);
}
