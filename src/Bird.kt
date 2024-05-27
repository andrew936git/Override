open class Bird(
    val type: String,
    val name: String,

) {
    open var canFly: Boolean = true
    open val information: String
        get() = "Птица: $name, $type, ${flight()}"

    fun flight(): String{
        return if(canFly){
            "Птица умеет летать!"
        } else{
            "Птица не летает!"
        }
    }
    open fun voice():String{
        return "какие-то звуки"
    }
}