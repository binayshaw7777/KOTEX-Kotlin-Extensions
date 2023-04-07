package extensions

import kotlin.NullPointerException

/**
 * Returns a boolean according to the input string, true if the email is valid else false.
 *
 * @param input the string/charSequence to trim (must not be null)
 * @return Boolean
 * @throws NullPointerException if the input string is null
 * @sample myEmail.isEmailValid()
 */

fun String?.isEmailValid() : Boolean {
    this?.let {
        val emailRegex = Regex("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
        return emailRegex.matches(it)
    }
    throw NullPointerException("Input cannot be null")
}

fun CharSequence?.isEmailValid() : Boolean {
    this?.let {
        val emailRegex = Regex("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
        return emailRegex.matches(it)
    }
    throw NullPointerException("Input cannot be null")
}


/**
 * Returns a boolean according to the input string, true if the password is valid else false.
 *
 * @param input the string/charSequence to trim (must not be null)
 * @return Boolean
 * @throws NullPointerException if the input string is null
 * @sample myPassword.isPasswordValid()
 *
 * requirements: Must have: Uppercase letter, Lowercase letter, Number, Special character, Length > 8
 */

fun String?.isPasswordValid() : Boolean {
    this?.let {
        val passwordRegex = Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}\$")
        return passwordRegex.matches(it)
    }
    throw NullPointerException("Input cannot be null")
}

fun CharSequence?.isPasswordValid() : Boolean {
    this?.let {
        val passwordRegex = Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}\$")
        return passwordRegex.matches(it)
    }
    throw NullPointerException("Input cannot be null")
}

/**
 * Returns the same input data type.
 *
 * @param input the string/charSequence/Long to trim (must not be null)
 * @return same as input data type
 * @throws NullPointerException if the input is null
 * @sample myNumber.getTrimmedNumber()
 *
 * requirements: Length > 9, return last 10 digits
 */

fun String?.getTrimmedPhoneNumber() : String {
    this?.let {
        val lengthOfNumber = it.length
        if (it.length < 10) throw Exception("Phone number is not valid")
        return it.substring(it.length - 10, it.length)
    }
    throw NullPointerException("Input cannot be null")
}

fun Long?.getTrimmedPhoneNumber() : Long {
    this?.let {
        return it.toString().getTrimmedPhoneNumber().toLong()
    }
    throw NullPointerException("Input cannot be null")
}