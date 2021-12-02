fun main() {
    fun part1(input: List<String>): Int {
        var position = 0
        var depth = 0
        for ((command, amount) in input.map { it.split(" ") }) {
            when (command) {
                "forward" -> position += amount.toInt()
                "down" -> depth += amount.toInt()
                "up" -> depth -= amount.toInt()
            }
        }
        return position * depth
    }

    fun part2(input: List<String>): Int {
        var position = 0
        var depth = 0
        var aim = 0
        for ((command, amount) in input.map { it.split(" ") }) {
            when (command) {
                "down" -> aim += amount.toInt()
                "up" -> aim -= amount.toInt()
                "forward" -> {
                    position += amount.toInt()
                    depth += aim * amount.toInt()
                }
            }
        }
        return position * depth
    }

    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}