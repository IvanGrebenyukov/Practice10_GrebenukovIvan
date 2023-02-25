// Интерфейс для базового класса "кабель"
interface CableInterface {
    val type: String
    val numWires: Int
    val diameter: Double
    // Метод для вычисления коэффициента Q
    fun CalculateQuality(): Double
    {
        return diameter / numWires
    }
    fun GetInfo(): String
}