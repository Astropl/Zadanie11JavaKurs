import java.util.Scanner;

public class Zadanie11
    /*Zadanie 11. Napisać program, który pobiera od użytkownika ciąg
            liczb całkowitych. Pobieranie danych kończone jest podaniem
            wartości 0 (nie wliczana do danych). W następ- nej kolejności
            program powinien wyświetlić sumę największej oraz najmniejszej z
            podanych liczb oraz ich średnią arytmetyczną.
            3
            (
            Przykład:
            Użytkownik podał ciąg: 1, -4, 2, 17, 0. Wynik programu:
            13 // suma min. i maks.
            6.5 // średnia*/
{
    public static void main(String[] args)
    {
        int number=0, i =0;
        int numberMin =100, numberMax=1;
        Scanner sc = new Scanner(System.in);
        int[] tabel;
        tabel = new int[10];




        System.out.println("Podaj kilka liczb naturalnych. \nGdy podasz 0 oblicz sume najwiekszej \ni namniejszej liczby, i średnia arytmetyczną. ");
        do {// jakas operacja
            System.out.println("Podaj liczbe: ");
            number = sc.nextInt();
            //number = numberMin;
            if ( number == 0)
            {
                break;
            }
            else
            {
                if ( number < numberMin)
                {
                    numberMin = number;

                }
                if (number > numberMax){

                    numberMax = number;
                        }
                System.out.println(" min to : "+ numberMin+" a max to : "+numberMax  );

            }

            i++;

        }while ( number != 0);
        System.out.println(" Oblicze teraz sumę min + max i srednią arytmetyczną.\nSuma "+numberMin+"+"+numberMax+"="+(numberMin+numberMax)+"\na średnia arytmetyczna to: "+((numberMin+numberMax)/2));
    }
}
