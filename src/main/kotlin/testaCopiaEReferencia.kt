fun testaCopiaEReferencia(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    val contaJoao = Conta("João",1000)
    contaJoao.titular = "João"

    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println("numero x $numeroX")
    println("numero y $numeroY")
}