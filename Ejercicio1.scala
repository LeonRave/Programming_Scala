object Ejercicio1 {
	def main(args: Array[String]): Unit = {
        	println("Hola mundo")
        	var tam = args.length
        	println(tam)
        	var i = 0
        	for(i <- 0 to tam-1) {
        		println(args(i))
        	}	
	}
}