package extensions

/**
 * Returns a string.
 *
 * @param input the string/charSequence to trim (must not be null)
 * @return string
 * @throws NullPointerException if the input is null
 * @sample myFullName.getFirstName()
 *  "Binay Shaw" -> "Binay"
 */

fun String?.getFirstName() : String {
    this?.let {
        return it.split(" ")[0]
    }
    throw NullPointerException("Input cannot be null")
}

fun CharSequence?.getFirstName() : String {
    this?.let {
        return it.split(" ")[0]
    }
    throw NullPointerException("Input cannot be null")
}