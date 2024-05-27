class Sparrow(type: String, name: String): Bird(type, name) {
    override var canFly: Boolean = true
    override val information: String
        get() = super.information

    override fun voice(): String {
        return "чик-чирик"
    }
}