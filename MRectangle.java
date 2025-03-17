import java.awt.*;
/**
 * This class is a simple rectangle that is designed to work with
 * the Shapes example from BlueJ - in particular the Canvas class.
 */
public class MRectangle
{
    public int xlen;
    public int ylen;
    public int xPosition;
    public int yPosition;
    public String color;
    private boolean isVisible;

    /**
     * Create a new rectangle.
     */
    public MRectangle(int x, int y, int xlen, int ylen, String color)
    {
        this.xlen = xlen;
        this.ylen = ylen;
        xPosition = x;
        yPosition = y;
        this.color = color;
        isVisible = true;
    }

    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeX(int newXlen)
    {
        erase();
        xlen = newXlen;
        draw();
    }
    public void changeY(int newYlen)
    {
        erase();
        ylen = newYlen;
        draw();
    }

    /**
     * Draw the square with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(xPosition, yPosition, xlen, ylen));
            canvas.wait(10);
        }
    }

    /**
     * Erase the square on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
