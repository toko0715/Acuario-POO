package acuario

fun construirAcuario() {
    val miAcuario1 = Acuario()
    miAcuario1.imprimirTamano()
    println("-------------------------")

    val miAcuario2 = Acuario(largo = 115) // para q no use el constructor secundario
    miAcuario2.imprimirTamano()
    println("-------------------------")

    val miAcuario3 = Acuario(120, 32)
    miAcuario3.imprimirTamano()
    println("-------------------------")

    val miAcuario4 = Acuario(100, 32, 50)
    miAcuario4.imprimirTamano()
    println("-------------------------")

    val miAcuerio5 = Acuario(29)
    miAcuerio5.imprimirTamano()
    println("Volumen: ${miAcuerio5.ancho * miAcuerio5.largo * miAcuerio5.alto / 1000} l")
    println("-------------------------")

    val miAcuario6 = Acuario(numeroDePeces = 29)
    miAcuario6.imprimirTamano()
    miAcuario6.volumen = 70
    miAcuario6.imprimirTamano()
    println("-------------------------")

    val miAcuario7 = Acuario(largo = 25, ancho = 25, alto = 40)
    miAcuario7.imprimirTamano()

    println("-------------------------")
    val miAcuario8 = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario8.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()

}

fun main() {
    construirAcuario()
}