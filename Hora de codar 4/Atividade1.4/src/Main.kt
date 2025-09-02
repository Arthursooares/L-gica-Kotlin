data class Estudante(val nome: String, val email: String)

fun isEmailValido(email: String): Boolean {
    val regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()
    return email.matches(regex)
}

fun isSenhaValida(senha: String): Boolean {
    val regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@\$!%*#?&])[A-Za-z\\d@\$!%*#?&]{8,}$".toRegex()
    return senha.matches(regex)
}

fun main() {
    val estudantes = mutableListOf<Estudante>()
    while (true) {
        println("Digite o nome do estudante:")
        val nome = readln()
        var email: String
        do {
            println("Digite o email do estudante:")
            email = readln()
            if (!isEmailValido(email)) println("Email inválido, tente novamente.")
        } while (!isEmailValido(email))
        var senha: String
        do {
            println("Digite a senha do estudante:")
            senha = readln()
            if (!isSenhaValida(senha)) println("Senha fraca, tente novamente.")
        } while (!isSenhaValida(senha))
        estudantes.add(Estudante(nome, email))
        println("Estudante cadastrado com sucesso!")

        var resposta: String
        do {
            println("Deseja cadastrar outro estudante? Digite 'S' para continuar ou 'PARE' para encerrar.")
            resposta = readln()
            if (!resposta.equals("S", ignoreCase = true) && !resposta.equals("PARE", ignoreCase = true)) {
                println("Entrada inválida. Por favor, digite apenas 'S' ou 'PARE'.")
            }

        } while (!resposta.equals("S", ignoreCase = true) && !resposta.equals("PARE", ignoreCase = true))

        if (resposta.equals("PARE", ignoreCase = true)) break
    }
    println("Quantidade de estudantes cadastrados: ${estudantes.size}")
    estudantes.forEach { println("Nome: ${it.nome}, Email: ${it.email}") }
}