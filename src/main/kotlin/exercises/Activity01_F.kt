fun main (){

    /*Create an application that will accept 1 string.
    Your application will print “Palindrome” if the string is a palindrome.
     */

   print("Enter a String: ")
    var inputWord : String = readln()

    var reverseString : String = ""
    var ctr : Int = inputWord.length - 1

    //checking the string by reversed
    while(ctr != -1){
        reverseString += inputWord[ctr--]
    }
    //condition to know the inputWord and reverseString are equal to Palindrome or NOT
    if(inputWord.uppercase() == reverseString.uppercase()){
        println("The $inputWord is a Palindrome String")
    }else
        println("The $inputWord is NOT a Palindrome String")
}