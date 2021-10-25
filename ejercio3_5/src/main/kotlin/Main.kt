class Coche (var marca:String=""){
    var modelo: String=""
    var velocidadMax: Int=0
    var color: String=""
    init
    {
        require(marca.trim().length>0){"Argumento inválido"}
        if (color==""){color="Blanco"}
    }

    override fun toString(): String {
        return "$marca\n$modelo\n$velocidadMax\n$color"
    }
    /*fun encender()=
    fun apagar()=
    fun iniciar()=
    fun parar()=
    fun acelerar()=
    fun frenar()=
    fun incrementaMarcha()=
    fun decrementaMarcha()=
    fun llenarTanque()=*/

        constructor(modelo: String, velocidadMax: Int, color: String) : this(){
            this.modelo= modelo
            this.velocidadMax= velocidadMax
            this.color= color
                }
    /*init
    {
        require(velocidadMax=(<10&&>250)){"Argumento inválido"}
        //if (color=null) {color="blanco"}
    }*/
}
fun main() {
    var first=Coche("Ford")
    println(first)

}