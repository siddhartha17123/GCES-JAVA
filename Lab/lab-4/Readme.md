# Lab 4 

## Graphics 
* A Graphics object encapsulates state information needed for the basic rendering operations that Java supports.
* Commonly used methods of Graphics class:

    * public abstract void drawString(String str, int x, int y): is used to draw the specified string.
    * public void drawRect(int x, int y, int width, int height): draws a rectangle with the specified width and height.
    * public abstract void fillRect(int x, int y, int width, int height): is used to fill rectangle with the default color and specified width and height.
    * public abstract void drawOval(int x, int y, int width, int height): is used to draw oval with the specified width and height.
    * public abstract void fillOval(int x, int y, int width, int height): is used to fill oval with the default color and specified width and height.
    * public abstract void drawLine(int x1, int y1, int x2, int y2): is used to draw line between the points(x1, y1) and (x2, y2).
    * public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer): is used draw the specified image.
    * public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used draw a circular or elliptical arc.
    * public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used to fill a circular or elliptical arc.
    * public abstract void setColor(Color c): is used to set the graphics current color to the specified color.
    public abstract void setFont(Font font): is used to set the graphics current font to the specified font.
    ***

## Sockets Programming
* Socket programming in Java is used for communication between the applications that are running on different JRE. It can be either connection-oriented or connectionless. On the whole, a socket is a way to establish a connection between a client and a server.
* Client in socket programming must know two information:

    * IP Address of Server
    * Port number.

* Here, we are going to make one-way client and server communication. In this application, client sends a message to the server, server reads the message and prints it. Here, two classes are being used: Socket and ServerSocket. The Socket class is used to communicate client and server. Through this class, we can read and write message. The ServerSocket class is used at server-side. The accept() method of ServerSocket class blocks the console until the client is connected. After the successful connection of client, it returns the instance of Socket at server-side.

