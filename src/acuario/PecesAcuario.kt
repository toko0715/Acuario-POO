package acuario

abstract class Pez {
    abstract var color: String

}

class Tiburon(override var color: String = "gris") : Pez(), AccionPez{
    override fun comer() {
        println("cazar y comer peces")
    }
}

class PezPayaso(override var color: String = "dorado"): Pez(), AccionPez{
    override fun comer() {
        println("comer algas")
    }

}

interface AccionPez {
    fun comer()
}
