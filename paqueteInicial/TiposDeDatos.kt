package paqueteInicial


fun main(args: Array<String>) {
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Your Int Value is "+a);
    println("Your Double  Value is "+d);
    println("Your Float Value is "+f);
    println("Your Long Value is "+l);
    println("Your Short Value is "+s);
    println("Your Byte Value is "+b);


    val letter: Char    // defining a variable
    letter = 'A'        // Assigning a value to it
    println("$letter")



    var rawString :String  = "I am Raw String!"
    val escapedString : String  = "I am escaped String!\n"

    println("Hello! $escapedString")
    println("Hey!! $rawString")



    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)  // mutable List
    val readOnlyView: List<Int> = numbers                   // immutable list
    println("my immutable list--"+numbers)    // prints "[1, 2, 3]"
    numbers.add(4)

    println("my immutable list after addition --"+numbers)// prints "[1, 2, 3, 4]"
    println(readOnlyView)
    //readOnlyView.clear() // No se puede, es inmutable.


    val items = listOf(1, 2, 3, 4)
    println("First Element of our list----"+items.first())
    println("Last Element of our list----"+items.last())
    println("Even Numbers of our List----"+items.
            filter { it % 2 == 0 })   // returns [2, 4]

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  // prints "1"

    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Values are"+strings)


    for (j in 1..4)
        print(j) // prints "1234"
}