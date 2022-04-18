fun main(args: Array<String>) {
        
    	val trains = arrayListOf(
        arrayListOf<String>("Bandra Tarminus Palitana Superfast Express", "Surat", "Palitana", "21:30"),
        arrayListOf<String>("Andhra Pradesh Express", "New Delhi", "Andhra Pradesh", "02:10"),
        arrayListOf<String>("Surat To Cochin", "Surat", "Cochin", "15:00"),
        arrayListOf<String>("Mumbai Central Jaipur SF Express", "Surat", "Jaipur", "10:00")    
    )
    val result = trains.filter{
        it[0] == args[0] || it[1] == args[0] || it[2] == args[0] || it[3] == args[0]   
    }
    println(result)
}
