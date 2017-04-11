package trie;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        // Test 2 numbers keys
        {
            ItemSet firstItem = new ItemSet(0);
            ItemSet secondItem = new ItemSet(0);

            firstItem.addAll(new ArrayList<Integer> (Arrays.asList(1,2)));
            secondItem.addAll(new ArrayList<Integer> (Arrays.asList(2,3)));
            ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,2,3));


            Trie trie = new Trie(2);
            trie.add(firstItem);
            trie.add(secondItem);

            ArrayList<ItemSet> matchedItemSet = new ArrayList<>();
            trie.findItemSets(matchedItemSet, test);
            System.out.println(matchedItemSet);
        }

        // Test 3 numbers keys
        {
            ItemSet firstItem = new ItemSet(0);
            ItemSet secondItem = new ItemSet(0);

            firstItem.addAll(new ArrayList<Integer> (Arrays.asList(1,2,3)));
            secondItem.addAll(new ArrayList<Integer> (Arrays.asList(2,3,4)));
            ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,2,3,4));


            Trie trie = new Trie(3);
            trie.add(firstItem);
            trie.add(secondItem);

            ArrayList<ItemSet> matchedItemSet = new ArrayList<>();
            trie.findItemSets(matchedItemSet, test);
            System.out.println(matchedItemSet);
        }

        // Test 4 numbers keys
        {
            ItemSet firstItem = new ItemSet(0);
            ItemSet secondItem = new ItemSet(0);

            firstItem.addAll(new ArrayList<Integer> (Arrays.asList(1,2,3,4)));
            secondItem.addAll(new ArrayList<Integer> (Arrays.asList(2,3,4,5)));
            ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,2,3,4,5));


            Trie trie = new Trie(4);
            trie.add(firstItem);
            trie.add(secondItem);

            ArrayList<ItemSet> matchedItemSet = new ArrayList<>();
            trie.findItemSets(matchedItemSet, test);
            System.out.println(matchedItemSet);
        }
    }
}
