package kotlincode

class SortByHeight {

    fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
        var count: Int = 0
        val itr = a.iterator()
        val hashMap: HashMap<Int, Int> = hashMapOf()

        while (itr.hasNext()) {
            val t = itr.next()
            if (t == -1) {
                hashMap.put(count, t)
                itr.remove()
            }
            count++
        }

        a.sort()
        hashMap.map { a.add(it.key, it.value) }

        return a
    }

}