import java.util.InputMismatchException

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(): Unit { //equivalente a void en java

    /*
    val a: Int // equivalente a final en Java
    var b: String // variables "normales"
    var c: Int
    val respuestas2 = """
        dsflsdfkdsf sdflhasfñsa
        sfhasdflskfsdk
        dfsdfdf d
        fdfsdfsdfsfsdf
         fsdfsdfsf
    """.trimIndent()
    c = 8

    println(respuestas2)
    println(c)
    print("Escribe algo: ")
    var respuesta = readln()
    println(respuesta)
    println("la longitud de tu respuesta es : ${respuesta.length}")
     */
    ejercicio01()
    ejercicio02()
    ejercicio03()
    ejercicio04()
    ejercicio05()
    ejercicio06()
    ejercicio07()
    ejercicio08()
    ejercicio09()
    ejercicio10()
    ejercicio11()

}


fun ejercicio01() {
    var valido: Boolean = false
    var num1: Int = 0
    var num2: Int = 0
    println("EJERCICIO 01")
    do {
        try {
            print("Introduce el primer numero: ")
            num1 = readln().toInt()
            print("Introduce el segundo numero: ")
            num2 = readln().toInt()
            valido = true
        } catch (e: NumberFormatException) {
            println("ERROR: introduce bien los datos" + e.message)
        }
    } while (!valido)


    if (valido) {
        println("SUMA: " + (num1 + num2))
        println("RESTA: " + (num1 - num2))
        println("MULTIPLICACION: " + num1 * num2)
        println("DIVISION: " + num1 / num2)
    }

}


fun ejercicio02() {
    println("EJERCICIO 02")
    var nombre: String = "Marcos"
    println("Bienvenido: " + nombre)
}


fun ejercicio03() {
    var valido: Boolean = false
    var nombre: String = ""
    println("EJERCICIO 03")
    do {
        try {
            print("Introduce tu nombre: ")
            nombre = readln()
            valido = true
        } catch (e: InputMismatchException) {
            println("ERROR: introduce bien los datos" + e.message)
        }
    } while (!valido)

    if (valido) {
        println("Bienvenido: " + nombre)
    }

}


fun ejercicio04() {
    var valido: Boolean = false
    var num1: Int = 0
    var num2: Int = 0
    println("EJERCICIO 04")
    do {
        try {
            print("Introduce el primer numero: ")
            num1 = readln().toInt()
            print("Introduce el segundo numero: ")
            num2 = readln().toInt()
            valido = true
        } catch (e: NumberFormatException) {
            println("ERROR: introduce bien los datos" + e.message)
        }
    } while (!valido)


    if (valido) {
        if (num1 == num2) {
            println("SON IGUALES")
        } else if (num1 < num2) {
            println("$num2 es mayor que $num1")
        } else {
            print("$num1 es mayor que $num2")
        }
    }

}

fun ejercicio05() {
    var valido: Boolean = false
    var num: Int = 0
    println("EJERCICIO 04")
    do {
        try {
            print("Introduce un numero: ")
            num = readln().toInt()
            valido = true
        } catch (e: NumberFormatException) {
            println("ERROR: introduce bien los datos" + e.message)
        }
    } while (!valido)


    if (valido) {
        if (num % 2 == 0) {
            println("$num es divisible entre 2")
        } else {
            println("$num NO es divisible entre 2")
        }
    }

}


fun ejercicio06() {
    var valido: Boolean = false
    var opcion: String = ""
    println("EJERCICIO 04")

    do {
        try {
            println(
                """
            ¿Qué fabricó primero la marca lamborghini?
            a. Motos de 1000CC
            b. El primer coche más rapido
            c. Tractores Agricolas
            d. Furgonetas express para los repartidores
        """.trimIndent()
            )
            opcion = readln().trim()

            when (opcion) {
                "c" -> {
                    println("HAS ACERTADO")
                    valido = true
                }

                "a", "b", "d" -> {
                    println("Te has equivocado")
                }

                else -> {
                    println("Esa opción no está disponible")
                }
            }


        } catch (e: NullPointerException) {
            println("ERROR: introduce bien los datos" + e.message)
        }
    } while (!valido)


}


fun ejercicio07() {
    println("Ejercicio 07, numeros del 1 al 100 (ambos incluidos)")
    for (i in 1..100) {
        println(i)
    }
}


fun ejercicio08() {
    println("Ejercicio 08, numeros del 1 al 100 (ambos incluidos)(bucle while)")
    var contador: Int = 0;
    while (contador != 101) {
        println(contador++)
    }
}

fun ejercicio09() {
    println("Ejercicio 09, numeros divisibles entre 2 y 3 (del 1 al 100)")
    val digitos = arrayListOf<Int>()
    for (i in 1..100) {
        if (i % 2 == 0 && i % 3 == 0) {
            println(i)
        }
    }
}


fun ejercicio10() {
    var valido: Boolean = false
    var num: Int = 0
    println("EJERCICIO 10")
    do {
        try {
            print("Introduce un numero numero(mayor o igual a cero): ")
            num = readln().toInt()
            if (num >= 0) {
                println("CORRRECTO: $num ES POSITIVO")
                valido = true
            } else {
                println("el numero $num no es mayor o igual a cero")
            }
        } catch (e: NumberFormatException) {
            println("ERROR: introduce bien los datos" + e.message)
        }
    } while (!valido)

}


fun ejercicio11() {
    val passwd: String = "kotlinmola"
    var intentos: Int = 3
    do {
        println("Introduce la contraseña(tienes $intentos intentos): ")
        var intento_passwd: String = readln()
        if (intento_passwd == passwd) {
            println("HAS ACERTADO")
            break
        } else {
            intentos--
            if (intentos > 0) {
                println("incorrecta, te quedan $intentos intentos")
            }else{
                println("has perdido todos los intentos")
            }
        }
    } while (intentos != 0)
}