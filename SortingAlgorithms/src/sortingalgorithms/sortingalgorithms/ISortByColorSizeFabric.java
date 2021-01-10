package sortingalgorithms.sortingalgorithms;

import java.util.List;
import sortingalgorithms.models.Tshirt;

public interface ISortByColorSizeFabric {

    public void bucketSortTShirtsBySizeThenColorThenFabric(List<Tshirt> ranTShirts, int sortingType);

}
