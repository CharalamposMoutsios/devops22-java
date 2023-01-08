package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(2.4f);
        answer.isInteger(5);

        byte any_byte = 124;
        answer.isByte(any_byte);

        short any_short = 4;
        answer.isShort(any_short);

        answer.isDouble(4.58);
        answer.isLong(153l);
        answer.isChar('c');
        answer.isBoolean(true);
    }
}