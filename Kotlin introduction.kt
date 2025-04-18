/*
fun main() {
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")
    
}

fun main() {
    println("Tomorrow is rainy")
}

fun main() {
    println("There is a chance of snow")
}


fun main() {
    println("Cloudy") 
    println("Partly Cloudy") 
    println("Windy")
}


fun main() {
    println("How's the weather today?")
}

fun main() {
    val count: Int = 2
    println("You have $count unread messages.")
}

fun main() {
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}

fun main() {
    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
}

fun main() {
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}


fun main() {
    var count = 10
    println("You have $count unread messages.")
    count--
    println("You have $count unread messages.")
}


fun main() {
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}


/**
 * This program displays the number of messages
 * in the user's inbox.
 */
fun main() {
    // Create a variable for the number of unread messages.
    var count = 10
    println("You have $count unread messages.")

    // Decrease the number of messages by 1.
    count--
    println("You have $count unread messages.")
}


fun main() {
    val info = birthdayGreeting2()
    println(info)
}

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreeting2(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
    println("Use the val keyword when the value doesn't change\nUse the var keyword when the value can change.")
    println("You are now 5 years old!")
    println("When you define a function, you define the parameters that can be passed to\n it.")
    println("When you call a function, you pass arguments for the parameters.")
}

fun main() {
    println("New chat message from a friend")
}

fun main() {
    val item = "Google Chromecast"
    val discountPercentage: Int = 20
    val offer: String = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    //discountPercentage = 20
    //offer = ""

    println(offer)
}


fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
    
}


fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun main() {
    val firstNumber = 10
    val secondNumber = 5
	val result = firstNumber+secondNumber
    println("$firstNumber + $secondNumber = $result")
}

fun main() {
    val firstNumber= 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add (valor1: Int, valor2: Int) : Int {
    return valor1+valor2
}

fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(operatingSystem: String, emailId: String){
    println("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")
}
*/
fun main() {
    val firstUserEmailId = "user_one@gmail.com"
	val firstUserOS = "unknow OS"
    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId, operatingSystem = firstUserOS))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String, emailId: String){
  
    println("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")
}



/*
fun main() {
    val Steps = 4000
    val caloriesBurned = pedometerStepstoCalories(Steps);
    //println("Walking $Steps steps burns $caloriesBurned calories")
    val a = comparacion(300,250)
    val b = comparacion(300,300)
    val c = comparacion(200,220)
    println("Los valores son: "+a+b+c)
}

fun pedometerStepstoCalories(numberOfSteps: Int): Double {
    val caloriesBurnedforEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedforEachStep
    return totalCaloriesBurned
}

fun comparacion(a: Int , b : Int): Boolean {
    if(a>b)
    	return true
    if(a<b)
    	return false
    else
    	return false
}

fun main() {
    
	mostrarClima("Ankara", 27, 31, "82%")
    
    mostrarClima("Tokyo", 32, 36, "10%")
   
	mostrarClima("Cape Town", 59, 64, "2%")
    
    mostrarClima("Guatemala City", 50, 55, "7%")
}
fun mostrarClima(city: String, temperatureL: Int, temperatureH: Int, rain: String){
    println("City: $city")
    println("Low temperature: $temperatureL, High temperature: %temperatureH")
    println("Chance of rain: $rain")
    println("")
    println("")
	
}
*/
