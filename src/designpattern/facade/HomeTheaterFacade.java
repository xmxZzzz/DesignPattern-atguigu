package designpattern.facade;

/**
 * @Package: designpattern.facade
 * @ClassName: HomeTheaterFacade
 * @Author: guoyy
 * @Description: 家庭影院的外观模式类
 * @Date: 2021/11/23 下午11:53
 * @Version: 1.0
 */
public class HomeTheaterFacade {

    private Stereo stereo;
    private TheaterLights theaterLights;
    private Projector projector;
    private Popcorn popcorn;
    private Screen screen;
    private DVDProjector dvdProjector;

    public HomeTheaterFacade() {
        this.stereo = Stereo.getInstance();
        this.theaterLights = TheaterLights.getInstance();
        this.projector = Projector.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.dvdProjector = DVDProjector.getInstance();
    }

    public void ready() {
        this.popcorn.on();
        this.popcorn.pop();
        this.projector.on();
        this.screen.on();
        this.stereo.on();
        this.theaterLights.dim();
        this.dvdProjector.on();
    }

    public void play() {
        this.dvdProjector.play();
    }

    public void pause() {
        this.dvdProjector.pause();
    }

    public void end() {
        this.popcorn.off();
        this.projector.off();
        this.screen.off();
        this.stereo.off();
        this.theaterLights.light();
        this.dvdProjector.off();
    }
}
