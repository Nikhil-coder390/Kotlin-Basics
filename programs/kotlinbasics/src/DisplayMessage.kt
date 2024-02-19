fun main() {
    var operatingSystem = "Chrome OS"
    var emailId = "sample@gmail.com"
    println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(str1 : String, str2 : String) : String {
    var msg = "There's a new sign-in request on $str1 for your Google Account $str2"
    return msg
}