//Permite manejar disversos tipos de datos, sin tener que estarlos convirtiendo

class Reference[a] {
	private var contenido: a = _ 
	
	def set(value: a) { contenido = value }
	def get: a = contenido
}


object Ejercicio8{

	def main(args: Array[String]) {

		val celda1 = new Reference[Int]
		val celda2 = new Reference[String]
		val celda3 = new Reference[String]
		celda1.set(44)
		celda2.set("44")
		celda3.set("hola")
		println("La referencia contiene la mitad de " + (celda1.get*2))
		println("La referencia contiene 2 veces 44 " + (celda2.get*2))
		println("La referencia contiene el valor " + (celda3 get))

	}



}