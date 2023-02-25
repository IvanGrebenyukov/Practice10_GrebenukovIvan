fun main()
{
        val shieldedCable1 = ShieldedCable("Сетевой", 10, 6.4, true)
        println(shieldedCable1.GetInfo())

        val shieldedCable2 = ShieldedCable("Монтажный",10, 4.5, false)
        println(shieldedCable2.GetInfo())

        val simpleCable = SimpleCable("Силовой", 2, 3.2, true)
        println(simpleCable.GetInfo())
}

