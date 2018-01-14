package design.pattern.structure.adapter;

public interface ScoreOperation {
    /**
     * 成绩排序
     *
     * @param array a
     * @return i
     */
    public int[] sort(int array[]);

    /**
     * 查找成绩
     * @param array a
     * @param key k
     * @return pos
     */
    public int search(int array[], int key);
}
