import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Quiz {

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

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 16
// The String method substring returns a substring (a string that original string contains) of the original string.
// The method can have two parameters: the first is an int, beginningIndex, representing the index where the substring
// begins; the second is another int, endingIndex, representing the first index greater than the beginningIndex
// that is not included in the substring. For this problem, you will make a comparable method for an array...
//
// Given an arr, arr, two ints (begin, end), return an array that is the sub-array of the orginal, arr.
    /**
     * {1, 2, 3, 4, 5, 6, 7}, 2, 7 : => {3, 4, 5, 6, 7}
     * {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 0, 1 : => {10}
     * {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6, 9 : => {7, 8, 9}
     *
     * */

    public static int[] getSubArray(int[] arr, int begin, int end){


        return new int[100]; // replace this line whenever you start working on this one.
    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 17
// on the TV show "Pee-wee's Playhouse ( https://en.wikipedia.org/wiki/Pee-wee%27s_Playhouse ), every episode there
    // would be a secret-word. Whenever that secret word was spoken by a character in the episode, everyone was
    // instructed to scream very loud.
// given a String representing the script for an episode & another string that is the secret word for that episode...
    // check every line (new lines separate lines from one another '\n')
    // for every word (spaces separate words from one another ' ') TO SEE IF THE SECRET WORD OCCURS.
    // wherever the secret word occurs modify the script so that "AHHHHHHHHHHHH HAAAAAAAAAA!!" is inserted right after
    // the occurrence of the secret word in the script.
    // RETURN* the updated script when the method has finished checking every word in every line of the episode's script.

    public static String peeWeesSecretWord(String script, String secretWord){


        return ""; // replace this line whenever you start working on this one.
    }



/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 18
// given a natural number n that is greater than or equal to 1...
// while n does not equal 1...
////// print n to the console
////// then if n is an even number, reassign n to n divided by 2
////// otherwise (when n is odd), reassign n to n multiplied by 3 and add 1 to that product
////// ...
// ^ repeat these steps as many times as need be ^
// upon exiting the while loop, print n one last time, 1 should print to the console
    /**
     * 3 : => 3
     *        10
     *        5
     *        16
     *        8
     *        4
     *        2
     *        1 [prints to the console]
     *
     * 4 : => 4
     *        2
     *        1 [prints to the console]
     *
     * 6 : => 6
     *        3
     *        10
     *        5
     *        16
     *        8
     *        4
     *        2
     *        1 [prints to the console]
     *
     * 7 : => 7
     *        22
     *        11
     *        34
     *        17
     *        52
     *        26
     *        13
     *        40
     *        20
     *        10
     *        5
     *        16
     *        8
     *        4
     *        2
     *        1 [prints to the console]
     * */
    public static void threeNPlusOne(int n){

    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 19
// refactor your solution to problem 7 so that given a number n that is greater than or equal to 1...
    // return the number x that is between 1 & n and takes the most iterations to complete the above defined while loop

    public static int longestSequenceOfThreeNPlusOne(int n){


        return 0; // replace this line whenever you start working on this one.
    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 20
// Given a string representing a text, RETURN* a HashMap where every unique character in the text is a key in the
// HashMap & every corresponding value is the number of times that character occurs in the text.
// COUNT THE CHARACTERS...

    public static HashMap<String,Integer> countingCharacters(String text){


        return new HashMap<String,Integer>(); // replace this line whenever you start working on this one.
    }


/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 21
// Refactor your solution to PROBLEM 9 so that it takes a string representing a text but counts the occurrence of
// words in a text instead of characters.

    public static HashMap<String, Integer> countingWords(String text){


        return new HashMap<String,Integer>(); // replace this line whenever you start working on this one.
    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 22
// Given: 1) an array of int arrays, board, represent a chessboard as an 8x8 matrix;
// 2) an int array of length 2, position, representing the position of the king on the board,
// index 0 being the row & index 1 being the column where the King piece is positioned;
// and 3) another int array of length 2, newPosition, representing where the player wishes to move the King piece...
// RETURN* a boolean value: true, if it is a valid move; false, if it is not.
// You don't have to concern yourself with the other friendly pieces inhibiting the King's movements on the board.

    public static boolean isValidKingMove(int[][] board, int[] position, int[] newPosition){


        return true; // replace this line whenever you start working on this one.
    }


/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 23
// Same problem but this time for Rook piece...
// RETURN* a boolean value: true, if it is a valid move; false, if it is not.
// You don't have to concern yourself with the other friendly pieces inhibiting the Rook's movements on the board.

    public static boolean isValidRookMove(int[][] board, int[] position, int[] newPosition){


        return true; // replace this line whenever you start working on this one.
    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 24
// Same problem but this time for Bishop piece...
// RETURN* a boolean value: true, if it is a valid move; false, if it is not.
// You don't have to concern yourself with the other friendly pieces inhibiting the Bishop's movements on the board.

    public static boolean isValidBishopMove(int[][] board, int[] position, int[] newPosition){


        return true; // replace this line whenever you start working on this one.
    }

/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 25
// Same problem but this time for Knight piece...
// RETURN* a boolean value: true, if it is a valid move; false, if it is not.
// You don't have to concern yourself with the other friendly pieces inhibiting the Knight's movements on the board.

    public static boolean isValidKnightMove(int[][] board, int[] position, int[] newPosition){


        return true; // replace this line whenever you start working on this one.
    }


/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 26
// Given a string, RETURN* a string such that any alphabetical characters will be swapped out with another alphabetical
// character 13 letters off in the lower or uppercase alphabet,
// "abcdefghijklmnopqrstuvwxyz" or "ABCDEFGHIJKLMNOPQRSTUVWXYZ".
    /**
     * "Hello world!" : => "Uryyb jbeyq!", because 'U' is 13 letters after 'H' in the uppercase alphabet,
     *                                             'r' is 13 letters after 'e' in the lowercase alphabet,
     *                                             'y' is 13 letters after 'l' in the lowercase alphabet,
     *                                             'y' is 13 letters after 'l' in the lowercase alphabet,
     *                                             'b' is 13 letters after 'o' in the lowercase alphabet, <<< notice that once a letter exceeds the length of the 26 characters as in the case of 'o' that the alphabet just loops over.
     *                                             ' ' is not an alphabetical character so we leave it be,
     *                                             'j' is 13 letters after 'w' in the lowercase alphabet, <<< notice that once a letter exceeds the length of the 26 characters as in the case of 'o' that the alphabet just loops over.
     *                                             'b' is 13 letters after 'o' in the lowercase alphabet, <<< notice that once a letter exceeds the length of the 26 characters as in the case of 'o' that the alphabet just loops over.
     *                                             'e' is 13 letters after 'r' in the lowercase alphabet, <<< notice that once a letter exceeds the length of the 26 characters as in the case of 'o' that the alphabet just loops over.
     *                                             'y' is 13 letters after 'l' in the lowercase alphabet,
     *                                             'q' is 13 letters after 'd' in the lowercase alphabet,
     *                                             '!' is not an alphabetical character so we leave it be.
     *
     * goto : https://cryptii.com/pipes/caesar-cipher and set the shift value to 13 for more examples.
     *
     * */

    public static String caesarCipher(String msg){


        return ""; // replace this line whenever you start working on this one.
    }
/////  /////  /////  /////  /////  /////  /////  /////  /////  /////  /////  ///// PROBLEM 27
// Given a String, sequence, representing... well nothing but what a String simply is: a sequence of chars,
// RETURN* an Set of Strings of all the possible permutations the original sequence can be rearranged into.
    /**
     * "123" : => {"123", "132", "213", "231", "312", "321"}
     * "" : => {}
     * "a" : => {"a"}
     * "ab" : => {"ab", "ba"}
     * "aab" : => {"aab", "aba", "baa"} << working with Set as your return type, you should have to concern yourself with duplicates
     * "aa" : => {"aa"} << working with Set as your return type, you should have to concern yourself with duplicates
     * "abcdefghijklmnopqrstuvwxyz" : => [a set that is 26! (i.e. 26*25*24*23*22*21*20*19...*3*2*1) Strings long]
     *
     * */

    public static Set<String> sequenceOfSequences(String sequence){


        return new HashSet<String>(); // replace this line whenever you start working on this one.
    }
}
