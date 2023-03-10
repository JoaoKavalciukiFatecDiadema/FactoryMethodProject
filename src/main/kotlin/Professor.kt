class Professor(val nome: String): Pessoa {
    override fun relacao(){
        println("$nome tem relação com a instituição como Professor")
    }
}