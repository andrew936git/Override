class Penguin(type: String, name: String): Bird(type, name) {
    override var canFly: Boolean = false
    override val information: String
        get() = super.information

    override fun voice(): String {
        return "кричит по-пингвиньи"
    }
}