package designpattern.flyweight;

/**
 * @Package: designpattern.flyweight
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试享元模式——网站
 * @Date: 2021/11/24 下午9:47
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite blog = factory.getWebSit("博客");
        blog.use(new User("tom"));

        WebSite news = factory.getWebSit("新闻");
        news.use(new User("jerry"));

        WebSite blog1 = factory.getWebSit("博客");
        blog1.use(new User("alice"));

        factory.getWebSiteNum();
    }
}
