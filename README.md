# diagnostiCODE
_fork &amp; clone; and then commit &amp; push as many solutions as you can solve within an hour's time_
`FOR EVERY PROBLEM THERE IS A CORRESPONDING STATIC METHOD OF THE SIMILAR NAME (E.G. PROBLEM1, PROBLEM2, PROBLEM3, ETC) INSIDE OF THE QUIZ.JAVA FILE. YOUR SOLUTION CODE WILL GO THERE.`


## Problem 1:
### SPELL IT OUT
Given a string `str` print to the console every character in that string, one-letter-at-a-time, one-letter-per-line.
```
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

```

## Problem 2:
### BLAST-OFF
Given an int, `t_minus`, representing seconds until a rocket blasts off, **PRINT*** to the console the countdown.\
When `t_minus` is `0`, **PRINT*** to the console `"BLAST OFF!"`
```
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
```

## Problem 3:
### HAS CHARACTER IN STRING
Given a string, `str`, and a char, `chr`, **RETURN*** `true` if `str` contains `chr`; this should be _case-sensitive_.
```
/**
* "awkwaRd", 'R' : => [returns] true
* "apple", 'A' : => [returns] false
* "syzygy", 'z' : => [returns] true
* "again", '!' : => [returns] false
*
* */
```
 

## Problem 4:
### HAS NUMBER IN ARRAY
Given an array of ints, `arr`, and an int, `n`, **RETURN*** `true` if `n` is in `arr`; **RETURN*** `false` if it is not.
```
/**
* {}, 3 : => false
* {1,2,3} : => true
* {-1,0,1}, 3 : => false
* {-1,0,1}, 0 : => true
*
* */
```

## Problem 5:
### PRINT THE SUM OF THE ARRAY
Given an array of ints, `arr`, **PRINT*** to the console the int that is the _SUM_ of all the ints in the array added together.
```
/**
* {1,2,3} : => 6 [prints to the console]
* {} : => 0 [prints to the console]
* {-1, -2, 3} : => 0 [prints to the console]
* {0, 1, 1, 2, 3, 5, 8, 13, 21} : => 54 [prints to the console]
*
* */
```

## Problem 6:
### PRINT THE AVERAGE OF THE ARRAY
Given a non-empty array of ints, `arr`, **PRINT*** to the console the _AVERAGE_ of all the numbers in that arr.
```
/**
* {1,2,3} : => 2 [prints to the console]
* {-1, -2, 3} : => 0 [prints to the console]
* {0, 1, 1, 2, 3, 5, 8, 13, 21} : => 6 [prints to the console]
* {5, 7, 7, 11} : => 7.5 [prints to the console]
*
* */
```

## Problem 7:
### REPLACE UNLUCKY NUMBERS IN AN ARRAY
Given an array, `arr`, and an int, `unluckyNumber`, representing an unlucky number. **RETURN*** an array, where any occurrence
of the unlucky number is replaced by the number `7` in the array.
```
/**
* {1, 2, 3, 4, 5}, 13 : => {1, 2, 3, 4, 5}
* {13, 21, 23, 666}, 23 : => {13, 21, 7, 666}
* {0, 0, 0, 0, 0, 0, 0}, 0 : => {7, 7, 7, 7, 7, 7, 7}
*
* */
```

## Problem 8:
### REVERSE THE STRING
Given a string `word`, **PRINT*** to the console the string in reverse order. `"Dog"` => <prints> `goD` to the console.
```
    /**
     * "Dog" : => goD [prints to the console]
     *  "abc" : => cba [prints to the console]
     * "In girum imus nocte et consumimur igni" => ingi rumimusnoc te etcon sumi murig nI [prints to the console]
     *         ---this almost reads the same both backwards and forwards. This almost counts as a palindrome, see next problem.
     *
     * */
```

## Problem 9:
### IS A PALINDROME?
Given a string `word`, **RETURN*** `true` if the string is a palindrome & `false` if it is not. A palindrome is any string that is the same string both forwards & backwards (i.e. in reverse order). _THIS SHOULD BE CASE-INSENSITIVE_: `"Mom"`/`"dAd"`/`"rACeCAR"` => returns `true`
```
    /**
     * "MOm" : => [returns] true
     * "raceCAr" : => [returns] true
     * "Java is fun" : => [returns] false
     * "Java sucks" : => [returns] false
     * */
```

