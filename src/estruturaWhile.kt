
fun main(){

    var listaCompras = arrayOf("Arroz" , "Fejão", "Carne")

    var index = 0
    //Nesse caso o codigo percorre um array usando While
    //Pode ver que foi usado 'size' do array - 1
    //Isso acontece pq 'size' representa o tamanho de itens do array não o seu index
    while (index <= listaCompras.size - 1){
        println(listaCompras[index])
        index++

    }

}
