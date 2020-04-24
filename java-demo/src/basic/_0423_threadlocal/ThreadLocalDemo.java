package basic._0423_threadlocal;

/**
 * @ClassName ThreadDemo
 * @Description 需求：线程隔离
 *              线程 A 设置变量（变量1） 获取(变量1)
 *              线程 B 设置变量（变量2） 获取(变量2)
 * @Author yangkang
 * @Date 2020/4/23 8:20
 * @Version 1.0
 **/
public class ThreadLocalDemo {
    ThreadLocal<String> tl = new ThreadLocal<>();
    /**
     * 变量 内容
     */
    private String content;

    public String getContent() {
        String s = tl.get();
        return s;
    }

    public void setContent(String content) {
        // 变量 content 绑定到当前线程
        tl.set(content);
    }

    public static void main(String[] args) {
        ThreadLocalDemo demo = new ThreadLocalDemo();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    demo.setContent(Thread.currentThread().getName() + "的数据");
                    System.out.println("---------------------------------");
                    System.out.println(Thread.currentThread().getName() + "--->" + demo.getContent());
                }
            });
            thread.setName("线程" + i);
            thread.start();
        }
    }
}