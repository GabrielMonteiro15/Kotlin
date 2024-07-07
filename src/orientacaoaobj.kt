fun main(){

    /*
    * Classes
    * inicializções
    * Herança
    * Subclasses
    * Data classes
    * */
     //Objeto
     var pessoa = Pessoa()
     pessoa.Nome = "Gabriel"
     pessoa.ola()
     println(pessoa.pergunta())



     var gato = Gato()
     gato.mia()
     gato.dormir()

     var cachorro = Cachorro()
     cachorro.latir()
     cachorro.dormir()
     println(chamaanimal(cachorro))

     Guardavalor("Gabriel", 18)
     var Idade = Guardavalor("Gabriel", 18).idade
     println(Idade)

}

class Carro( var cor : String, var qdtportas : Int){
     init {
          var mostraResult = "$cor e $qdtportas"
     }
}

fun chamaanimal(animal: Animal) {
     animal.dormir()
}

//Deixa a classe aberta para ser herdada
//A classe que vai ser herdade é chamada de super class
public open class Animal(){
     fun comer(){
          println("Estou Comendo")
     }
     open fun dormir(){
          println("Estou Dormindo")
     }
}
//Subclasses (Classe Filhas)
class Cachorro() : Animal(){
    //Herda a função comer da classe animal
     init {
        super.comer()
    }
     override fun dormir(){
          super.dormir()
          println("Na parta da manha")
     }

     fun latir(){
          println("Estou latindo")
     }
}
class Gato(): Animal(){
     fun mia(){
          println("Estou miando")
     }
     override fun dormir(){
          super.dormir()
          println("Na parta da tarde")
     }
}

class Pessoa {
     var Nome = ""
     var Idade = 0
     fun ola( nome: String = Nome) {
          println("olá $nome")
     }

     fun pergunta(): String {
          return "$Nome qual a sua idade?"
     }
}

data class Guardavalor(val nome:String, val idade: Int)



