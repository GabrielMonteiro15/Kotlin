fun main(){
    var option = 3
    //When = quando
    when(option){
        1 -> println("vermelho")
        2 -> println("Azul")
        3 -> println("Verde")
        else -> println("Nenhuma opção foi achada")
    }

    var result = when(option){
        1 -> "vermelho"
        2 -> "Azul"
        3 -> "Verde"
        else -> "Nenhuma opção foi achada"
    }
    println(result)
}