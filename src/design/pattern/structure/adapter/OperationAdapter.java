package design.pattern.structure.adapter;

public class OperationAdapter implements ScoreOperation {
  private QuickSort mQuickSort;
  private BinarySearch mBinarySearch;

  public OperationAdapter() {
    mQuickSort = new QuickSort();
    mBinarySearch = new BinarySearch();
  }

  @Override
  public int[] sort(int[] array) {
    return mQuickSort.quickSort(array);
  }

  @Override
  public int search(int[] array, int key) {
    return mBinarySearch.binarySearch(array, key);
  }
}
