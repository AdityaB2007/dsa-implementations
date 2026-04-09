public class MaxHeapifyUp
{
    public static void heapifyUp(int[] heap, int index)
    {
        while (index > 0)
        {
            int parent = HeapUtil.parent(index);
            if (heap[index] > heap[parent])
            {
                HeapUtil.swap(heap, index, parent);
                index = parent;
            }
            else
            {
                break;
            }
        }
    }
}