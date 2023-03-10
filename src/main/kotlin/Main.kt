import java.util.Scanner

fun main() {
    val factory = PessoaFactory()

    do {
        print("Entre com o seu nome: ")
        val nome = readln()
        print("Entre a sua relação com a fatec: ")
        val relacao = readln()
        when(relacao){
            "Aluno" -> factory.makePerson(TipoPessoa.ALUNO, nome)
            "Professor" -> factory.makePerson(TipoPessoa.PROFESSOR, nome)
            "Coordenador" -> factory.makePerson(TipoPessoa.COORDENADOR, nome)
            "Diretor" -> factory.makePerson(TipoPessoa.DIRETOR, nome)
            "Administrativo" -> factory.makePerson(TipoPessoa.ADMINISTRATIVO, nome)
            "Vestibulando" -> factory.makePerson(TipoPessoa.VESTIBULANDO, nome)
            else -> factory.makePerson(TipoPessoa.VISITANTE, nome)
        }
        print("Para sair pressione Q, para entrar com outras informações pressiona qualquer outra tecla: ")

        val resp = readln()
        val char = resp.get(0).uppercaseChar()
    } while ( char != 'Q')
}