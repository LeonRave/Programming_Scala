trait Ord {  // Equivalente de Interfaz
	def < (that: Any): Boolean
	def <=(that: Any): Boolean = (this < that) || (this == that)
	def > (that: Any): Boolean = !(this <= that)
	def >=(that: Any): Boolean = !(this < that)
}

class Date(y: Int, m: Int, d: Int) extends Ord {
	def year = y
	def month = m
	def day = d

	override def toString(): String = year + "-" + month + "-" + day

	override def equals(that: Any): Boolean = that.isInstanceOf[Date] && {
										val o = that.asInstanceOf[Date] 
										o.day == day && o.month == month && o.year == year
	}

	def <(that: Any): Boolean = {
		if(!that.isInstanceOf[Date])
			throw new java.lang.Error("cannot compare " + that + " and a Date")
		val o = that.asInstanceOf[Date]
		(year < o.year) || (year == o.year && (month < o.month || (month == o.month && day < o.day)))
	}

}

object Ejercicio7{

	def main(args: Array[String]) {
		val date1 = new Date(1991, 4, 16)
		val date2 = new Date(1991, 4, 16)

		printf((date1 == date2).toString)
	}

}