class Complex(real: Double, imaginary: Double) {
	def re() = real
	def im() = imaginary
	override def toString() = "" + re + (if(im < 0) "" else "+") + im + "i"
}

object Ejercicio5 {
	def main(args: Array[String]) {
		val c = new Complex(1.2, 3.4)
		println("parte imaginaria: " + c.im())
		println(c)
	}
}
