fun main() {
    school("codeHive")
    division(23,10)
    var sentence = statement("Gumato", 20)
    println(sentence)
    fruit("pineapple")
}
fun school(b:String){
    var x = (b[4].toString()+b[5]+b[6]+b[7])
    println(x)
}
fun division(j:Int,s:Int){
    var modulus = j%s
    println(modulus)

}
fun statement(p:String,z:Int):String{
    var d ="My name is $p and I am $z years old"
    return d
}
fun fruit(q:String){
    println(q. length)
}












