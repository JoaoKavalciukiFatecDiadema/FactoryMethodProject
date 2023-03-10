class PessoaFactory {
    fun makePerson(personType: TipoPessoa, nome: String){
        return when(personType) {
            TipoPessoa.ALUNO -> Aluno(nome).relacao()
            TipoPessoa.DIRETOR -> Diretor(nome).relacao()
            TipoPessoa.COORDENADOR -> Coordenador(nome).relacao()
            TipoPessoa.PROFESSOR -> Professor(nome).relacao()
            TipoPessoa.VESTIBULANDO -> Vestibulando(nome).relacao()
            TipoPessoa.ADMINISTRATIVO -> Administrativo(nome).relacao()
            TipoPessoa.VISITANTE -> Visitante(nome).relacao()
        }
    }
}