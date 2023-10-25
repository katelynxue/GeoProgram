public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;
        for (int x = 7; -1 < x; x = x - 1) {
            System.out.println(x);
            plane.square(100);

        }
        fives();
    }

    public void fives() {
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.teleport(451, 163);
        for (int x = 5; x < 36; x = x + 5) {
            System.out.println(x);
            plane.square(x);


        }
        gridOfSmallSquares();

    }

    public void rowOfSmallSquares() {
        //in this method, create a long row of 10 pixel by 10 pixel squares
        plane.trailWidth = 5;
        plane.isTrail = true;
//        plane.teleport(69,419);
        for (int x = 0; x < 800; x = x + 10) {
            System.out.println(x);
            plane.teleport(69 + x, 419);
            plane.square(10);

            //put your loop here
            columnOfSmallSquares();
        }

    }

    public void columnOfSmallSquares() {
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth = 5;
        plane.isTrail = true;
        for (int x = 0; x < 800; x = x + 10) {
            System.out.println(x);
            plane.teleport(8, 19 + x);
            plane.square(10);
            //put your loop here
            gridOfSmallSquares();
        }


    }

    public void gridOfSmallSquares() {
        //in this method, loop one of your previous two methods
        //your goal is to create a grid of squares
        //OPTIONAL EXTRA CHALLENGE can you make the squares fade from one color to another?
        //put your loop here
        plane.trailWidth = 5;
        plane.isTrail = true;
        for (int x = 0; x < 900; x = x + 10) {
            for (int y = 0; y < 800; y = y + 10) {
                System.out.println(x);
                plane.setColor(150,x/4,100);
                plane.teleport(8 + x, 19+y);
                plane.square(10);
            }
        }
    }
}