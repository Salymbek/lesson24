import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer>set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);




        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);


        System.out.println(symmetricDifference(set1,set2));

    }



    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){

        Set<Integer>symmetry = new HashSet<>();

        Set<Integer>delete = new HashSet<>();

        for (Integer a : set1) {
            for (Integer b : set2) {
                if (Objects.equals(a,b)){
                    delete.add(a);


                }



            }
        }
        symmetry.addAll(set1);
        symmetry.addAll(set2);
        symmetry.removeAll(delete);



        return symmetry;

    }

}