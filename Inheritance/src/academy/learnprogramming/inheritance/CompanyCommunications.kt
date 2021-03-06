package academy.learnprogramming.inheritance

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightline())

    SomeOtherClass().someOtherMethod()
    SomeClass.accessPrivateVar()

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLower("this isn't the string as is", false)
    println(someClass1.someOtherString)
    println(someClass2.someOtherString)

    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int) = "This is from mustImplement: ${num * 100}"
    })

    println(Department.ACCOUNTING.getDepartmentInfo())
    var x = 34
    x =+ x.addNum(7)
    println(x)

}

// Use this function from another package - Top Level Function
fun topLevel(str: String) = println("Top level function $str")

enum class Department(val fullName: String, val numEmployees: Int) {

    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 7),
    SALES("Sales", 14);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"

}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    internal fun getCopyrightline() = "Copyright ® $currentYear Our Company. All rights reserved."

}

class SomeClass private constructor(val someOtherString: String) {

    companion object {
        val privateVar = 6

        fun accessPrivateVar() {
            println("I'm accessing privateVar: $privateVar")
        }

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLower(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }

    }

}

fun Int.addNum(num: Int):Int = this + num

class SomeOtherClass {

    fun someOtherMethod() {
        SomeClass.accessPrivateVar()
    }

}