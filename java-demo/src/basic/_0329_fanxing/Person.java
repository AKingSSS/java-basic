package basic._0329_fanxing;

/**
 * @ClassName Person
 * @Description
 * @Author yangkang
 * @Date 2020/3/29 15:55
 * @Version 1.0
 **/
public class Person implements Comparable<Person> {
    private String name;
    private int score;

    @Override
    public int compareTo(Person o) {
        if (this.score < o.score) {
            return -1;
        } else if (this.score > o.score) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
