fun main() {
    println("Bem vindo ao Bytebank")

    var i = 1

    while (i <= 5) {
        val titular = "Rubens $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()

        i++
    }

//    loop@ for (i in 1..100) {
//        println("i $i")
//        for (j in 1..100) {
//            println("j $j")
//            if (j == 5) break@loop
//        }
//    }
//    for (i in 5 downTo 1 step 1) {
//
//        if (i == 4) {
//            break
//        }
//
//        val titular = "Rubens $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//
//    }
    //testarCondicoes(saldo)

}

fun testarCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}