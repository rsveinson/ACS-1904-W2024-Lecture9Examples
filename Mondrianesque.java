import java.util.Random;
/**
 * The main method creates an intial rectangle,
 * and then calls subdivide to have it recursively 
 * subdivided.
 */
public class Mondrianesque
{
    // a maximum depth of 4 recursive calls
    private static final int MAX_DEPTH = 4;
    private static int depth = 1;
    private static Random r = new Random();
    public static void main(String [] args){
        // the initial canvas (rectangle)
        MRectangle m = new MRectangle(0,0,500,300,chooseColor());
        m.makeVisible();
        subdivide (m);
    }

    /**
     * subdivide: replaces one rectangle by two rectangles,
     * and also a black border line to separate them. 
     * The black border is a narrow black rectangle.
     * 
     * @param  r2  a rectangle 
     */
    public static void subdivide(MRectangle r2){
        // The original rectangle R is replaced by two rectangles
        // R1 and R2. 
        // r2 is the incoming rectangle that will be resized
        // r1 is generated below. 
        //
        // choose the x or y axis for subdivision
        Axes axis = Axes.xAxis;
        boolean toSubdivide = (r2.xlen>250 || r2.ylen>150);
        MRectangle r1 = null;
        MRectangle border = null;
        if (toSubdivide){
            // if both sides of the rectangle are reasonably long, choose one randomly
            if (r2.xlen>250 && r2.ylen>150) 
               if (0 == r.nextInt(2)) axis = Axes.xAxis;
               else axis = Axes.yAxis;
            // if only the x side is long enough choose X axis
            else if (r2.xlen>250) axis = Axes.xAxis;
            // if only the y side is long enough choose Y axis
            else axis = Axes.yAxis;
            
            // handle split on the X axis
            if (axis == Axes.xAxis){
                // choose where to split along the X axis
                int deltaX = r.nextInt(250);
                // choose a colour for this rectangle ... the other rectangle will have the original colour
                String color = chooseColor();
                while (color.equals(r2.color)) color = chooseColor();
                // R1 is a new rectangle
                r1= new MRectangle(r2.xPosition+deltaX+4,r2.yPosition,r2.xlen-deltaX-4,r2.ylen,color);
                r1.makeVisible();
                // R2 obtained by just changing size of original rectangle
                r2.changeX(deltaX);
                // create the black border along the axis
                border=new MRectangle(r2.xPosition+deltaX,r2.yPosition,4,r2.ylen,"black");
                border.makeVisible();
            }
            // handle the subdivision along the Y axis
            else {
                // choose point along Y axis for splitting
                int deltaY = r.nextInt(150);
                // pick a colour
                String color = chooseColor();
                while (color.equals(r2.color)) color = chooseColor();
                // R1 is the new rectangle
                r1= new MRectangle(r2.xPosition,r2.yPosition+deltaY+4,r2.xlen,r2.ylen-deltaY-4,color);
                r1.makeVisible();
                // R2 obtained by just changing size of original rectangle
                r2.changeY(deltaY);
                // create the black border along the axis
                border = new MRectangle(r2.xPosition,r2.yPosition+deltaY,r2.xlen,4,"black");
                border.makeVisible();
            }
            depth++;
            // do not recurse any more than maximum set
            if (depth<MAX_DEPTH){
                subdivide(r1);
                subdivide(r2);
            }
        }
        //         c
    }

    public static String chooseColor(){
        String choice = "white";
        switch (r.nextInt(13)) {
            case 0: choice = "red";
            break;
            case 1: choice = "green";
            break;
            case 2: choice = "blue";
            break;
            case 3: choice = "black";
            break;
            case 4: choice = "yellow";
            break;
            case 5: choice = "magenta";
            break;
            case 6: choice = "white";
            break;
            case 7: choice = "red";
            break;
            case 8: choice = "orange";
            break;
            case 9: choice = "pink";
            break;
            case 12: choice = "gray";
            break;
        }
        return choice;
    }
    
public enum Axes {xAxis, yAxis};
}