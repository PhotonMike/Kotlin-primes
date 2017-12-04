class Prime {
    fun Int.isPrime(): Boolean {
        when (this) {
            1 -> return false
            2 -> return true
            else -> {
                var chk = 2
                do {
                    if (this % chk == 0) {
                        return false
                    } else {
                        chk++
                    }
                } while (chk < Math.sqrt(this.toDouble()))
                return true
            }
        }
        return true
    }

    fun primeGen(num: Int): List<Int> {
        var curnum = 2
        var primeList = mutableListOf<Int>()
        do {
            if (curnum.isPrime()) {
                primeList.add(curnum)
            }
            curnum++
        } while (primeList.size<num)
        return primeList
    }
}