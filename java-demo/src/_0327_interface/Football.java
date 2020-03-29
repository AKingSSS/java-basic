package _0327_interface;

/**
 * @ClassName Football
 * @Description
 * @Author yangkang
 * @Date 2020/3/27 20:18
 * @Version 1.0
 **/
public interface Football extends Sports {
    public void homeTeamScored(int points);

    public void visitingTeamScored(int points);

    public void endOfQuarter(int quarter);
}
