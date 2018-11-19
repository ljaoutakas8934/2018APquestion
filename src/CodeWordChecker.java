public class CodeWordChecker implements StringChecker
{
    private int min;
    private int max;
    private String not;

    public CodeWordChecker (int min, int max, String not)
    {
        this.min = min;
        this.max = max;
        this.not = not;
    }

    public CodeWordChecker (String not)
    {
        this.min = 6;
        this.max = 20;
        this.not = not;
    }

    public boolean isVaild(String input)
    {
        if (input.indexOf(not )!= -1 ) return false;
        if (input.length()>max || input.length() < min) return false;
        return true;
    }
}
