//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val penguin = Penguin("пингвинообразные", "пингвин")
    println(penguin.voice())
    println(penguin.information)
    val qivi = Qivi("кивиобразные", "киви")
    println(qivi.information)
    println(qivi.voice())
    val sparrow = Sparrow("воробьинные", "воробей")
    println(sparrow.information)
    println(sparrow.voice())
    println("------------------------------------")
//2
    val  array = arrayOf("привет", "как", "дела", "нормально", "а", "у", "тебя")
    var num = array[0].length
    var word = array[0]
    for (i in 0 .. array.size - 1){
       when{
           num <= array[i].length -> {
               num = array[i].length
               word = array[i]
           }
       }
    }
    println("Самое длинное слово: \"$word\", число букв в нем: $num")
    println("----------------------------------------------------------")
//3
    val row = "ПриВет, кАк деЛа"
    var count = 0
    for (i in row){
        if (i.isUpperCase()){
            print("$i ")
            count ++
        }
    }
    println("\nКолличество букв в верхнем регистре $count")
}