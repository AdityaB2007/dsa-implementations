/*
author: Aditya Baisakh
algorithm: Sequential/Linear Search
parameters:
    int[] arr : an array of integers
    int target : an integer value that may or may not exist within arr
objective: return the first index where target exists in arr, else, return -1
worst-case time complexity: O(n)
*/
int linearSearch(int[] arr, int target)
{
    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] == target)
        {
            return i;
        }
    }
    return -1;
}