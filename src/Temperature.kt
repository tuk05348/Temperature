enum class TempType {
    F,C,K
}

class Temperature (val type: TempType) {
    var temp: Double = 0.0
    fun setTemperature(clientTemp: Int){
        temp = clientTemp.toDouble()
    }
    fun getTemperatureInF(): Double{
        if (type == TempType.C){
            return ((temp * 9/5) + 32)
        }
        else if (type == TempType.K){
            return (((temp - 273.15) * 9)/5) + 32
        }
        return temp
    }
    fun getTemperatureInC(): Double{
        if (type == TempType.F){
            return ((temp - 32) * 5)/9
        }
        else if (type == TempType.K){
            return temp - 273.15
        }
        return temp
    }
    fun getTemperatureInK(): Double{
        if (type == TempType.C){
            return temp + 273.15
        }
        else if (type == TempType.F){
            return (((temp - 32) * 5)/9) + 273.15
        }
        return temp
    }
}