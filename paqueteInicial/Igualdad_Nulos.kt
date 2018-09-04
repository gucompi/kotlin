package paqueteInicial


fun main(args: Array<String>) {
    var a: Int? = 1
    var b: Int? = 1

    println (a?.equals(b) ?: (b === null))


    var c: String = ""
    //c= null //Error de Compilacion
    var e = c.length //OK.


    var d : String ?= ""
    d=null //OK
    //var e=d.length //Error. Puede ser nulo!



}
