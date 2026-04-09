public class HeapUtil {
    public static int parent(int i)
    {
        return (i - 1) / 2;
    }
    public static int left(int i)
    {
        return 2 * i + 1;
    }
    public static int right(int i)
    {
        return 2 * i + 2;
    }
    public static void swap(int[] heap, int i, int j)
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public static void printHeap(int[] heap, int size)
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}