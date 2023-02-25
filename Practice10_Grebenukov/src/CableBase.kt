abstract class CableBase(val type: String, val conductorCount: Int, val diameter: Double) {

    constructor(type: String, conductorCount: Int) : this(type, conductorCount, 0.0)

    open fun CalculateQuality(): Double {
        return diameter / conductorCount
    }

    abstract fun GetInfo(): String
}
