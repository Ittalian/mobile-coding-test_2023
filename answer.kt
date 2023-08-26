fun main(args: Array<String>) {
    //println("Hello World!")
    val input = readLine()!!.toInt()
    //println(input)
    for (i in 1..input){//一行ごとの処理
        //println("Hello")
        for (blank in 0 until input - i){//空白の数
            print(" ")
        }

        for (j in 0 until i){//行の前半
            print(1 + j)
        }

        for (k in 1 until i){//行の後半
            print(i - k)
        }
        println("")
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}