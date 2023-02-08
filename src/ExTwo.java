//Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в
//позиции 0
public class ExTwo {
    public static void main(String[] args) {
        String str = "THE TETRAPYRENE PIGMENTS STUDIED WERE FOUND TO HAVE SIMILAR ABSORPTION AND FLUORESCENT PROPERTIES IN ORGANIC SOLVENTS";
        System.out.println(str.replace(str.charAt(3), str.charAt(0)));
    }
}
