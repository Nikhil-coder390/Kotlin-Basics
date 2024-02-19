fun subtract(n1:Int,n2:Int) : Int {
    var sub = n1 - n2
    return sub
}
fun divide (n1:Int,n2:Int) : Int {
    var div= n1 / n2
    return div
}
fun multiply (n1:Int,n2:Int) : Int {
    var multi = n1 * n2
    return multi
}
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val sub = subtract(firstNumber, secondNumber)
    val div = divide(firstNumber, secondNumber)
    val mul = multiply(firstNumber, secondNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber - $secondNumber = $sub")
    println("$firstNumber / $secondNumber = $div")
    println("$firstNumber * $secondNumber = $mul")

}
fun add(n1:Int,n2:Int) : Int {
    var sum= n1 + n2
    return sum
}
