//Посчитать сколько строка содержит слов и определить является ли хотя бы одно
//из слов палиндромом
public class ExFour {
    public static void main(String[] args) {
        String str = "THE TETRAPYRENE PIGMENTS STUDIED WERE FOUND TO HAVE SIMILAR ABSORPTION AND FLUORESCENT PROPERTIES IN ORGANIC SOLVENTS";
        String[] b = str.split(" ");
        System.out.println("Количество слов: " + b.length);
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            StringBuffer buffer = new StringBuffer(b[i]);
            buffer.reverse();
            String a = buffer.toString();
            if (b[i].equals(a)) {
                System.out.println("Палиндром: " + b[i]);
            } else {
                count++;
            }
        }
        if (count == b.length) {
            System.out.println("Полидромов нет");
        }
    }
}


