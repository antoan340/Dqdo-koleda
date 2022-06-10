package Comand;

public class BikeShow implements Command {
     private Toys bike;

        public BikeShow(Toys bike) {
            this.bike = bike;
        }

        @Override
        public void execute() {
            this.bike.isBoy();
        }

    }

