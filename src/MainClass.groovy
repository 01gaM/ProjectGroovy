FirstClass firstClass = new FirstClass(i1: 1, str1: "one", d1: 1.0) //инициализация конструктором с указанием параметров по имени


Binding binding = new Binding()
binding.setVariable("i1",2)
binding.setVariable("str1","two")
binding.setVariable("d1",2.0)

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