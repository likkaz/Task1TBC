import javax.print.DocFlavor

fun main(){

    var output: Math =Math()

    println("Greatest Common Factor is ${ output.greatestCommFactor(35,-30)}")

    output.leastCommMultiple(46,23)

    println("Sum of even numbers ${output.addingEvens(-100)}")

    println(output.hasInvalidChar("asdgdf$  fhs$ "))

    output.inverseNum(234300)

    println("Palindrom:? ${output.palindromeTest("Anna annA")}")

}
  