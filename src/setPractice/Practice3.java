package setPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice3 {
    public static void main(String[] args) {


        HashSet<String> hash = new HashSet();
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        TreeSet<String> tree = new TreeSet<>();

        hash.add("orange");                linked.add("orange");                tree.add("orange");
        hash.add("apple");                 linked.add("apple");                 tree.add("apple");
        hash.add("kiwi");                  linked.add("kiwi");                  tree.add("kiwi");
        hash.add("lemon");                 linked.add("lemon");                 tree.add("lemon");

        System.out.println(hash);       System.out.println(linked);             System.out.println(tree);
        System.out.println("================");
        hash.add("apple");                 linked.add("apple");                 tree.add("apple");

        System.out.println(hash);       System.out.println(linked);             System.out.println(tree);

        hash.add(null);                 linked.add(null);              //   tree.add(null);
        System.out.println("================");
        System.out.println(hash);       System.out.println(linked);             System.out.println(tree);

       String str1 =  tree.first();
        System.out.println( str1);

        String str2 = tree.last();
        System.out.println( str2);

        tree.remove("lemon");
        System.out.println(tree);

        tree.pollFirst();
        System.out.println(tree);
        System.out.println(  tree.pollLast()  );
        System.out.println(tree);

    }
}
