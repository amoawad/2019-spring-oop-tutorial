import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite {

    private Image image;
    private double positionX;
    private double positionY;
    private double width;
    private double height;

    private double deltaX;
    private double deltaY;

    public Sprite(Image image) {
        this.image = image;
        this.positionX = 0;
        this.positionY = 0;
        width = image.getWidth();
        height = image.getHeight();
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public void addDeltaX(int x) {
        this.deltaX = x;
    }

    public void addDeltaY(int y) {
        this.deltaY = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void render(GraphicsContext gc) {
        gc.drawImage(image, positionX, positionY);
    }

    public void update() {
        this.positionX += deltaX;
        this.positionY += deltaY;

        deltaX = 0;
        deltaY = 0;
    }

    private Rectangle2D getBoundary() {
        return new Rectangle2D(positionX, positionY, width, height);
    }

    public boolean intersects(Sprite sprite) {
        return this.getBoundary().intersects(sprite.getBoundary());
    }

}
