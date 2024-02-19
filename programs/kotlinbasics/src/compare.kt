fun main(){
    var timespenttoday = 360
    var timespentyesterday = 220
    println(cal(timespenttoday,timespentyesterday))
}
fun cal(n1 : Int, n2: Int) : Boolean{
    if (n1 > n2){
        return true
    }
    else{
        return false
    }
}