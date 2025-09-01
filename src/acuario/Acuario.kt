package acuario

open class Acuario(open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {

    open val forma = "rectangulo"

    init {
        println("Inicializando acuario")
    }

    open var agua: Double = 0.0
        get() = volumen * 0.9

    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
        println("Volumen: $volumen l Agua: $agua l (${agua/volumen*100.0}% lleno)")
    }

    constructor(numeroDePeces: Int) : this() {
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }
}
