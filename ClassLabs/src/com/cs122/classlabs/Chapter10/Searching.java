package com.cs122.classlabs.Chapter10;
//<<<<<<< HEAD
//=======
//
//>>>>>>> branch 'master' of https://github.com/elanfisher/cs122.git
//********************************************************************
//  Searching.java       Author: Lewis/Loftus
//
//  Demonstrates the linear search and binary search algorithms.
//********************************************************************

public class Searching<T>
{
    //-----------------------------------------------------------------
    //  Searches the specified array of objects for the target using
    //  a linear search. Returns a reference to the target object from
    //  the array if found, and null otherwise.
    //-----------------------------------------------------------------
    public T linearSearch(T[] list, T target)
    {
        int index = 0;
        boolean found = false;

        while (!found && index < list.length)
        {
            if (list[index].equals(target))
                found = true;
            else
                index++;
        }

        if (found)
            return list[index];
        else
            return null;
    }

    //-----------------------------------------------------------------
    //  Searches the specified array of objects for the target using
    //  a binary search. Assumes the array is already sorted in
    //  ascending order when it is passed in. Returns a reference to
    //  the target object from the array if found, and null otherwise.
    //-----------------------------------------------------------------
    public Comparable<T> binarySearch(Comparable<T>[] list,
            Comparable<T> target)
    {
        int min = 0, max = list.length - 1, mid = 0;
        boolean found = false;

        while (!found && min <= max)
        {
            mid = (min+max) / 2;
            if (list[mid].equals(target))
                found = true;
            else
                if (target.compareTo((T)list[mid]) < 0)
                {
                	System.out.println(target.compareTo((T)list[mid])+"max");
                    max = mid-1;
                }
                else
                	System.out.println(target.compareTo((T)list[mid])+"min");
                    min = mid+1;
        }

        if (found)
            return list[mid];
        else
            return null;
    }
}
