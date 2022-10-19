/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 19/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
                                /*Show the output of the following statements.*/
//                                                 _Solution_
public class Question_04_24 {
    public static void main(String[] args) {
        System.out.println("(a) System.out.printf(\"amount is %f %e\\n\", 32.32, 32.32);");
        System.out.printf("amount is %f %e\n", 32.32, 32.32); // "amount is 32.320000 3.232000e+01"
        System.out.println("_________________________________________");
        System.out.println("(b) System.out.printf(\"amount is %5.2%% %5.4e\\n\", 32.327, 32.32);");
        // System.out.printf("amount is %5.2%% %5.4e\n", 32.327, 32.32); // Exception
        System.out.println("IllegalFormatPrecisionException");
        System.out.println("System.out.printf(\"amount is %%5.2%% %%5.4e\\n\", 32.327, 32.32);");
        System.out.printf("amount is %%5.2%% %%5.4e\n", 32.327, 32.32);
        System.out.println("_________________________________________");
        System.out.println("(c) System.out.printf(\"%6b\\n\", (1 > 2));");
        System.out.printf("\"%6b\"\n", (1 > 2)); // " false"
        System.out.println("_________________________________________");
        System.out.println("(d) System.out.printf(\"%6s\\n\", \"Java\");");
        System.out.printf("\"%6s\"\n", "Java"); // "  Java"
        System.out.println("_________________________________________");
        System.out.println("(e) System.out.printf(\"%-6b%s\\n\", (1 > 2), \"Java\");");
        System.out.printf("\"%-6b%s\"\n", (1 > 2), "Java"); // "false Java"
        System.out.println("_________________________________________");
        System.out.println("(f) System.out.printf(\"%6b%-8s\\n\", (1 > 2), \"Java\");");
        System.out.printf("\"%6b%-8s\"\n", (1 > 2), "Java"); // " falseJava    "
    }
}

//                                                 _Output_
/*
(a) System.out.printf("amount is %f %e\n", 32.32, 32.32);
amount is 32.320000 3.232000e+01
_________________________________________
(b) System.out.printf("amount is %5.2%% %5.4e\n", 32.327, 32.32);
IllegalFormatPrecisionException
System.out.printf("amount is %%5.2%% %%5.4e\n", 32.327, 32.32);
amount is %5.2% %5.4e
_________________________________________
(c) System.out.printf("%6b\n", (1 > 2));
" false"
_________________________________________
(d) System.out.printf("%6s\n", "Java");
"  Java"
_________________________________________
(e) System.out.printf("%-6b%s\n", (1 > 2), "Java");
"false Java"
_________________________________________
(f) System.out.printf("%6b%-8s\n", (1 > 2), "Java");
" falseJava    "
 */