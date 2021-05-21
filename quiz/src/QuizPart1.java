import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class QuizPart1 {

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 1
// Take a string and PRINT* to the console the characters of that string, one letter at a time, one letter per line.
    /**
     * "Oh my gosh!" : => O
     *                    h
     *
     *                    m
     *                    y
     *
     *                    g
     *                    o
     *                    s
     *                    h
     *                    ! [prints to the console]
     *
     * */

    public static void spellItOut(String str){


    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 2
// Given an int, t_minus, representing seconds until a rocket blasts off, PRINT* to the console the countdown.
// t_minus is 0, PRINT* to the console "BLAST OFF!"
    /**
     * 10 : => T-minus: 10
     *         9
     *         8
     *         7
     *         6
     *         5
     *         4
     *         3
     *         2
     *         1
     *         BLAST OFF! [prints to the console]
     *
     * 25 : => T-minus: 20
     *         19
     *         18
     *         17
     *         16
     *         15
     *         14
     *         13
     *         12
     *         11
     *         10
     *         9
     *         8
     *         7
     *         6
     *         5
     *         4
     *         3
     *         2
     *         1
     *         BLAST OFF! [prints to the console]
     *
     * */

    public static void blastOff(int t_minus){


    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 3
// Given a string, str, and a char, chr, RETURN* true if the str contains the character chr; this should be case sensitive.
    /**
     * "awkwaRd", 'R' : => [returns] true
     * "apple", 'A' : => [returns] false
     * "syzygy", 'z' : => [returns] true
     * "again", '!' : => [returns] false
     *
     * */
    public static boolean hasChar(String str, char chr){


        return true; // replace this line whenever you start working on this one.
    }
/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 4
// Given an array of ints, arr, and an int, n, RETURN* true if n is in arr; RETURN* false if it is not.
    /**
     * {}, 3 : => false
     * {1,2,3} : => true
     * {-1,0,1}, 3 : => false
     * {-1,0,1}, 0 : => true
     *
     * */
    public static boolean hasNumber(int[] arr, int n){

        return true; // replace this line whenever you start working on this one.
    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 5
// Given an array of ints, arr, PRINT* to the console the int that is the SUM of all the ints in the array added together.
    /**
     * {1,2,3} : => 6 [prints to the console]
     * {} : => 0 [prints to the console]
     * {-1, -2, 3} : => 0 [prints to the console]
     * {0, 1, 1, 2, 3, 5, 8, 13, 21} : => 54 [prints to the console]
     *
     * */
    public static void printSum(int[] arr){


    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 6
// Given a non-empty array of ints, arr, PRINT* to the console the AVERAGE of all the numbers in that arr.
    /**
     * {1,2,3} : => 2 [prints to the console]
     * {-1, -2, 3} : => 0 [prints to the console]
     * {0, 1, 1, 2, 3, 5, 8, 13, 21} : => 6 [prints to the console]
     * {5, 7, 7, 11} : => 7.5 [prints to the console]
     *
     * */

    public static void printAverage(int[] arr){


    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 7
// Given an array, arr, and an int, unluckyNumber, representing an unlucky number. RETURN* an array, where any occurrence
// of the unlucky number is replaced by the number 7 in the array.
   /**
    * {1, 2, 3, 4, 5}, 13 : => {1, 2, 3, 4, 5}
    * {13, 21, 23, 666}, 23 : => {13, 21, 7, 666}
    * {0, 0, 0, 0, 0, 0, 0}, 0 : => {7, 7, 7, 7, 7, 7, 7}
    *
    * */

   public static int[] removeUnluckyNum(int[] arr, int unluckyNumber){


       return new int[100]; // replace this line whenever you start working on this one.
   }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 8
// Given a string, PRINT* to the console the string in reverse order. "Dog" => <prints> "goD" to the console.
    /**
     * "Dog" : => goD [prints to the console]
     *  "abc" : => cba [prints to the console]
     * "In girum imus nocte et consumimur igni" => ingi rumimusnoc te etcon sumi murig nI [prints to the console]
     *         ---this almost reads the same both backwards and forwards. This almost counts as a palindrome, see next problem.
     *
     * */

    public static void printStrReverse(String word){


    }


/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 9
// given a string, RETURN* true if the string is a palindrome & false if it is not. A palindrome is any string that is
// the same string both forwards & backwards (i.e. in reverse order).
// THIS SHOULD BE CASE-INSENSITIVE: "Mom"/"dAd"/"rACeCAR" => returns true
    /**
     * "MOm" : => [returns] true
     * "raceCAr" : => [returns] true
     * "Java is fun" : => [returns] false
     * "Java sucks" : => [returns] false
     * */
    public static boolean isPalindrome(){


        return true; // replace this line whenever you start working on this one.
    }


/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 10
// given an array of ints, RETURN* the INDEX of where the smallest int is stored.
    /**
     * {42, 7, 0, 88, -37, 2999, 17, 348, -1} : => [returns] 4, because arr[4] is -37 which is the smallest number in the array
     * {1728, 1349, 1626, 22888, 277, 17190 , 27727, 4905, 88, 181837} : => [returns] 8, because arr[8] is 88 which is the smallest number in the array.
     */


    public static int whereIsTheSmallestNum(int[] arr){


        return 0; // replace this line whenever you start working on this one.
    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 11
// Given an array of booleans, isTheirBirthday, and an array of Strings, names, where both arrays are of equal length
// and each boolean (true/false) corresponds to a person's name at the same index. If the value, for instance, at index
// 1 is true in isTheirBirthday and the value at index 1 in names is "Paul" that means that it's Paul's birthday and
// the method should print to the console "Happy Birthday Paul!". If the value at any index is true PRINT* to the console
// "Happy Birthday {person's name in the array names}!" where the name printed to the console is the corresponding index.
// If the value at any index in isTheirBirthday is false, do nothing.
    /**
     * {false,true,false,true false}, {"Steve Albini", "Efrim Menuck", "Ian MacKaye","G.G. Allin", "Tim Kinsella"}
     *      : => Happy Birthday Efrim Menuck!
     *           Happy Birthday G. G. Allin! [prints to the console]
     *
     * */
    public static void happyBirthday(boolean[] isTheirBirthday, String[] names){



    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 12
// Given three arrays of Strings (subjects, verbs, and objects) all of which are of the same length. The array subjects
// contains Strings representing nouns (e.g. "The dog", "King George", "A bunny", "You"); the array verbs contains
// Strings representing verbs the subjects perform (e.g. "bit", "likes", "digs", "sang"); and the array objects
// Strings representing the objects of those verbs (e.g. "me.", "plum pudding.", "a burrow.", "an aria.").
    // PRINT* to the console, the sentences composed by these arrays.
    /**
     * {"The dog", "King George", "A bunny", "You"}, {"bit", "likes", "digs", "sang"},
     * {"me.", "plum pudding.", "a burrow.", "an aria."}
     * : => The dog bit me.
     *      King George likes plum pudding.
     *      A bunny digs a burrow.
     *      You sang an aria. [prints to the console
     *
     * */

    public static void printSentences(String[] subjects, String[] verbs, String[] objects) {


    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 13
// In the game Hangman (https://en.wikipedia.org/wiki/Hangman_(game)) One player thinks of a word, phrase or sentence
// and the other(s) tries to guess it by suggesting letters within a certain number of guesses.
// Given a String, secretWord, a char, guess, and another String, blanks, where the Strings secretWord & blanks will
// be of the same length. The difference being that secretWord will be strings like "food", "dog", "protocol"
// & blanks  will be strings like this "____", "___", "________"
    // RETURN* a String that represents an updated version of blanks, if the char, guess, occurs anywhere in
    // the String secretWord. The char, guess, should be plugged into blank at the corresponding index where the char
    // occurs in secretWord. If char does not occur in secretWord, just return blanks unchanged.
    // This method should be case insensitive.
    /**
     * "protocol", 'o', "________" : => "__o_o_o_"
     * "rainbow", 'e', "_______" : => "_______"
     * "rainbow", 'R', "_______" : => "r______"
     * */

    public static String hangMan(String secretWord, char guess, String blanks){


        return ""; // replace this line whenever you start working on this one.
    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 14
// Given a natural number, n, PRINT* to the console n-number of lines composed of the char '#' that observe
// the following pattern:
    /**
     * 0 : => [nothing prints to the console]

    *  1 : => # [prints to the console]

    *  2 : => #
    *         ##
    *         # [prints to the console]

    *  3 : => #
              ##
              ###
              ##
              # [prints to the console]

    * ...
    * 10 : => #
              ##
              ###
              ####
              #####
              ######
              #######
              ########
              #########
              ##########
              #########
              ########
              #######
              ######
              #####
              ####
              ###
              ##
              # [prints to the console]
    * */

    public static void pyramidScheme1(int n){


    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 15
// given a natural number, n, PRINT* to the console a triangle whose height is n units tall.
// For this problem '#' will be the char that you'll be using for this exercise.
    /**
     *  0 : => [nothing is printed to the console]
     *  1 : => # [is printed to the console]
     *  2 : =>  #
     *         ### [is printed to the console]
     *  3 : =>   #
     *          ###
     *         ##### [is printed to the console]
     * ...
     *  7 : =>       #
     *              ###
     *             #####
     *            #######
     *           #########
     *          ###########
     *         ############# [is printed to the console]
     * */

    public static void pyramidScheme2(int n) {


    }

}
