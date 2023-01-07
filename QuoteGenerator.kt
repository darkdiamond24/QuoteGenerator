// fun main() is a kotlin function used in all kotlin programs
fun main() {
    // the variable is used to set the number of quotes and the variable is used as a string in println statements. Which will look like this in a printn statement: ${myFirstQuor=te}
    val myFirstQuote = Quote(50
    // the quoteResult will be used as a string in the println statement to pick a random number from 1-100 and will execute the code assigned to that number.
    val quoteResult = myFirstQuote.roll()
    
    // The when statement will have the values 1-100(100 is the last number so an else statement is used instead) whatever number is randomly chose by quoteResult will execute the println statement assigned to that number
    when (quoteResult) {
        1 -> println("The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela")
        2 -> println("The way to get started is to quit talking and begin doing. -Walt Disney")
        3 -> printn("Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking. -Steve Jobs")
        4 -> println("If life were predictable it would cease to be life, and be without flavor. -Eleanor Roosevelt")
        5 -> println("If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. -Oprah Winfrey")
        6 -> println("If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. -James Cameron")
        7 -> println("Life is what happens when you're busy making other plans. -John Lennon")
        8 -> println("Spread love everywhere you go. Let no one ever come to you without leaving happier. -Mother Teresa")
        9 -> println("When you reach the end of your rope, tie a knot in it and hang on. -Franklin D. Roosevelt")
        10 -> println("Always remember that you are absolutely unique. Just like everyone else. -Margaret Mead")
        11 -> println("Don't judge each day by the harvest you reap but by the seeds that you plant. -Robert Louis Stevenson")
        12 -> println("The future belongs to those who believe in the beauty of their dreams. -Eleanor Roosevelt")
        13 -> println("Tell me and I forget. Teach me and I remember. Involve me and I learn. -Benjamin Franklin")
        14 -> println("The best and most beautiful things in the world cannot be seen or even touched — they must be felt with the heart. -Helen Keller")
        15 -> println("It is during our darkest moments that we must focus to see the light. -Aristotle")
        16 -> println("Whoever is happy will make others happy too. -Anne Frank")
        17 -> println("Do not go where the path may lead, go instead where there is no path and leave a trail. -Ralph Waldo Emerson")
        18 -> println("")
        19 -> println("")
        20 -> println("")
        21 -> println("")
        22 -> println("")
        23 -> println("")
        24 -> println("")
        25 -> println("")
        26 -> println("")
        27 -> println("")
        28 -> println("")
        29 -> println("")
        30 -> println("")
        31 -> println("")
        32 -> println("")
        33 -> println("")
        34 -> println("")
        35 -> println("")
        36 -> println("")
        37 -> println("")
        38 -> println("")
        39 -> println("")
        40 -> println("")
        41 -> println("")
        42 -> println("")
        43 -> println("")
        44 -> println("")
        45 -> println("")
        46 -> println("")
        47 -> println("")
        48 -> println("")
        49 -> println("")
        else -> printn("")
    }
}

class Quote(val numQuotes: Int) {
    fun roll(): Int {
        return (1..numQuotes).random()
    }
}
