interface IngredientsInterface {

   fun cleanPot()
    
   fun addHotWater()

   fun addHotMilk()

   fun addHotSugar()
   
   fun getMixture()
   
   fun addIngredients()
   
   fun made()
   
   fun readyBeverages()

}



abstract class Ingredients(val type: String): IngredientsInterface {
    
   override fun cleanPot() {
       println("Cleaning ${type} pot...")
       println("Your Beverage is getting ready...")
   }
    
   override fun addHotWater() {
        println("Adding hot water")
    }
    
   override fun addHotMilk() {
        println("Adding hot milk")
    }
    
   override fun addHotSugar() {
        println("Adding hot sugar")
    }
   
   override fun addIngredients(){
       println("${type} Bag added")
   }
   
   override fun readyBeverages(){
      println("${type} Ready! Enjoy")
   }
   
 override fun getMixture() {
       addHotWater()
       addHotMilk()
       addHotSugar()
       
   }
 
 override fun made(){
     cleanPot()
     getMixture()
     addIngredients()
     readyBeverages()
     
 }
 
 
}

class Beverages(type: String):Ingredients(type) {
   
    init {
       made()
    }
   
}

fun main(args: Array<String>) {
    
    val type = when (args[0]) {
        "1"  -> "Tea"
        "2"  -> "Coffe"
        else -> "Something diff"
    }
    
    	Beverages(type)
 
}
