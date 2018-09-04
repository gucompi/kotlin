package paqueteInicial

fun main(args: Array<String>) {
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Maximum of a or b is " +max)

    // As expression
     val max2 = if (a > b) a else b
    println(max2)



    val x:Int = 5
    when (x) {
        1,2 -> print(" Value of X either 1,2")

        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }


    val items = listOf(1, 22, 83, 4)

    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }



}