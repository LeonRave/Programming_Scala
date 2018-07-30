object Ejercicio4 {
	def oncePerSecond(callback: () => Unit) {
		while(true) { 
			callback(); Thread sleep 1000
		}
	}

	def timeFlies() {
		println("time flies like an arrow...")
	}

	def main(args: Array[String]) {
		oncePerSecond(() => timeFlies)
	}
}

/*
	def main(args: Array[String]) {
		unaVezPorSegundo(() => println("el tiempo pasa volando."))
	}
*/
