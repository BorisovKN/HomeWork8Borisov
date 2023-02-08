//Слить две строки, вставив символы одной строки между символами другой строки
public class ExEight {
    public static void main(String[] args) {
        String str = "THE TETRAPYRENE PIGMENTS STUDIED WERE FOUND TO HAVE SIMILAR ABSORPTION AND FLUORESCENT PROPERTIES IN ORGANIC SOLVENTS";
        String str1 = "WE INVESTIGATED THE FORMATION OF COMPLEXES MTHPC WITH MONOMERS AND POLYMERIC DERIVATIVES OF CYCLODEXTRINS";
        String[] a = str1.split("");
        StringBuffer buffer = new StringBuffer(str);
        int count = 1;
        for (int i = 0; i < str1.length(); i++) {
            buffer.insert(count,a[i]);
            count=count+2;
        }
        System.out.println(buffer);
    }
}
