package trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Exception;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) throws Exception {
        for (int i = 2; i < 5; i++) {
           TestFixture test = new TestFixture(i);
           test.add();
        }

        for (int i = 2; i < 5; i++) {
           TestFixture test = new TestFixture(i);
           test.contains();
        }

        for (int i = 2; i < 5; i++) {
           TestFixture test = new TestFixture(i);
           test.findItemSets();
        }

        System.out.println("All tests passed");
    }
}

class TestFixture extends Trie {
    private int length;
    public TestFixture(int length) {
        super(length);
        this.length = length;
    }

    public void add() throws Exception {
        ItemSet firstItem = new ItemSet(0);
        ItemSet secondItem = new ItemSet(0);

        firstItem.addAll(IntStream.range(1, length+1).boxed().collect(Collectors.toList()));
        secondItem.addAll(IntStream.range(2, length+2).boxed().collect(Collectors.toList()));

        if (add(firstItem) == false) {
            throw new Exception("Add test");
        }

        if (add(firstItem) == true)
            throw new Exception("add test");

        if (add(secondItem) == false) {
            throw new Exception("Add test");
        }
    }

    public void contains() throws Exception {
        add();
        ItemSet firstItem = new ItemSet(0);
        ItemSet secondItem = new ItemSet(0);
        ItemSet thirdItem = new ItemSet(0);

        firstItem.addAll(IntStream.range(1, length+1).boxed().collect(Collectors.toList()));
        secondItem.addAll(IntStream.range(2, length+2).boxed().collect(Collectors.toList()));
        thirdItem.addAll(IntStream.range(9, 9+length+1).boxed().collect(Collectors.toList()));

        if (contains(firstItem) == false)
            throw new Exception("Contains test");

        if (contains(secondItem) == false)
            throw new Exception("Contains test");

        if (contains(thirdItem) == true)
            throw new Exception("Contains test");

    }
    public void findItemSets() throws Exception {
        add();

        ArrayList<Integer> test = new ArrayList<>(IntStream.range(1, length+2).boxed().collect(Collectors.toList()));
        ArrayList<ItemSet> matchedItemSet = new ArrayList<>();
        findItemSets(matchedItemSet, test);
        System.out.println(matchedItemSet);

        if (matchedItemSet.size() != 2)
            throw new Exception("findItemSets test");
    }
}
