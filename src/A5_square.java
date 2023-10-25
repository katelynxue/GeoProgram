public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);
        plane.startingAngle(90);
        //this is where we tell the plane to follow the square recipe
        //"call square in the go method"
        square();
        circle();
        road();
        sign();
        cone();
        rays();
    }

//this is the recipe for drawing a square
    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);
    }

    public void circle(){

        plane.teleport(258,127);

        plane.pausetime = 0;
        plane.startingAngle(60);
        plane.isTrail = true;
        plane.setColor(210,167,45);
        plane.trailWidth = 10;
        plane.teleport(803,101);
        plane.circle(50);


    }

    public void road(){

        plane.isTrail = true;
        plane.pausetime = 0;
        plane.teleport(65,597);
        plane.startingAngle(0);
        plane.trailWidth = 10;
        plane.move(800);
        plane.isTrail = false;
        plane.turn(-90);
        plane.move(100);
        plane.turn(-90);
        plane.isTrail = true;
        plane.move(800);


    }

    public void sign(){

        plane.teleport(183,600);
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.startingAngle(270);
        plane.move(100);
        plane.startingAngle(210);
        plane.move(50);
        plane.turn(-60);
        plane.move(50);
        plane.turn(-60);
        plane.move(50);
        plane.turn(-60);
        plane.move(50);
        plane.turn(-60);
        plane.move(50);
        plane.turn(-60);
        plane.move(50);
        plane.turn(-60);

    }

    public void cone(){

        plane.teleport(471,628);
        plane.startingAngle(120);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);
        plane.move(100);

    }

    public void rays(){

        plane.teleport(736,44);
        plane.startingAngle(190);
        plane.move(100);
        plane.teleport(745,106);
        plane.startingAngle(170);
        plane.move(100);
        plane.teleport(778,151);
        plane.startingAngle(140);
        plane.move(100);
        plane.teleport(832,177);
        plane.startingAngle(120);
        plane.move(100);
        plane.teleport(886,178);
        plane.startingAngle(90);
        plane.move(100);


    }

}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/