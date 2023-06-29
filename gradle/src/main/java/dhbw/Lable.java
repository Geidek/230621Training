package dhbw;

enum position {
        FRONT,
        BACK
}


enum name {
        LondonDryGin, BlackcurrantRoyalGin, Lovage, FlorDeSevilla, MalaccaGin, Rangpur

}
public class Lable {

        public Lable(position position, String text, int serialNumber) {
                this.text = text;
        }


        public String getText() {
                return text;
        }

        public void setText(String text) {
                this.text = text;
        }

        private String text;





}


