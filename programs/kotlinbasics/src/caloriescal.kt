fun main(){
    var Steps = 4000
    var caloriesburnt = cal(Steps)
    println(caloriesburnt)
}
fun cal(s1 : Int) : Double{
    var calo = 0.04
    var burnt = calo*s1
    return burnt
}