## Problem 10:
### FIND THE INDEX OF WHERE THE SMALLEST NUMBER IN AN ARRAY IS
Given an array of ints, `arr`, **RETURN*** the _INDEX_ of where the smallest int is stored.
```
    /**
     * {42, 7, 0, 88, -37, 2999, 17, 348, -1} : => [returns] 4, because arr[4] is -37 which is the smallest number in the array
     * {1728, 1349, 1626, 22888, 277, 17190 , 27727, 4905, 88, 181837} : => [returns] 8, because arr[8] is 88 which is the smallest number in the array.
     */

```
## Problem 11:
### WISH SOME FOLKS A HAPPY BIRTHDAY...
Given an array of booleans, `isTheirBirthday`, and an array of Strings, `names`, where both arrays are of equal length
and _each boolean_ (`true`/`false`) _corresponds_ to a person's _name at the same index_. If the value, for instance, at index
`1` is `true` in `isTheirBirthday` and the value at index `1` in names is `"Paul"` that means that it's Paul's birthday and
the method should print to the console `Happy Birthday Paul!`. If the value at any index is `true` **PRINT*** to the console
`Happy Birthday {person's name in the array names}!`\
If the value at any index in `isTheirBirthday` is `false`, do nothing.
```
/**
* {false,true,false,true false}, {"Steve Albini", "Efrim Menuck", "Ian MacKaye","G.G. Allin", "Tim Kinsella"}
*      : => Happy Birthday Efrim Menuck!
*           Happy Birthday G. G. Allin! [prints to the console]
*
* */
```

## Problem 12:
### SENTENCE COMPOSITION
Given three arrays of Strings (`subjects`, `verbs`, and `objects`) all of which are of the same length. The array `subjects`
contains Strings representing nouns (e.g. `"The dog"`, `"King George"`, `"A bunny"`, `"You"`); the array `verbs` contains
Strings representing `verbs` the subjects perform (e.g. `"bit"`, `"likes"`, `"digs"`, `"sang"`); and the array `objects`
Strings representing the objects of those verbs (e.g. `"me."`, `"plum pudding."`, `"a burrow."`, `"an aria."`).
**PRINT*** to the console, the sentences composed by these arrays.
```
/**
* {"The dog", "King George", "A bunny", "You"}, {"bit", "likes", "digs", "sang"},
* {"me.", "plum pudding.", "a burrow.", "an aria."}
* : => The dog bit me.
*      King George likes plum pudding.
*      A bunny digs a burrow.
*      You sang an aria. [prints to the console
*
* */
```

