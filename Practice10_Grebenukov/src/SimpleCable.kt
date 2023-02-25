class SimpleCable(override val type: String, override val numWires: Int, override val diameter: Double,private val isShielded: Boolean) : CableInterface
{
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
                "Количество жил: $numWires, " +
                "Диаметр: $diameter, " +
                "Качество: ${CalculateQuality()}"
    }
}
