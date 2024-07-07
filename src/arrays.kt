import java.util.Arrays

fun main(){
    /*var listaCompras = arrayOf("Arroz", "Carne", "Feijão")
    var listaIdade = arrayOf("35", "19", "24")*/
                                //index 0, 1 , 2
    var listacoisas = arrayOf(1.70, "gabriel", 18)
                                //Itens : 1 , 2 , 3
    //Usamos para primnt todos os itens do array
    println(Arrays.toString(listacoisas))

    //Usamos para print apenas alguns itens do array
    println(listacoisas[1])

    //Usamos para saber o tamanho do array
    println(listacoisas.size)
}

