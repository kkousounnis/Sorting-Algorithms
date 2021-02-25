package sortingalgorithms.sortingalgorithms;

import java.util.ArrayList;
import java.util.List;
import sortingalgorithms.models.Tshirt;

public class BucketSortImpl implements BucketSort {
    List<Tshirt>[] buckets;

    @Override
    public List<Tshirt> bucketSort(List<Tshirt> tshirts, int maxValue, int sortByProperty, boolean sortType) {
        List<Tshirt> sorted_tshirts = new ArrayList<>();
        
        //Here we have a build error we must some way add generic <Tshirt>
        List<Tshirt>[] buckets = new ArrayList[maxValue + 1];
        
        for (int i = 0; i <= maxValue; i++) {
            buckets[i] = new ArrayList<Tshirt>();
        }
        for (int i = 0; i <= maxValue; i++) {
            for (int j = 0; j < tshirts.size(); j++) {
                switch (sortByProperty) {
                    case 0: // SIZE
                        if (i == tshirts.get(j).getSize().ordinal()) {
                            buckets[i].add(tshirts.get(j));
                        }
                        break;
                    case 1: // COLOR
                        if (i == tshirts.get(j).getColor().ordinal()) {
                            buckets[i].add(tshirts.get(j));
                        }
                        break;
                    case 2: // FABRIC
                        if (i == tshirts.get(j).getFabric().ordinal()) {
                            buckets[i].add(tshirts.get(j));
                        }
                        break;
                }
            }
        }
        if (sortType == true) {
            for (int i = 0; i <= maxValue; i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    sorted_tshirts.add(buckets[i].get(j));
                }

            }
        } else {
            for (int i = maxValue; i >= 0; i--) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    sorted_tshirts.add(buckets[i].get(j));
                }

            }
        }

        return sorted_tshirts;
    }
}
