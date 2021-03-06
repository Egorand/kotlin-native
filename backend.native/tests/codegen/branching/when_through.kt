package codegen.branching.when_through

import kotlin.test.*

fun when_through(i: Int): Int {
  var value = 1
  when (i) {
    10 -> value = 42
    11 -> value = 43
    12 -> value = 44
  }

  return value
}

@Test fun runTest() {
  if (when_through(2) != 1) throw Error()
}