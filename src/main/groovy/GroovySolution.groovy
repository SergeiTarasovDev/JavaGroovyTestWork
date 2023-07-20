def numberList = [1, 3, 4, 5, 1, 5, 4]
def result = countNumbers(numberList)

println result

static def countNumbers(list) {
    def result = [:]

    list.each { element ->
        result[element] = result.getOrDefault(element, 0) + 1
    }

    return result
}