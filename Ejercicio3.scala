import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object Ejercicio3 {

	def main(args: Array[String]) {
		val now = new Date
		val df = getDateInstance(LONG, Locale.ENGLISH)
		println(now)
		println(df)
		println(df.format(now))
		//println(df format now)
	}
}
