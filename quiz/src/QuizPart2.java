import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class QuizPart2 {

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
