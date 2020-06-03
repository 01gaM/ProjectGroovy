class FirstClass {
    //создать несколько переменных уровня экземпляра классасоздать несколько переменных уровня экземпляра класса
    private int i1
    private String str1
    private double d1
    def int var //unnecessary def modifiers when used with explicit type declaration
    def var2

/*
    public FirstClass(int il, String str1, double  d1){
        this.i1 = il;
        this.str1 = str1;
        this.d1 = d1;
    }

*/
    //метод с возвращаемым значением типа Integer, но без оператора return
    Integer testFunction(){
        println("\nБыла запушена функция testFunction()")
    }

    Integer intFunction1(Integer num){
        return num
    }

    int intFunction2(Integer num){
        return num
    }

    int getI1() {
        return i1
    }

    void setI1(int i1) {
        this.i1 = i1
    }

    String getStr1() {
        return str1
    }

    void setStr1(String str1) {
        this.str1 = str1
    }

    double getD1() {
        return d1
    }

    void setD1(double d1) {
        this.d1 = d1
    }

}


//    println "Welcome, Groovy!"