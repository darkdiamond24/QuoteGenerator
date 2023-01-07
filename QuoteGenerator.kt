// fun main() is a kotlin function used in all kotlin programs
fun main() {
    // the variable is used to set the number of quotes and the variable is used as a string in println statements. Which will look like this in a printn statement: ${myFirstQuor=te}
    val myFirstQuote = Quote(50)
    // the quoteResult will be used as a string in the println statement to pick a random number from 1-100 and will execute the code assigned to that number.
    val quoteResult = myFirstQuote.roll()
    
    // The when statement will have the values 1-100(100 is the last number so an else statement is used instead) whatever number is randomly chose by quoteResult will execute the println statement assigned to that number
    when (quoteResult) {
        // the number chosen will exexute the println statement assigned to that number
        // when statements allow you to easily assign different println statements to different numbers easily
        // the arrow -> lets the compiler know what to do when the number is chosen
        // In this case, it will execute the println statement assigned to the number chosen
        //
        1 -> println("The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela")
        2 -> println("The way to get started is to quit talking and begin doing. -Walt Disney")
        3 -> println("Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking. -Steve Jobs")
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
        18 -> println("You will face many defeats in life, but never let yourself be defeated. -Maya Angelou")
        19 -> println("The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela")
        20 -> println("In the end, it's not the years in your life that count. It's the life in your years. -Abraham Lincoln")
        21 -> println("Never let the fear of striking out keep you from playing the game. -Babe Ruth")
        22 -> println("Life is either a daring adventure or nothing at all. -Helen Keller")
        23 -> println("Many of life's failures are people who did not realize how close they were to success when they gave up. -Thomas A. Edison")
        24 -> println("You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose. -Dr. Seuss")
        25 -> println("Keep smiling, because life is a beautiful thing and there's so much to smile about. -Marilyn Monroe")
        26 -> println("Life is a long lesson in humility. -James M. Barrie")
        27 -> println("In three words I can sum up everything I've learned about life: it goes on. -Robert Frost")
        28 -> println("Love the life you live. Live the life you love. -Bob Marley")
        29 -> println("Life is either a daring adventure or nothing at all. -Helen Keller")
        30 -> println("You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose. -Dr. Seuss")
        31 -> println("Life is made of ever so many partings welded together. -Charles Dickens")
        32 -> println("Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma — which is living with the results of other people's thinking. -Steve Jobs")
        33 -> println("Life is trying things to see if they work. -Ray Bradbury")
        34 -> println("Many of life's failures are people who did not realize how close they were to success when they gave up. -Thomas A. Edison")
        35 -> println("Success is not final; failure is not fatal: It is the courage to continue that counts. -Winston S. Churchill")
        36 -> println("Success usually comes to those who are too busy to be looking for it. -Henry David Thoreau")
        37 -> println("The way to get started is to quit talking and begin doing. -Walt Disney")
        38 -> println("If you really look closely, most overnight successes took a long time. -Steve Jobs")
        39 -> println("The secret of success is to do the common thing uncommonly well. -John D. Rockefeller Jr.")
        40 -> println("I find that the harder I work, the more luck I seem to have. -Thomas Jefferson")
        41 -> println("The real test is not whether you avoid this failure, because you won't. It's whether you let it harden or shame you into inaction, or whether you learn from it; whether you choose to persevere. -Barack Obama")
        42 -> println("You miss 100% of the shots you don't take. -Wayne Gretzky")
        43 -> println("Whether you think you can or you think you can't, you're right. -Henry Ford")
        44 -> println("I have learned over the years that when one's mind is made up, this diminishes fear. -Rosa Parks")
        45 -> println("I alone cannot change the world, but I can cast a stone across the water to create many ripples. -Mother Teresa")
        46 -> println("Nothing is impossible, the word itself says, ‘I'm possible!' -Audrey Hepburn")
        47 -> println("The question isn't who is going to let me; it's who is going to stop me. -Ayn Rand")
        48 -> println("The only person you are destined to become is the person you decide to be. -Ralph Waldo Emerson") 
        49 -> println("I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel. -Maya Angelou")
        // an else statement can be used for the final numbes as their is no need to specify since it is the final numer in the number range and the system will alreay know which number you mean
        else -> println("Don't be afraid to give up the good to go for the great -John D. Rockefeller")
     
        
    }
}
// This Quote class is used to generate the random number that will have a prinln statement assigned to it. The number you get will determine the Quote that you will get. With the help of the code in fun main() before the when statement
class Quote(val numQuotes: Int) {
    fun roll(): Int {
        return (1..numQuotes).random()
    }
}
