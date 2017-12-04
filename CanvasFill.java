/*

flood fill

+--------------------+
|                    |
|                    |
|    0000000000      |
|    0        0      |
|    0    c   0      |
|    0        0      |
|    0000000000      |
|                    |
|                    |
|                    |
+--------------------+

blank space: white pixels
0: black pixels

selected color: x

+--------------------+
|                    |
|                    |
|    0000000000      |
|    0xxxxxxxx0      |
|    0xxxxxxxx0      |
|    0xxxxxxxx0      |
|    0000000000      |
|                    |
|                    |
|                    |
+--------------------+

+--------------------+
|                    |
|        0           |
|   000000000        |
|                    |
|                    |
|   0000c000         |
|                    |
|                    |
|                    |
|                    |
+--------------------+

+--------------------+
|                    |
|        0           |
|   000000000        |
|                    |
|                    |
|   xxxxxxxx         |
|                    |
|                    |
|                    |
|                    |
+--------------------+

canvas:
width
height
get color for a pixel
set color for a pixel

(canvas, point, selectedColor)
*/

interface Canvas {
    Color getColor(Point p);
    void setColor(Point p, Color c);
}

class Point {
    int x;
    int y;
}

void fill(Canvas canvas, Point point, Color selectedColor) {
   
   // right
    Point pt = new Point;
    pt = point(x+1, y);
    Color whatColor = getColor(point);
    if(whatColor == getColor(pt)){
        setColor(pt, selectedcColor);
        fill(canvas, point(x +1, y), selectedColor);
    }
    
    // left
    
    pt = point(x-1, y);
    if(whatColor == getColor(pt)){
        setColor(pt, selectedcColor);
        fill(canvas, point(x -1, y), selectedColor);
    }
     pt = point(x, y-1);
    if(whatColor == getColor(pt)){
        setColor(pt, selectedcColor);
        fill(canvas, point(x, y-1), selectedColor);
    }
     pt = point(x, y+1);
    if(whatColor == getColor(pt)){
        setColor(pt, selectedcColor);
        fill(canvas, point(x, y+1), selectedColor);
    }
     
}

