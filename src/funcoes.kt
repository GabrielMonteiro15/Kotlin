fun main(){
    var valor1 = 10
    var valor2 = 20

    println(calcValor(valor1, valor2))

    fun ola(){
        println("Olá")
    }
    ola()
    fun impimaresult(idade : Int, altura : Double):String{

        return  "Qual a sua idade $idade e qual a sua altura $altura"
    }
    println(impimaresult(18, 1.70))

}

//Passo como Parametro x e y que são Inteiro e essa funcao
//Vai me retorna um outro valor inteiro
fun calcValor(x: Int, y: Int): Int {
    return x + y;
}