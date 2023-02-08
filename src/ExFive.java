//Даны два предложения посчитать сколько слов совпадает.
import java.util.ArrayList;

public class ExFive {
    public static void main(String[] args) {
        String str = "THE TETRAPYRENE PIGMENTS STUDIED WERE FOUND TO HAVE SIMILAR ABSORPTION AND FLUORESCENT PROPERTIES IN ORGANIC SOLVENTS";
        String str1 = "WE INVESTIGATED THE FORMATION OF COMPLEXES MTHPC WITH MONOMERS AND POLYMERIC DERIVATIVES OF CYCLODEXTRINS";
        String[] a = str.split(" ");
        String[] b = str1.split(" ");
        ArrayList<String> c = new ArrayList<String>();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    if (!c.contains(a[i])) {
                        c.add(a[i]);
                    }
                }
            }
        }
        for (String s : c) {
            System.out.println(s);
        }
        System.out.println("Количество повторяющихся слов: " + c.size());

    }
}
