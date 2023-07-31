package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.z
        for(int i = list.size()-1; i >= 0; i--){
            if (list.get(i)< minValue){
                list.remove(list.get(i));
            }
             
        }
    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {

        // Your solution must not use any loops.

        ArrayList<Integer> originalList = new ArrayList<Integer>();
        originalList.addAll(integers);

        HashSet<Integer>dupesRemoved = new HashSet<Integer>();
        dupesRemoved.addAll(originalList);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.addAll(dupesRemoved);

       if(originalList.size() > dupesRemoved.size()){
            return true;
        }else{
            return false;
        }
           
        // result is either false or out of bounds. this way is not working

    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.

        HashSet<Integer>combinedList = new HashSet<Integer>();

        combinedList.addAll(ints1);
        combinedList.addAll(ints2);

        ArrayList<Integer>completeList = new ArrayList<Integer>();
        completeList.addAll(combinedList);

        Collections.sort(completeList);
        // return new ArrayList<Integer>();

        return completeList;
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        ArrayList<Integer> elInBoth = new ArrayList<Integer>();

                ArrayList<Integer> collectionOne = new ArrayList<Integer>();
                ArrayList<Integer> collectionTwo = new ArrayList<Integer>();

                collectionOne.addAll(ints1);
                collectionTwo.addAll(ints2);

                collectionOne.retainAll(collectionTwo);

                Collections.sort(collectionOne);

        return collectionOne;
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
        // ArrayList<String> listOfWords = new ArrayList<String>();
        // String wordsCollection = Arrays.asList(list);

    //    2. push the results of the frequency array into wordOccurenceCount hashmap of key value pairs.
    // move this above for scoping
        HashMap<String, Integer> wordOccurenceCount = new HashMap<String, Integer>();

    // 1. create an array and add list to it.
        // iterate through the eachUniqueWord array locating all unique words and returning the frequency in which they occured
        Set<String> eachUniqueWord = new HashSet<>(list);
        for(String word: eachUniqueWord){
          
            wordOccurenceCount.put(word, Collections.frequency(list, word));
        }

        // 3.iterate through wordOccurenceCount array to find the wordOccurenceCount value that appeared most frequently, return the key
            int mostUsedWord = (Collections.max(wordOccurenceCount.values()));
        for(Entry<String, Integer> entry : wordOccurenceCount.entrySet()){
            if(entry.getValue() == mostUsedWord){
                return entry.getKey();
            }
        }
        String a = "hello";
        return a;
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
