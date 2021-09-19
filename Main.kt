fun main(){
    val minimum_age = 19
    print(" Please enter your age:")
    try{
        val user_age = readLine()!!.toInt()
        if (user_age >= minimum_age){
            print("Welcome! you're old and bold")
        }else{
            print("you are not old enough...you're just a kid!")
        }

    }catch (e: Exception){
        print("something isn't correct please enter a number")
    }

}