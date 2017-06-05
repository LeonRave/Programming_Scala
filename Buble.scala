object Buble {
	def ordenaIt(arreglo: Array[Int]): Array[Int] = {

	    val tam = arreglo.size
	    var i = 0

	    for (j <- 0 to tam-2-i;i <- 0 to tam-2) {

	        	if (arreglo(i) > arreglo(i+1)) {

		          	val aux = arreglo(i)
		          	arreglo(i) = arreglo(i+1)
		          	arreglo(i+1) = aux

				}
	      	
	    }
	    arreglo
	}

	 def ordenaFun(lista: List[Int]): List[Int] = {
	    if (lista != Nil && lista.tail != Nil) {
			if (lista.head > lista.tail.head) {
	        	ordenaFun(List(lista.tail.head, lista.head) ::: lista.tail.tail)
	      	} 
	      	else {
	        	val sublista = ordenaFun(lista.tail)
	        	println("sub "+sublista.mkString(" "))
				println("lista "+lista.mkString(" "))
	        	if (lista.head > sublista.head) ordenaFun(List(sublista.head, lista.head) ::: sublista.tail) 
	        	else List(lista.head) ::: sublista
	      	}
	    } 
	    else {
	      	lista

	    }
	}

	def main(args: Array[String]) {

		val array:Array[Int] = Array(5, 3, 1, 4, 2)
		//println(array.mkString(" "))
		//val array1 = ordenaIt(array)
		//println(array.mkString(" "))
		var lista:List[Int] = array.toList
		println(lista.mkString(" "))
		lista = ordenaFun(lista)
		println(lista.mkString(" "))

	}

   
}