//Даны строки разной длины (длина - четное число), необходимо вернуть ее два
//средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
public class ExSeven {
    public static void main(String[] args) {
        String[] words = {"string", "code", "Practice"};
        for (String word : words) {
            System.out.printf("%s --> \"%s\"%n", word, word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
        }
    }
}
