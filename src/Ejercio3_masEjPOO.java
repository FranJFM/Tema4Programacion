public class Ejercio3_masEjPOO {


    public static void main(String[] args) {

        Fan f=new Fan();
        Fan2 f2=new Fan2();
        System.out.println(f.toString());
        System.out.println();
        System.out.println(f2.toString());



    }
    static int SLOW = 1;
    static int MEDIUM = 2;
    static int FAST = 3;
    static class Fan2 {
        private int speed;
        private boolean on;
        private double radious;
        public String color;

        Fan2() {
            this.speed = FAST;
            this.on = true;
            this.radious = 10;
            this.color = "yellow";

        }
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public boolean getOn() {
            return on;
        }
        public void setOn(boolean on) {
            this.on = on;
        }
        public double getRadious() {
            return radious;

        }
        public void setRadious(double radious) {
            this.radious = radious;

        }
        public String getColor() {
            return color;

        }
        public void setColor(String color) {
            this.color = color;

        }
        @Override
        public String toString() {
            if (on) {

                return "Se encuentra apagado/encendido?-->" + getOn() + " .El ventilador está en velocidad: " + getSpeed() + " ." + "Su color actual es: " + getColor() + " .Y su radio es de: " + getRadious();
            }else {
                return "fan is off" + " ." + "Su color actual es: " + getColor() + " .Y su radio es de: " + getRadious();
            }



        }




    }

    static class Fan{
        private int speed;
        private boolean on;
        private double radious;
        public String color;

        Fan(){
            this.speed = SLOW;
            this.on = false;
            this.radious=5;
            this.color = "blue";

        }
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public boolean getOn() {
            return on;
        }
        public void setOn(boolean on) {
            this.on = on;
        }
        public double getRadious() {
            return radious;

        }
        public void setRadious(double radious) {
            this.radious = radious;

        }
        public String getColor() {
            return color;

        }
        public void setColor(String color) {
            this.color = color;

        }



            @Override
            public String toString() {
                if (on) {

                    return "Se encuentra apagado/encendido?-->" + getOn() + " .El ventilador está en velocidad: " + getSpeed() + " ." + "Su color actual es: " + getColor() + " .Y su radio es de: " + getRadious();
                }else {
                    return "fan is off" + " ." + "Su color actual es: " + getColor() + " .Y su radio es de: " + getRadious();
                }



            }











    }

}
