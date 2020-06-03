import groovy.time.TimeCategory

FirstClass firstClass = new FirstClass(i1: 1, str1: "one", d1: 1.0) //инициализация конструктором с указанием параметров по имени


Binding binding = new Binding()
binding.setVariable("i1", 2)
binding.setVariable("str1", "two")
binding.setVariable("d1", 2.0)

println("Содержимое binding: " + binding.variables)

FirstClass firstClass2 = new FirstClass(binding.variables) //задаем значение переменных экземпляра класса с помощью binding

println("\nРезультат getI1(): " + firstClass2.getI1())
println("Результат getStr1(): " + firstClass2.getStr1())
println("Результат getD1(): " + firstClass2.getD1() + "\n")



String str = "string"
println(str instanceof Integer) // проверка отношения между экземпляром класса String и классом Integer при помощи оператора instanseof


firstClass.testFunction() // метод с возвращаемым значением типа Integer, но без оператора return

def int var //unnecessary def modifiers when used with explicit type declaration
def var2

firstClass.intFunction1(null) //Integer
//firstClass.intFunction2(null) //int - java.lang.NullPointerException


BigDecimal bigDecimal1 = new BigDecimal("1.5")
BigDecimal bigDecimal2 = new BigDecimal("1.50")


println("\nbigDecimal1.equals(bigDecimal2): " + bigDecimal1.equals(bigDecimal2))
println("\nbigDecimal1.compareTo(bigDecimal2): " + (bigDecimal1.compareTo(bigDecimal2) == 0))
println("\nbigDecimal1 == bigDecimal2: " + (bigDecimal1 == bigDecimal2) + "\n")


println("1.5 add 1.50: " + bigDecimal1.add(bigDecimal2))
println("1.5 + 1.50: " + (bigDecimal1 + bigDecimal2))

println("1.5 divide 1.50: " + bigDecimal1.divide(bigDecimal2))
println("1.5 / 1.50: " + (bigDecimal1 / bigDecimal2))

println("1.5 multiply 1.50: " + bigDecimal1.multiply(bigDecimal2))
println("1.5 * 1.50: " + (bigDecimal1 * bigDecimal2))


def v = 10 // переменная без указания типа и значением 10
println("\n" + v.getClass().getName()) //java.lang.Integer
v = 'f'
println(v.getClass().getName()) //java.lang.String
v = 'First'
println(v.getClass().getName() + "\n") //java.lang.String


def v2 = 'f'
println(v2.getClass().getName()) //java.lang.String
v2 = 'First'
println(v2.getClass().getName()) //java.lang.String
v2 = 10
println(v2.getClass().getName()) //java.lang.Integer


def v3 = 'First'
println("\n" + v3.getClass().getName()) //java.lang.String
v3 = 'f'
println(v3.getClass().getName()) //java.lang.String
v3 = 10
println(v3.getClass().getName()) //java.lang.Integer


Date date1 = new Date(2015, 02, 28)
Date date2 = new Date(2015, 01, 31)


println("\n28.02.2015 - 31.01.2015: " + (date1 - date2))


use(TimeCategory) {
    date1 += 1.month
    println("28.02.2015 + 1 month: " + date1)

    date1 += 1.day
    println("+ 1 day: " + date1)

    date1 += 1.month
    println("+ 1 month: " + date1)
}


def closureDivide = { a, b ->
    return a / b
}

println("\n1 / 2 = " + closureDivide(1, 2))

def closureMinus = { d, c ->
    return d - c
}

println("\n1 - 2 = " + closureMinus(1, 2))

def closureRes = { a, b, c ->
    return closureMinus(closureDivide(a, b), c)
}

println("\n1 / 2 - 3 = " + closureRes(1, 2, 3))


import groovy.sql.Sql

import java.sql.SQLException

def names = []

try {
    def url = 'jdbc:mysql://localhost:3306/new_schema?useUnicode=true&serverTimezone=UTC'
    def user = 'root'
    def password = 'root'
    def driver = 'com.mysql.cj.jdbc.Driver'
    def sql = Sql.newInstance(url, user, password, driver)


    sql.eachRow("select * from employees")
            {
                row -> names.add(row.name)
            }
    sql.close()
}
catch (ClassNotFoundException | SQLException e) {
    e.printStackTrace
}

println("\nИмена из таблицы employees: " + names)
println("Количество строк в коллекции: " + names.size())
