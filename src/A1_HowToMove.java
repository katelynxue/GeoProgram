public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 2;
        plane.setColor(250,40,230);
        plane.trailWidth = 2;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(100);
        plane.startingAngle(310);
        plane.move(110);
        plane.isTrail = false;
        plane.startingAngle(130);
        plane.move(110);
        plane.isTrail = true;
        plane.startingAngle(45);
        plane.move(110);
        plane.isTrail = false;
        plane.startingAngle(225);
        plane.move(110);
        plane.isTrail = true;
        plane.startingAngle(90);
        plane.move(120);
        plane.isTrail = false;
        plane.teleport(414,261);
        plane.isTrail = true;
        plane.startingAngle(45);
        plane.move(250);
        plane.isTrail = false;
        plane.startingAngle(225);
        plane.move(125);
        plane.isTrail = true;
        plane.startingAngle(135);
        plane.move(125);
        plane.isTrail = false;
        plane.startingAngle(315);
        plane.move(125);
        plane.isTrail = true;
        plane.move(125);



    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/