
fun main () {

    val numPad = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(7,8,9)
    )

    val instructions = mutableListOf<CharArray>()
    while(true) {
        val line = readLine()
        if (line != null) {
            instructions.add(line.toCharArray())
        } else {
            break
        }
    }

    var i = 1
    var j = 1

    for(arr in instructions) {
        for (instruction in arr) {
            when (instruction) {
                'R' -> if(j < 2) j++
                'L' -> if(j > 0) j--
                'D' -> if(i < 2) i++
                'U' -> if(i > 0) i--
            }
        }
        print(numPad[i][j])
    }

}
