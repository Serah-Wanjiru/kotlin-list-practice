fun main() {
    var c=name(listOf("mentorship","linet","serah","caro","cat","dog","friendship"))
    println(c)
    var f=findeven(listOf(11,12,13,14,15,16,17,18))
    println(f)
    var g=secondlarge(listOf(12,23,45,89,56,78))
    println(g)
    var j=removeduplicates(listOf(1,2,3,1,2,3,4,5,4))
    println(j)
    var l=remove(listOf("mango","oranges","mango","guava","apple","banana","oranges"))
    println(l)
    var o=removevowel(listOf(23,45,12,11,78,56,90))
    println(o)
    var s=add(listOf(10,20,30,40,50))
    println(s)
    var u=square(listOf(1,2,3,4,5,6,7,8))
    println(u)
    var A=sorting(listOf("mary","zubeda","caro","ann","jane","brenda"))
    println(A)
    var co=multiply(listOf(12,2))
    println(co)

}
//Write a function that takes a list of strings as
//input and returns a new list that contains only the strings that have a
//length of at least five characters.
fun name(names:List<String>):List<String> {
    var a = mutableListOf<String>()
    for (b in names) {
        if (b.length >= 5){
            a.add(b)
        }
    }
    return a
}
//Write a function that takes a list of integers as input and
//returns a new list that contains only the even numbers
//from the input list.
fun findeven(number:List<Int>):List<Int>{
    var d= mutableListOf<Int>()
    for (e in number){
        if (e%2==0){
            d.add(e)
        }
    }
    return d
}
//Write a function that takes a list of integers as input and returns the
//second-largest element in the list.
fun secondlarge(numbers:List<Int>):Int{
    numbers.sorted()
    return numbers[5]
}
//Write a function that takes a list of integers as input and returns
// a new list that contains the same elements as
//the input list, but with all duplicates removed.
fun removeduplicates(num:List<Int>):List<Int>{
    var h= mutableListOf<Int>()
    for (i in num){
        if (!h.contains(i)){
            h.add(i)
        }
    }
    return h
}
//Write a function that takes a list of strings as input and returns
// a new list that contains the same elements as
//the input list, but with all duplicates removed.
fun remove(naames:List<String>):List<String>{
    var j= mutableListOf<String>()
    for (k in naames){
        if (!j.contains(k))
            j.add(k)
    }
    return j
}


//Write a function that takes a list of integers as
//input and returns a new list that contains the
//same elements as the input list,
//but sorted in descending order.
fun removevowel(str:List<Int>):List<Int>{
    var n= mutableListOf<Int>()
    for (m in str){
        n.add(m)
    }
    return n.sortedDescending()

}
//Write a function that takes a list of integers as input and returns the sum
//of all the elements in the list.
fun add(numb:List<Int>):Int{
    var sum=0
    for (p in numb){
        sum+=p
    }
    return sum
}
//Write a function that takes a list of integers
//as input and returns a new list that contains
//the same elements as the input list,
//but with each element squared.
fun square(nuumb:List<Int>):List<Int>{
    var t= mutableListOf<Int>()
    for (r in nuumb){
        t.add(r *r)
    }
    return t
}
//Write a function that takes a list of strings as
//input and returns a new list that contains the same
//strings, but sorted in alphabetical order.r
fun sorting(strr:List<String>):List<String>{
    var w= mutableListOf<String>()
    for (z in strr){
        w.add(z)
    }
    return w.sorted()
}
//Write a function that takes a list of integers as input
//and returns the product of all the elements
//in the list.
fun multiply(numbersss:List<Int>):Int{
    var product=1
    for (bn in numbersss){
        product*=bn
    }
    return product

}




