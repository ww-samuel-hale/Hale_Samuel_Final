public class Main {
    public static void main(String[] args) {
        TestPositive positiveTest = new TestPositive();
        TestNegatives negativeTest = new TestNegatives();
        TestMixed mixedTest = new TestMixed();
        int numTests = 3;
        int numCorrect = 0;
        if(positiveTest.testPositive() == true) numCorrect += 1;
        if(negativeTest.testNegative() == true) numCorrect += 1;
        if (mixedTest.testMixed() == true) numCorrect += 1;

        System.out.println("Passed " + numCorrect + "/" + numTests + " tests.");
    }
}