open class Students(
    val name: String,
    val registrationNumber: Int,
    var grade: Int,
    val beforeGrade: Int,
    val gradesList: DoubleArray = doubleArrayOf(),
    val absenceNumber: Int,
    val password: Int,
) {
    open fun registration(intendedClass: Int) {
        if (intendedClass == beforeGrade  && passTest() == StudentState.REPROVADO) {
            authorizedEnrollmentPrintln()
        }
        else if (intendedClass == beforeGrade+1  && passTest() == StudentState.APROVADO)  {
            authorizedEnrollmentPrintln()
        }
        else {
            unauthorizedEnrollmentPrintln()
        }
    }
    fun averageGradeTest() {
        val gradesAvgTest = gradesList
        var sumAvgTest = 0.0

        for (averagegrades in gradesAvgTest) {
            sumAvgTest += averagegrades
        }
        val averageGrades = sumAvgTest / gradesAvgTest.size
        println("Nota média: ${"%.1f".format(averageGrades)}")
    }

    val loginStudentsG1: String = name
    val passwordStudents1: Int = password
    fun studentLogin(login: String, password: Int) {
        if (loginStudentsG1 == login && passwordStudents1 == password) {
            println("login efetuado com sucesso!")
        } else {
            println("login ou senha incorretas!")
        }
    }
    fun studentInfo() {
        println("Informações do Aluno:")
        println("Nome: $name")
        println("Número de registro: $registrationNumber")
        println("Turma passada: $beforeGrade")
        println("Turma atual: $grade")
        println("Notas do aluno: ${gradesList.contentToString()}")
        println("Número de faltas: $absenceNumber")
        averageGradeTest()
        passTest()
    }
    fun passTest(): StudentState {
        val gradesAvgTest = gradesList
        var sum = 0.0

        for (averagegrades in gradesAvgTest) {
            sum += averagegrades
        }

        val averageGrades = sum / gradesAvgTest.size

        return if (absenceNumber < 31 && averageGrades > 6.0) {
            println("Aluno $name aprovado.")
            StudentState.APROVADO
        } else {
            println("Aluno $name reprovado")
            StudentState.REPROVADO
        }
    }
    private fun unauthorizedEnrollmentPrintln() {
        println("Matricula não autorizada para $name")
    }
    private fun authorizedEnrollmentPrintln() {
        println("Matricula autorizada para $name")
    }
    enum class StudentState {
        APROVADO,
        REPROVADO
    }
}