class Coordinator(
    name: String,
    cpf: String,
    wage: Double
) : Employees(
    name = name,
    cpf = cpf,
    wage = wage
) {
    override fun bonus(): Double {
        return wage * 0.3
    }
}