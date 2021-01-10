package sortingalgorithms.sortingalgorithms;

import java.util.ArrayList;
import java.util.List;
import sortingalgorithms.models.Tshirt;
import sortingalgorithms.models.enums.Size;

public class SortByColorSizeFabric implements ISortByColorSizeFabric {

    @Override
    public void bucketSortTShirtsBySizeThenColorThenFabric(List<Tshirt> ranTShirts, int sortingType) {
        List<Tshirt> tShirts = new ArrayList<>();
        QuickSort quicksort = new QuickSort();
        BucketSort bucketsort = new BucketSort();
        // Step 1 - Create noOfBuckets buckets, Size.length
        int noOfBuckets = Size.values().length;

        List<Tshirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<Tshirt>(); // initialize the buckets
        }

        // Step 2, divide into buckets, Sort By Size
        for (Tshirt tShirt : ranTShirts) {
            buckets[tShirt.getSize().ordinal()].add(tShirt);
        }

        // Step 3, Sort By Color
        for (List<Tshirt> bucket : buckets) {
            quicksort.quickSortTShirts(bucket, 0, bucket.size() - 1, 1, true);
        }

        // Step 4, Sort By Fabric
        for (List<Tshirt> bucket : buckets) {
            List<Tshirt> bucketByFabric = new ArrayList<>(bucket);
            bucketsort.bucketSort(bucketByFabric, 2, 0, true);
            quicksort.quickSortTShirts(bucketByFabric, 0, bucketByFabric.size() - 1, 2, true);
            bucket = bucketByFabric;
        }

        // combine all the buckets to 1 List
        for (List<Tshirt> bucket : buckets) {
            for (Tshirt tShirt : bucket) {
                tShirts.add(tShirt);
            }
        }

        System.out.println("\nBucket Sorted Array By Size Ascending, By Color Ascending And By Fabric Ascending");
        for (Tshirt tShirt : tShirts) {
            System.out.println(tShirt);
        }
    }

}
