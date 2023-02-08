//Перевернуть строку, изменив расположение символов в строке задом наперёд.
public class ExThree {
    public static void main(String[] args) {
        String str = "THE TETRAPYRENE PIGMENTS STUDIED WERE FOUND TO HAVE SIMILAR ABSORPTION AND FLUORESCENT PROPERTIES IN ORGANIC SOLVENTS";
        String revStr = new StringBuffer(str).reverse().toString();
        System.out.println(revStr);
    }
}
