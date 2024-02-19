fun main(){
    var num =10
    println("The sum is : ${sum(10)}")
}
fun sum(num : Int): Int {
    var i  = 0
    var sum=0
    while(i<num){
        println(i)
        sum = sum + i
        i++
    }
    return sum
}