class Teacher(
    name: String,
    cpf: String,
    wage: Double,
    password: Int,
) : Employees(
    name = name,
    cpf = cpf,
    wage = wage,
) {
    private val teacherUserLogin: String = name
    private val teacherUserPassword: Int = password

    fun teacherLogin(myLogin: String, myPassword: Int) {
        if (myLogin == teacherUserLogin && myPassword == teacherUserPassword) {
            println("login efetuado com sucesso!")
        } else {
            println("login ou senha incorretas!")
        }

    }
}