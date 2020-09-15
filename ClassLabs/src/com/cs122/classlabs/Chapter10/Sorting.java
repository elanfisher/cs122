package com.cs122.classlabs.Chapter10;

//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

public class Sorting<T>
{
    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void selectionSort(Comparable<T>[] list)
    {
        int min;
        Comparable<T> temp;

        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo((T)list[min]) < 0)
                    min = scan;

            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the insertion
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void insertionSort (Comparable<T>[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable<T> key = list[index];
            int position = index;

            //  Shift larger values to the right
            while (position > 0 && key.compareTo((T)list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }
}
]
		
		
		
		
4,3,6,1,5,2

6,/3,4,1,5,2
6,5,/4,1,3,2
6,5,4,/1,3,2
6,5,4,3,/1,2
6,5,4,3,2,/1






1,3,6,4,5,2
1,2,6,4,5,3
1,2,3,4,5,6

