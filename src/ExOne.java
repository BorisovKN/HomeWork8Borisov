//Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//последнего вхождения символа(B).
public class ExOne {
    public static void main(String[] args) {
        String str = "THE TETRAPYRENE PIGMENTS STUDIED WERE FOUND TO HAVE SIMILAR ABSORPTION AND FLUORESCENT PROPERTIES IN ORGANIC SOLVENTS";
        int a = 0;
        int b = 0;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' && flag) {
                a = i;
                flag = false;
            }
            if (str.charAt(i) == 'B' && !flag) {
                b = i;
                break;
            }
        }
        System.out.println(str.substring(a, b));
    }
}
