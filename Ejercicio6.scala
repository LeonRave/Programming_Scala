abstract class Arbol
case class Sum(l: Arbol, r: Arbol) extends Arbol
case class Var(n: String) extends Arbol
case class Const(v: Int) extends Arbol

object Ejercicio6{

	type Entorno = String => Int

	def main(args: Array[String]) {
		val exp: Arbol = Sum(Sum(Var("x"),Var("x")),Sum(Const(7),Var("y")))
		val ent: Entorno = { case "x" => 5 case "y" => 7 }
		println("Expresión: " + exp)
		println("Entorno x: " + ent("x"))
		println("Entorno y: " + ent("y"))
		println("Const 7: " + 7)
		println("Evaluación con x=5, y=7: " + eval(exp, ent))
		println("Derivada respecto a x:\n " + deriva(exp, "x"))
		println("Derivada respecto a y:\n " + deriva(exp, "y"))
	}

	def eval(a: Arbol, ent: Entorno): Int = a match {
		case Sum(l, r) => eval(l, ent) + eval(r, ent)
		case Var(n)    => ent(n)
		case Const(v)  => v
	}

	def deriva(t: Arbol, v: String): Arbol = t match{
		case Sum(l, r) => Sum(deriva(l, v), deriva(r, v))
		case Var(n) if (v == n) => Const(1)
		case _ => Const(0)
	}
}