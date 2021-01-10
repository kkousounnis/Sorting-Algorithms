package sortingalgorithms.sortingalgorithms;

import java.util.ArrayList;
import java.util.List;
import sortingalgorithms.models.Tshirt;

public class BubleSort implements IBubbleSort {

    @Override
    public List<Tshirt> bubbleSortTShirts(List<Tshirt> arr2, int sortByAttribute, boolean isAsc) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        int n = arr2.size();
        if (isAsc) {//Ascending
            switch (sortByAttribute) {
                // Size
                case 0:
                    System.out.println("ascending by size");
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

                    break;
                //color
                case 1:
                    System.out.println("ascending by color");
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getColor().ordinal() > arr2.get(j + 1).getColor().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                Tshirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
                //fabric
                case 2:
                    System.out.println("ascending by fabric");
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getFabric().ordinal() > arr2.get(j + 1).getFabric().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                Tshirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;

            }
        } else {//Descending
            switch (sortByAttribute) {
                // Size
                case 0:
                    System.out.println("descending by size");
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getSize().ordinal() < arr2.get(j + 1).getSize().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                Tshirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
                //color
                case 1:
                    System.out.println("descending by color");
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getColor().ordinal() < arr2.get(j + 1).getColor().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                Tshirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("descending by fabric");
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getFabric().ordinal() < arr2.get(j + 1).getFabric().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                Tshirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
            }
        }

        return (arr2);
    }

}
