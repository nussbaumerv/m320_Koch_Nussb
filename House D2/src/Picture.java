/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle cloud1;
    private Circle cloud2;
    private Circle cloud3;
    private Person person;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        person = new Person();
        person.moveHorizontal(100);
        person.moveVertical(0);
        person.changeSize(120, 60);
        person.makeVisible();

        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();

        cloud1 = new Circle();
        cloud1.changeColor("magenta");
        cloud1.moveHorizontal(0);
        cloud1.moveVertical(-50);
        cloud1.changeSize(40);
        cloud1.makeVisible();

        cloud2 = new Circle();
        cloud2.changeColor("magenta");
        cloud2.moveHorizontal(10);
        cloud2.moveVertical(-60);
        cloud2.changeSize(50);
        cloud2.makeVisible();

        cloud3 = new Circle();
        cloud3.changeColor("magenta");
        cloud3.moveHorizontal(30);
        cloud3.moveVertical(-50);
        cloud3.changeSize(40);
        cloud3.makeVisible();

        moveClouds();
        person.moveLeft();

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            cloud1.changeColor("grey");
            cloud2.changeColor("grey");
            cloud3.changeColor("grey");
            person.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            cloud1.changeColor("magenta");
            cloud2.changeColor("magenta");
            cloud3.changeColor("magenta");
        }
    }
    public void moveClouds(){
        for (int i = 0; i < 6; i++) {
            cloud1.moveHorizontal(4);
            cloud2.moveHorizontal(4);
            cloud3.moveHorizontal(4);
            person.moveHorizontal(-10);
        };
    }
    public void movePerson(){
        for (int i = 0; i < 10; i++) {
            person.moveHorizontal(-4);
        }
    }
}
