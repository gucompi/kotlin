package paqueteInicial

class myClass {
    // property (data member)
    private var name: String = "Tutorials.point"

    // member function
    fun printMe() {
        println("You are at the best Learning website Named-"+name)
    }
}
class Outer {
    private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
    inner class Nested {
        fun foo() = welcomeMessage
    }
}

fun main(args: Array<String>) {
    val obj = myClass() // create obj object of myClass class
    obj.printMe()



    val demo = Outer().Nested().foo() // calling nested class method
    println(demo)




    val person1 = Person("TutorialsPoint.com", 15)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")



    val HUman = HUman("TutorialsPoint.com", 25)
    print("${HUman.message}"+"${HUman.firstName}"+
            "Welcome to the example of Secondary  constructor, Your Age is-${HUman.age}")
}


class Person(val firstName: String, var age: Int) {
}

class HUman(val firstName: String, var age: Int) {
    val message:String  = "Hey!!!"
    constructor(name : String , age :Int ,message :String):this(name,age) {
    }
}

