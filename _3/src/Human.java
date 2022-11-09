public class Human {
    protected class Leg{
        private int length;
        private String name;

        protected Leg(int length, String name){
            this.length = length;
            this.name = name;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    protected class Head{
        private int hairLength;
        private String name;

        protected Head(int hairLength, String name){
            this.hairLength = hairLength;
            this.name = name;
        }

        public int getHairLength() {
            return hairLength;
        }

        public void setHairLength(int hairLength) {
            this.hairLength = hairLength;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    protected class Hand{
        private int fingerNum;
        private String name;

        protected Hand(int fingerNum, String name){
            this.fingerNum = fingerNum;
            this.name = name;
        }

        public int getFingerNum() {
            return fingerNum;
        }

        public void setFingerNum(int fingerNum) {
            this.fingerNum = fingerNum;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
