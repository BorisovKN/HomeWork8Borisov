//Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented
//programming» (не учитываем регистр символов) на «OOP». Например, строка
//"Object-oriented programming is a programming language model organized around
//objects rather than "actions" and data rather than logic. Object-oriented programming
//blabla. Object-oriented programming bla." должна быть преобразована в
//"Object-oriented programming is a programming language model organized around
//objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented
//programming bla."
public class ExSix {
    public static void main(String[] args) {
        String str = "Object-oriented programming is a programming language model organized around\n" +
                "objects rather than \"actions\" and data rather than logic. Object-oriented programming\n" +
                "blabla. Object-oriented programming bla.";
        str = str.replaceAll("(?i)object-oriented programming", "OOP");
        System.out.println(str);

    }
}
