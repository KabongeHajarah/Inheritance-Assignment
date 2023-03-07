fun main() {
var car= Car("Subaru","legacy","white",3)
   car.carry(2)
    car.carry(7)

    car.identity()

   println(car.calculateParkingFees(4))

    var bus= Bus("Subaru","legacy","white",3)
  println( bus.maxTripFare(arrayOf(230.0,200.0,500.0,700.0)))
    println(bus.calculateParkingFees(2))



}
 open class Car (var make:String,var model:String,var color:String, var capacity:Int) {
    fun carry(people: Int) {
        var x=people -capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        }
        else { println("Over Capacity by $x people"
                )
        }
    }
    fun identity(){
      println("I am a $color $make $model")

    }
 open fun calculateParkingFees(hours:Int):Int{
     var parkingfees= hours * 20
    return parkingfees
}


}
class Bus ( make:String, model:String, color:String,  capacity:Int) : Car(make,model,color,capacity){
 fun maxTripFare(fare:Array<Double >): Double {

     var maximumFare= fare.max()
     return maximumFare

 }

    override fun calculateParkingFees(hours: Int): Int {
        var parkingfees= hours * capacity
        return parkingfees
    }
}