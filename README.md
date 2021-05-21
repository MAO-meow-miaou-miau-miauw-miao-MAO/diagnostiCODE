# diagnostiCODE
_fork &amp; clone; and then commit &amp; push as many solutions as you can solve within an hour's time_
`FOR EVERY PROBLEM THERE IS A CORRESPONDING STATIC METHOD OF THE SIMILAR NAME (E.G. PROBLEM1, PROBLEM2, PROBLEM3, ETC) INSIDE OF THE QUIZ.JAVA FILE. YOUR SOLUTION CODE WILL GO THERE.`


## problem 1:
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


## problem 2:
Given a string `word`, PRINT* to the console the string in reverse order. `"Dog"` => <prints> `goD` to the console.
```
    /**
     * "Dog" : => goD [prints to the console]
     *  "abc" : => cba [prints to the console]
     * "In girum imus nocte et consumimur igni" => ingi rumimusnoc te etcon sumi murig nI [prints to the console]
     *         ---this almost reads the same both backwards and forwards. This almost counts as a palindrome, see next problem.
     *
     * */
```


## problem 3:
Given a string `word`, RETURN* true if the string is a palindrome & false if it is not. A palindrome is any string that is the same string both forwards & backwards (i.e. in reverse order). THIS SHOULD BE CASE-INSENSITIVE: `"Mom"`/`"dAd"`/`"rACeCAR"` => returns `true`
```
    /**
     * "MOm" : => [returns] true
     * "raceCAr" : => [returns] true
     * "Java is fun" : => [returns] false
     * "Java sucks" : => [returns] false
     * */
```

## problem 4:
Given an array of ints, `arr`, RETURN* the INDEX of where the smallest int is stored.
```
    /**
     * {42, 7, 0, 88, -37, 2999, 17, 348, -1} : => [returns] 4, because arr[4] is -37 which is the smallest number in the array
     * {1728, 1349, 1626, 22888, 277, 17190 , 27727, 4905, 88, 181837} : => [returns] 8, because arr[8] is 88 which is the smallest number in the array.
     */

```

## problem 5:
Given a natural number, `n`, PRINT* to the console n-number of lines composed of the char '#' that observe the following pattern:
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

## problem 6:
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

## problem 7:
on the TV show ["Pee-wee's Playhouse"](https://en.wikipedia.org/wiki/Pee-wee%27s_Playhouse), every episode there
would be a secret-word. Whenever that secret word was spoken by a character in the episode, everyone was
instructed to scream very loud.
Given a String, `script`, representing the script for an episode & another string, `secretWord`, that is the secret word for that episode...
check every line (new lines separate lines from one another by the new-line character)
for every word (spaces separate words from one another `' '`) TO SEE IF THE SECRET WORD OCCURS.
wherever the secret word occurs modify the script so that `"AHHHHHHHHHHHH HAAAAAAAAAA!!"` is inserted right after
the occurrence of the secret word in the script.
RETURN* the updated script when the method has finished checking every word in every line of the episode's script.
## problem 8:
Given a natural number, `n` that is greater than or equal to `1`...
>while `n` does not equal `1`...
>>print `n` to the console\
then if n is an even number, reassign `n` to `n` divided by `2`\
otherwise (when `n` is odd), reassign `n` to `n` multiplied by `3` and add `1` to that product\
...

>^ repeat these steps as many times as need be ^\
upon exiting the while loop, print `n` one last time, 1 should print to the console

## problem 9:
Refactor your solution to problem 7 so that given a number `n` that is greater than or equal to `1`...\
Return the number `x` that is between `1` & `n` and takes the **_most_** iterations in order to complete the above defined while loop


## problem 10:
**COUNT THE CHARACTERS**...\
Given a string, `text`, representing a text, RETURN* a HashMap where every unique character in the text is a key in the HashMap & every corresponding value is the number of times that character occurs in the text.

## problem 11:
**COUNT THE WORDS**...\
Refactor your solution to problem 9 so that it takes a string representing a text but counts the occurrence of words in a text instead of characters.

## problem 12:
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