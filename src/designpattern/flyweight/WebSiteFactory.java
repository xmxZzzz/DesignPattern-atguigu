package designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Package: designpattern.flyweight
 * @ClassName: WebSiteFactory
 * @Author: guoyy
 * @Description: 享元工厂，充当享元池
 * @Date: 2021/11/24 下午9:42
 * @Version: 1.0
 */
public class WebSiteFactory {

    //享元对象集合，key：类型，value：相应的享元对象
    private Map<String, WebSite> pool = new HashMap<>();

    /*
     * @Method getWebSit
     * @Version  1.0
     * @Description 按照类型从享元池中获取享元对象
     * @param type 网站的表现类型
     * @Return designpattern.flyweight.WebSite
     * @Date 2021/11/24 下午9:47
     */
    public WebSite getWebSit(String type) {
        if (!pool.containsKey(type)) {
            WebSite webSite = new ConcreteWebSite(type);
            pool.put(type, webSite);
        }
        return pool.get(type);
    }

    /*
     * @Method getWebSiteNum
     * @Version  1.0
     * @Description 返回享元池中的享元对象个数
     * @Date 2021/11/24 下午9:48
     */
    public void getWebSiteNum() {
        System.out.println("享元池的大小为：" + pool.size());
    }

}
