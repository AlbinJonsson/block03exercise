import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    private ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>();

        polygons.add(new Polygon("square", new Point(100,100)));
        polygons.add(new Polygon("triangle", new Point(150,150)));
        polygons.add(new Polygon("rectangle", new Point(100,200)));
    }//constructor

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);
    }//main
}//DrawPolygons