package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        var result=" "
        val nums = arrayOf(
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine", "half")
        when(minute.toInt()){
            0-> result="${nums[hour.toInt()]} o' clock"
            15->result="quarter past ${nums[hour.toInt()]}"
            in 1..29-> result="${nums[minute.toInt()]} minutes past ${nums[hour.toInt()]}"
            30-> result="${nums[minute.toInt()]} past ${nums[hour.toInt()]}"
            45->result="quarter to ${nums[hour.toInt()+1]}"
            in 31..59-> result="${nums[60-minute.toInt()]} minutes to ${nums[hour.toInt()+1]}"
            else-> result=""
        }
        return result
    }
}
