class ShieldedCable(type: String, conductorCount: Int, diameter: Double, private val isShielded: Boolean) : CableBase(type, conductorCount, diameter) {

    constructor(type: String, conductorCount: Int, isShielded: Boolean) : this(type, conductorCount, 0.0, isShielded)

    override fun CalculateQuality(): Double {
        if (isShielded){
            return 2 * super.CalculateQuality()
        }
        else {
            return 0.7 * super.CalculateQuality()
        }
    }

    override fun GetInfo(): String {
        return "Тип кабеля: $type, " +
                "Количество жил: $conductorCount, " +
                "Диаметр: $diameter, " +
                "Качество: ${CalculateQuality()}"
    }
}
