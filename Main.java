import java.time.LocalDateTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
// 1.Настроить проект, вывести в консоль “Hello world!”.
// Вывести в консоль системные дату и время

       System.out.println("HELLO " + LocalDateTime.now());

//2.Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

        // Scanner inputRead = new Scanner(System.in);
        // int a = inputRead.nextInt(); // вывод числа
        // System.out.println(a + "is the number");
 
        //                    &&

        // Scanner iScanner = new Scanner(System.in);
        // String name = iScanner.nextLine(); // вывод имени  и числа
        // System.out.printf("Привет, " + name);



        // последовательно вывод цифр

        // int[] ints = {1,2,3,4,5,6,7,8,9,10};//счетчик
        // for (int i = 0; i < ints.length; i++) {
        //     System.out.println(ints[i]);
        // }


        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.


        // int[] ints = {1,1,0,1,1,1};//счетчик
     
        //     int count = 0;
        //     int max = 0 ;
        //    for (int i = 0; i < ints.length; i++) {  
        //     if(ints[i]==1)  
        //         {
        //             count ++;
        //         }
        //     else{
        //         if(count>max){
        //         max=count;
        //         }
        //         count=0;
        //     }         
        // }
        //      if(count>max)
        //         max=count;
        //         count=0;
        //     System.out.println(max);



// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//  а остальные - равны ему.


// Пример
// while(true){
//     int i = 1;
//     System.out.println(i++);
// }

// int[] nums= {3,2,2,3};
// int val = 3;
// for(int i = 0 ; i < nums.length; i++ ){
//     for(int j = 0; i < nums.length; j++ ){
//         if (nums[ j - 1 ] == val ){
//             int tmp = nums[ j- 1 ];
//             nums[ j - 1 ] = nums[ j ];
//             nums[ j ]=tmp;
//         }
//     }
  
// }
// for (int i = 0; i < nums.length; i++) {
//     System.out.println(nums);      
// }




//     Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".


String[] strings = {"flower","flow","flight","apple","flip"};
String Prefix = "fl";  // присвоение переменной
int  len = 0,count = 0;
for (int i = 0; i < strings.length; i++) {
if(strings[i].startsWith(Prefix)){
    if(strings[i]length()>len){
    len = strings[i]length();
    count = i;
    
    }

 }
}

 System.out.println(strings[count]);







        }
        
    }


