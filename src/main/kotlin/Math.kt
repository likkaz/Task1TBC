class Math(){
    //function for calculating greatest common factor recursively
    fun greatestCommFactor(number1:Int, number2:Int): Int {
        return if (number2 != 0)
            greatestCommFactor(number2, number1%number2)
        else number1
    }

    //function for calculating lowest common multiple
    fun leastCommMultiple(number1: Int, number2: Int) {
        var greatestNum:Int = if(number1>number2) number1 else number2
        while(true){
            if (greatestNum%number2==0 && greatestNum%number1==0)
                println("Least Common Multiple is $greatestNum ")

            break

        }
        ++greatestNum  //incrementing by 1 and rechecking

    }
    //if String has $ sign in it it returns false
    fun hasInvalidChar(text:String):Boolean{
        return "$" in text

    }

    fun addingEvens(numEnd:Int):Int {
        if (numEnd > 0) {
            var result = 0
            for (i in 1 until numEnd) {
                if (i % 2 == 0) result += i
            }; return result
        } else {
            return addingEvens(0-numEnd)
        }
    }

    fun inverseNum(num:Int){ // reversing number simply using .reverse function
        var str=num.toString()
        str= str.reversed()
        var newNum=str.toInt()
        println("inverse of $num is $newNum")
    }

    fun palindromeTest(palText:String): Boolean {
        var baseText= palText.filter { it.isLetter() }.toLowerCase() // I googled '.filter' statement, I promise I am not Jemala
        //it just felt like beautiful and right approach to use.
        return baseText == baseText.reversed()

    }

}