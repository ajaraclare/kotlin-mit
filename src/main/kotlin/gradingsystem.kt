fun main(){
    marks()
}

fun marks (){
    var grade = 123

    if(grade>=90 && grade<=100){
        println("grade A")
    }
    else if(grade>=70 && grade<=89){
        println("grade B")
    }
    else if(grade>=50 && grade<=69){
        println("grade C")
    }
    else if(grade>=30 && grade<=49){
        println("grade D")
    }
    else if(grade>=0 && grade<=29){
        println("grade E")
    }
    else{
        println("Invalid")
    }

}




