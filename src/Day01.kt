fun main() {
    fun countIncreases(numbers: List<Int>): Int {
        return numbers.zipWithNext().count { (first, second) -> first < second }
    }

    fun part1(input: List<String>): Int {
        return countIncreases(input.toInts())
    }

    fun part2(input: List<String>): Int {
        return countIncreases(input.toInts().windowed(3) { it.sum() })
    }

    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