## Problem 13:
### HANGMAN
In the game [Hangman](https://en.wikipedia.org/wiki/Hangman_(game)) One player thinks of a word, phrase or sentence
and the other(s) tries to guess it by suggesting letters within a certain number of guesses.\
Given a String, `secretWord`, a char, `guess`, and another String, `blanks`, where the Strings `secretWord` & `blanks` will
be of the same length. The difference being that `secretWord` will be strings like `"food"` or `"protocol"`
& `blanks`  will be strings like this `"_ _ _ _ "`,  `" _ _ _ _ _ _ _ _ "`
**RETURN*** a String that represents an updated version of `blanks`, if the char, `guess`, occurs anywhere in
the String `secretWord`. The char, `guess`, should be plugged into `blanks` at the corresponding index where the char
occurs in `secretWord`. If char does not occur in secretWord, just return blanks unchanged.\
_This method should be case-insensitive_.
```
/**
* "protocol", 'o', " _ _ _ _ _ _ _ _ " : => " _ _ o _ o _ o _ "
* "rainbow", 'e', " _ _ _ _ _ _ _ " : => "_ _ _ _ _ _ _"
* "rainbow", 'R', " _ _ _ _ _ _ _ " : => "r _ _ _ _ _ _ "
* */
```

## Problem 14:
### PRINT A PYRAMID, 1
Given a natural number, `n`, **PRINT*** to the console n-number of lines composed of the char '#' that observe the following pattern:
```
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
```


## Problem 15:
### PRINT A PYRAMID, 2
Given a natural number, `n`, PRINT* to the console a triangle whose height is n units tall. For this problem '#' will be the char that you'll be using for this exercise.
```aidl
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
```

## Problem 16:
### SUB-ARRAY
The String method substring returns a substring (a string that original string contains) of the original string.
The method can have two parameters: the first is an int, `beginningIndex`, representing the index where the substring
begins; the second is another int, `endingIndex`, representing the first index greater than the beginningIndex
that is not included in the substring.

For this problem, you will make a comparable method for an array...\

Given an array of ints, `arr`, two ints (`begin`, `end`), return an array that is the sub-array of the original, `arr`.

```
/**
* {1, 2, 3, 4, 5, 6, 7}, 2, 7 : => {3, 4, 5, 6, 7}
* {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 0, 1 : => {10}
* {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6, 9 : => {7, 8, 9}
*
* */
```


## Problem 17:
### PEE-WEE'S SECRET WORD
On the TV show ["Pee-wee's Playhouse"](https://en.wikipedia.org/wiki/Pee-wee%27s_Playhouse), every episode there
would be a secret-word. Whenever that secret word was spoken by a character in the episode, everyone was
instructed to scream very loud.
Given a String, `script`, representing the script for an episode & another string, `secretWord`, that is the secret word for that episode...
check every line (new lines separate lines from one another by the new-line character)
for every word (spaces separate words from one another `' '`) TO SEE IF THE SECRET WORD OCCURS.
wherever the secret word occurs modify the script so that `"AHHHHHHHHHHHH HAAAAAAAAAA!!"` is inserted right after
the occurrence of the secret word in the script.
RETURN* the updated script when the method has finished checking every word in every line of the episode's script.


## Problem 18:
### THREE N PLUS ONE
Given a natural number, `n` that is greater than or equal to `1`...
>while `n` does not equal `1`...
>>print `n` to the console\
then if n is an even number, reassign `n` to `n` divided by `2`\
otherwise (when `n` is odd), reassign `n` to `n` multiplied by `3` and add `1` to that product\
...

>^ repeat these steps as many times as need be ^\
upon exiting the while loop, print `n` one last time, 1 should print to the console

```
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

```


## Problem 19:
### FIND THE LONGEST THREE N PLUS ONE SEQUENCE
Refactor your solution to problem 7 so that given a number `n` that is greater than or equal to `1`...\
Return the number `x` that is between `1` & `n` and takes the **_most_** iterations in order to complete the above defined while loop


## Problem 20:
### COUNTING CHARACTERS
**COUNT THE CHARACTERS**...\
Given a string, `text`, representing a text, RETURN* a HashMap where every unique character in the text is a key in the HashMap & every corresponding value is the number of times that character occurs in the text.

## Problem 21:
### COUNTING WORDS
**COUNT THE WORDS**...\
Refactor your solution to problem 9 so that it takes a string representing a text but counts the occurrence of words in a text instead of characters.

## Problem 22:
### LEGAL CHESS MOVE, KING
Given: 
1) an array of int arrays, `board`, represent a chessboard as an 8x8 matrix;
2) an _int array of length 2_, `position`, representing the position of the king on the board,
index `0` being the row & index `1` being the column where the King piece is positioned;
3) another _int array of length 2_, `newPosition`, representing where the player wishes to move the King piece...\
**RETURN*** a boolean value: `true`, if it is a valid move; `false`, if it is not.\
_You don't have to concern yourself with the other friendly pieces inhibiting the King's movements on the board._

## Problem 23:
### LEGAL CHESS MOVE, ROOK
Same problem but this time for Rook piece...
**RETURN*** a boolean value: `true`, if it is a valid move; `false`, if it is not.\
_You don't have to concern yourself with the other friendly pieces inhibiting the Rook's movements on the board._

## Problem 24:
### LEGAL CHESS MOVE, BISHOP
Same problem but this time for Bishop piece...
**RETURN*** a boolean value: `true`, if it is a valid move; `false`, if it is not.\
_You don't have to concern yourself with the other friendly pieces inhibiting the Bishop's movements on the board._

## Problem 25:
### LEGAL CHESS MOVE, KNIGHT
Same problem but this time for Knight piece...
**RETURN*** a boolean value: `true`, if it is a valid move; `false`, if it is not.\
_You don't have to concern yourself with the other friendly pieces inhibiting the Knight's movements on the board._

## Problem 26:
### CAESAR CIPHER
Given a string, `msg`, RETURN* a string such that any alphabetical characters will be swapped out with another alphabetical character 13 letters off in the lower or uppercase alphabet, `"abcdefghijklmnopqrstuvwxyz"` or `"ABCDEFGHIJKLMNOPQRSTUVWXYZ"`.
```aidl
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

```

## Problem 27:
### SET OF ALL PERMUTATIONS FOR A GIVEN SEQUENCE
Given a String, `sequence`, representing... well nothing but what a String simply is: _a sequence of chars_,
**RETURN*** a Set of Strings of all the possible permutations the original sequence can be rearranged into.
```
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
```