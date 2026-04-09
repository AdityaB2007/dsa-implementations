public class MaxHeapifyDown
{
    public static void heapifyDown(int[] heap, int size, int index)
    {
        while (true)
        {
            int left = HeapUtil.left(index);
            int right = HeapUtil.right(index);
            int largest = index;
            
            if (left < size && heap[left] > heap[largest])
            {
                largest = left;
            }
            if (right < size && heap[right] > heap[largest])
            {
                largest = right;
            }
            if (largest != index)
            {
                HeapUtil.swap(heap, index, largest);
                index = largest;
            }
            else
            {
                break;
            }
        }
    }
}