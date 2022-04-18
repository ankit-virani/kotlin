fun main(args: Array<String>) {
        
    	val trains = mapOf(
            '0' to mutableListOf("Bandra Tarminus Palitana Superfast Express ", "Surat", "Palitana", "21:30"),
            '1' to mutableListOf("Andhra Pradesh Express", "New Delhi", "Andhra Pradesh", "02:10"),
    		'2' to mutableListOf("Surat To Cochin", "Surat", "Cochin", "15:00"),
        '3' to mutableListOf("MUMBAI CENTRAL - JAIPUR SF Express", "Surat", "Jaipur", "10:00"),
        )
                
       	val getIndex: Int = when(args[0]) {
            "name" -> 0
            "source" -> 1
            "destination" -> 2
            "time" -> 3
            else -> -1
        }		
        
        var result: Boolean = false
    	for ((key, value) in trains) {
            result = getTrains(args[1], getIndex, value)
            if(result) {
             	println("Train Details : $value")
            }
        }    
   }

fun getTrains(value: String, index: Int, train: MutableList<String>): Boolean {
    for (arrIndex in train.indices) {
        if(arrIndex === index && train[arrIndex].uppercase() == value.uppercase()) {
        	return true
        }
    }
    return false
}
