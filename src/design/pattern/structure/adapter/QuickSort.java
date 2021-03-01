package design.pattern.structure.adapter;

public class QuickSort {
  public int[] quickSort(int[] array) {
    sort(array, 0, array.length - 1);
    return array;
  }

  public void sort(int[] array, int p, int r) {
    if (p < r) {
      int q = partition(array, p, r);
      sort(array, p, q - 1);
      sort(array, q + 1, r);
    }
  }

  public int partition(int[] a, int p, int r) {
    int x = a[r];
    int y = p - 1;
    for (int i = p; i <= r - 1; i++) {
      if (a[i] < x) {
        y++;
        swap(a, y, i);
      }
    }

    swap(a, y + 1, r);
    return y + 1;
  }

  public void swap(int[] a, int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
  }
}
