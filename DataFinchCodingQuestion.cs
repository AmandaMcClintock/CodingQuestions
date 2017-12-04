/*
Write a function called GetDuplicates to return all of the duplicate items in an array. Please use
C#. For example: Let a = {3,5,5,8,9,9,9} GetDuplicates(a) => {5,9}
*/
using System;
using System.Collections.Generic;
namespace Hello
{
    class Program
    {
        //TODO: Return array of duplicates
        static void GetDuplicates(int[] a)
        {
            Dictionary<int, int> DuplicateKeeper = new Dictionary<int, int>();
            int ArrayLen = a.Length;
            for(int loop = 0; loop < ArrayLen; loop++){
                //Console.WriteLine(a[loop]);
                if (!DuplicateKeeper.ContainsKey(a[loop]))
                {
                    DuplicateKeeper.Add(a[loop], 1);
                }
                else
                {
                    DuplicateKeeper[a[loop]]++;
                }
            }
            //TODO: Every number in the array is added to the Dictionary. Fix it.
            for(int l = 0; l < ArrayLen; l++)
            {
                // if(DuplicateKeeper[a[l]] < 0)
                // {
                //     Console.WriteLine(a[l]);
                // }
                Console.WriteLine(DuplicateKeeper[a[l]]);
            }
        }
        static void Main(string[] args)
        {
            //Console.WriteLine("Hello World!");
            int[] a = {3,5,5,8,9,9,9};
            GetDuplicates(a);
            
        }

        
    }
}
