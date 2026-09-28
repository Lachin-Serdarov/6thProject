import java.util.Scanner;

public class SixthProject {
    public static void main(String[] args) {

        // Dərs #1 - Integer a = 127, b = 127; və Integer c = 128, d = 128; üçün == və equals() ilə müqayisə et. Nəticələr niyə fərqlidir?

        Integer a = 127;
        Integer b = 127;

        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println(a.equals(b));

        // Dərs #2 - String inputun polindrome olub olmamasini yoxlayin.

        Scanner scr = new Scanner(System.in);

        System.out.println("Polindrom olub-olmadığını yoxlamaq üçün söz daxil edin: ");

        String word = scr.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " - polindromdur.");
        } else {
            System.out.println(word + " - polindrom deyil");
        }

        // Dərs #3 - Sətri tərsinə çevir ("hello" → "olleh")

        String word2 = "hello";
        String reversed2 = new StringBuilder(word2).reverse().toString();

        System.out.println(reversed2);

        // Dərs #4 - Anagram yoxlaması ("listen" və "silent")

        String w1 = "listen";
        String w2 = "silent";

        char[] a1 = w1.toCharArray();
        char[] b1 = w1.toCharArray();

        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] > a1[j]) {
                    char temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
                if (b1[i] > b1[j]) {
                    char temp = b1[i];
                    b1[i] = b1[j];
                    b1[j] = temp;
                }
            }
        }
        boolean exp = true;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != b1[i]) {
                exp = false;
                break;
            }
        }
        System.out.println(exp ? "Anaqramdır" : "Anaqram deyil");




        // Dərs #5 - Sözlərin sırasını tərsinə çevir ("I love Java" → "Java love I")

        String word3 = "I love Java";

        String[] words = word3.split(" ");

        for (int i = words.length - 1; i >=0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println(reversed.trim());



        // Dərs #6 - Təkrarlanan simvolları tap və say ("programming" → r=2, g=2, m=2)

        String word4 = "programming";

        for (int i = 0; i < word4.length(); i++) {
            char c1 = word4.charAt(i);
            int count = 0;

            for (int j = 0; j < word4.length(); j++) {
                if (word4.charAt(j) == c1) {
                    count++;
                }
            }
            if (count > 1 && word4.indexOf(c1) == i) {
                System.out.println(c1 + " = " + count);
            }
        }

        // Dərs #7 - Hər sözün ilk hərfini böyük et ("salam dunya" → "Salam Dunya")

        String text = "salam dunya";
        String[] words1 = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word6 : words1) {
            String capitalized = word6.substring(0, 1).toUpperCase() + word6.substring(1);
            result.append(capitalized).append(" ");
        }

        System.out.println(result.toString().trim());

        // Dərs #8 - Rəqəm yoxlaması alqoritmi(Daxil edilen inputun reqem olub olmamasinin yoxlanmasi)

        Scanner scr2 = new Scanner(System.in);

        System.out.println("Input daxil edin: ");

        String input = scr2.nextLine();


        if (input.matches("\\d+")) {
            System.out.println("Input rəqəmdir");
        } else {
            System.out.println("Input rəqəm deyil");
        }

    }
}
