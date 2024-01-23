fun main() {
    val temp1 = Temperature(TempType.F)
    temp1.setTemperature(32)
    println("Temperature in Fahrenheit is ${temp1.getTemperatureInF()}")
    println("Temperature in Celsius is ${temp1.getTemperatureInC()}")
    println("Temperature in Kelvin is ${temp1.getTemperatureInK()}")
    println()
    val temp2 = Temperature(TempType.C)
    temp2.setTemperature(0)
    println("Temperature in Celsius is ${temp2.getTemperatureInC()}")
    println("Temperature in Fahrenheit is ${temp2.getTemperatureInF()}")
    println("Temperature in Kelvin is ${temp2.getTemperatureInK()}")
    println()
    val temp3 = Temperature(TempType.K)
    temp3.setTemperature(273)
    println("Temperature in Kelvin is ${temp3.getTemperatureInK()}")
    println("Temperature in Fahrenheit is ${temp3.getTemperatureInF()}")
    println("Temperature in Celsius is ${temp3.getTemperatureInC()}")
}