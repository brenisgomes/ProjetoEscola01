abstract class Employees(
    val name: String,
    val cpf: String,
    val wage: Double
) {
    open fun bonus (): Double{
        return wage * 0.1
    }
}