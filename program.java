import java.util.Scanner;

/**
 * program
 */
public class program {
    public static void main(String[] args) {  /**Вход в программу */
        System.out.println("ВЫВОД ПРОГРАММЫ");
        System.out.println("Для вывода короткий код : Sysout");


        boolean f = 123 <= 321; // Присвоение сразу знач
        System.out.println(f);

        boolean f1 = true ^ false;// разделитель , возвращает истину и только тогда строго одно из значений истина
        System.out.println(f1);

        int a = 123;
        a= a-- - --a;
        System.out.println(a);

   
   
        // Получение данных из терминала  !!!!!!!!!!!!!!!!
//Строки

    Scanner iScanner = new Scanner(System.in);
    System.out.printf("name: ");
    String name = iScanner.nextLine();
    System.out.printf("Привет, %s!", name);
    iScanner.close();
    



    // СТРОКИ НЕ ТАК ПРОСТЫ 

        String msg ="Hello строки ";
                System.out.println(msg);


    // НЕЯВНАЯ ТИПИЛИЗАЦИЯ

        // var a = 123;
        // System.out.println(a); // 123
        // var d = 123.456;
        // System.out.println(d); // 123.456

        // System.out.println(getType(a)); // Integer
        // System.out.println(getType(d)); // Double
        // d = 1022;
        // System.out.println(d); // 1022
        // //d = "mistake";
        // //error: incompatible types:
        // //String cannot be converted to double
 
//ВИДЫ СПЕЦИФИКАТОРОВ

        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,
        // например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений

    int a1 = 1, b = 2;
    int c = a1 + b;
    String res = String.format("%d + %d = %d \n", a, b, c);
    System.out.printf("%d + %d = %d \n", a, b, c);
    System.out.println(res);
                
   // Управляющие конструкции:
 //тернарный оператор

    int a2 = 1;
    int b2 = 2;
    int min = a2 < b2 ? a2 : b2; // ЕСЛИ ДО ВОПРОСА СОВПАДАЕТ ТО ВЫПОЛН ДЕЙСТВИЕ ПОСЛЕ ВОПРОСА , ЕСЛИ НЕТ ТО ВОЗВРАЩАЕТСЯ B2
    System.out.println(min);  

    }
    static String getType(Object o){
 return o.getClass().getSimpleName();

 

 
    }
}
  


// Примитив Обертка
  
// int Integer
// short Short
// long Long
// byte Byte
// float Float
// double Double
// char Character
// boolean Boolean

// Присваивание: =
// ● Арифметические: *, /, +, -, %, ++, --
// ● Операции сравнения: <, >, ==, !=, >=, <=
// ● Логические операции: ||, &&, ^, !
// ● Побитовые операции <<, >>, &, |, ^


// && - истина только тогда когда оба истины,  если слева дает  false , то нет смысла проверять правое высказвание пример 
// boolean b == s.length() >= 5 && s.charAt(4) == '1', если  false  и что-то еще одназначно false 
// & - проверяет то и другое высказывание, если даже в начале  false , то другое высказывание так же проверит

// аналогично действует или || и |



