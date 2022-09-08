fun main() {
    var userMenuChoice = 0

        // CREATES THE FUNCTION FOR FINDING THE AREA OF A TRIANGLE
    fun triangleArea(){
        print("Enter the triangle's base: ")
        val base = readLine()!!.toInt()

        print("Enter the triangle's height: ")
        val height = readLine()!!.toInt()

        val area = base * height * .5

        println("Area of triangle: $area")
    }

    // CREATES THE FUNCTION FOR FINDING THE AREA OF A SQUARE
    fun squareArea(){
        print("Enter the length of the square's side: ")
        val side = readLine()!!.toInt()


        val area = side * side

        println("Area of square: $area")
    }

    // CREATES THE FUNCTION FOR FINDING THE AREA OF A RECTANGLE
    fun rectangleArea(){
        print("Enter the rectangle's base: ")
        val width = readLine()!!.toInt()

        print("Enter the rectangle's height: ")
        val height = readLine()!!.toInt()

        val area = width * height

        println("Area of rectangle: $area")
    }

    // CREATES THE FUNCTION FOR FINDING THE AREA OF A PARALLELOGRAM
    fun parallelogramArea(){
        print("Enter the parallelogram's base: ")
        val base = readLine()!!.toInt()

        print("Enter the parallelogram's height: ")
        val height = readLine()!!.toInt()

        val area = base * height

        println("Area of parallelogram: $area")
    }

    // WHILE LOOP THAT CONTINUOUSLY RUNS UNTIL THE USER CHOOSES TO EXIT
    while (userMenuChoice != 5){
        println("Choose a shape to find the area of (type the number of the choice)")
        println("1. Triangle")
        println("2. Square")
        println("3. Rectangle")
        println("4. Parallelogram")
        println("5. Exit")

        print("Choice: ")
        userMenuChoice = readLine()!!.toInt()

        // ALLOWS THE USER TO CHOOSE WHICH SHAPE THE FIND THE AREA OF
        when (userMenuChoice){
            1 -> triangleArea()
            2 -> squareArea()
            3 -> rectangleArea()
            4 -> parallelogramArea()
            5 -> break
        }
    }
}