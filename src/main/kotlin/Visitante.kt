class Visitante(val nome: String): Pessoa {
    override fun relacao(){
        println("$nome não tem relação com a instituição, acompanhar até a secretaria")
    }
}