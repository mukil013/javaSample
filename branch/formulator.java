package branch;

import java.util.*;

public class formulator{

    public static void main(String[] args){
        aSqminusbSq one = new aSqminusbSq();
        a_Plus_b_WholeSq two = new a_Plus_b_WholeSq();
        aCubePlusbCube three = new aCubePlusbCube();
        List <Integer> a = new ArrayList <>();
        double ans;
        Scanner in = new Scanner(System.in);
        System.out.println("\nformulator : \n");
        System.out.println("what formula you want :");
        System.out.println("Options \n1, a^2 - b^2\t\t2, (a+b)^2\t\t3, (a+b)^3");
        int opt = in.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("value of a :");
                    a.add(in.nextInt());
                    System.out.println("value of b :");
                    a.add(in.nextInt());
                    ans = one.answer(a.get(0), a.get(1));
                    System.out.println("\n" + ans);
                }
                case 2 -> {
                    System.out.println("value of a :");
                    a.add(in.nextInt());
                    System.out.println("value of b :");
                    a.add(in.nextInt());
                    ans = two.answer(a.get(0), a.get(1));
                    System.out.println("\n" + ans);
                }
                case 3 -> {
                    System.out.println("value of a :");
                    a.add(in.nextInt());
                    System.out.println("value of b :");
                    a.add(in.nextInt());
                    ans = three.answer(a.get(0), a.get(1));
                    System.out.println("\n" + ans);
                }
                default -> System.out.println("Enter a correct choice!");
            }
        in.close();
    }
}