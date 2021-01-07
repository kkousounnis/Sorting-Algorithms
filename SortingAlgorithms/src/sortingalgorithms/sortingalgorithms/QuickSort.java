package sortingalgorithms.sortingalgorithms;

import java.util.List;
import sortingalgorithms.models.Tshirt;

public class QuickSort implements IQuickSort {

    @Override
    public void quickSortTShirts(List<Tshirt> arr, int low, int high, int sortByAttribute, boolean isASC) {
        if (low < high) {

            int pi = 0;

            pi = partition(arr, low, high, sortByAttribute, isASC); 

            quickSortTShirts(arr, low, pi - 1, sortByAttribute, isASC);
            quickSortTShirts(arr, pi + 1, high, sortByAttribute, isASC);

        }
    }

    @Override
    public int partition(List<Tshirt> arr, int low, int high, int sortByAttribute, boolean isASC) {
        Tshirt pivot = arr.get(high);
        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            if (isASC) { // ASC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is smaller than the pivot 
                        if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            } else { // DESC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is bigger than the pivot 
                        if (arr.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            }

        }

        // swap arr[i+1] and arr[high] (or pivot) 
        Tshirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

}
