public class Runner
{
    public static void main(String[] args)
    {
        StringChecker sc1 = new CodeWordChecker(5,8,"$");
        StringChecker sc2 = new CodeWordChecker("pass");

        System.out.println(sc2.isVaild("1,000,000,000,000,000"));
    }
}
