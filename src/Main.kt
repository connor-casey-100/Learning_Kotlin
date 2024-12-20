/* Connor Casey
This program is designed to accept a string input to return an acronym. For example, if
the user inputs "Laugh out loud", the program outputs "LOL". The program can also take
a hyphenated string and treat it as two words. For example, if the user inputs
"Liquid-crystal display", the program outputs "LCD".
 */

fun main() {
    var acronym = ""
    println("Enter a string to get an acronym:")
    val input = readLine()

   // Conditional statement to validate input
    if (input != null) {
        if (input.contains("-") || (input.contains(" "))) {
            val words = input.split("-", " ")

            // For loop to add each letter from the words to the acronym
            for (word in words) {
                acronym += word.first().uppercase()
            }
            println("The acronym for $input is $acronym.")
        } else {
            println("I cannot make an acronym with \"$input\". Please try again.")
            main()
        }
    }
}
