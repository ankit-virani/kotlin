fun main(args: Array<String>) {
    
    	val argIndex = listOf<String>("name", "departure", "destination", "time").indexOf(args[0].lowercase());
    	
        
    	val trains = arrayListOf(
        arrayListOf<String>("Bandra Tarminus Palitana Superfast Express", "Surat", "Palitana", "21:30"),
        arrayListOf<String>("Andhra Pradesh Express", "New Delhi", "Andhra Pradesh", "02:10"),
        arrayListOf<String>("Surat To Cochin", "Surat", "Cochin", "15:00"),
        arrayListOf<String>("Mumbai Central Jaipur SF Express", "Surat", "Jaipur", "10:00")    
    )
    val result = trains.filter{
        it[argIndex] == args[1]   
    }
    println(result)
}
