package paqueteInicial


fun main(args: Array<String>) {
    var x = 1
    when (x) {
        is Int -> print(x + 1)
       // is String -> print(x.length + 1)
        //is IntArray -> print(x.sum())
    }
    var b : String = "b"
    var y : String = "y"

    val a: String = b as String //==> Si es nulo, se rompe todo.
    val z: String? = y as String? //==> si es nulo, no pasa nada.








}



