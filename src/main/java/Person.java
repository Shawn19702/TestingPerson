public class Person {
        private String name;
        private int age;
        private int weight;

        private String skincolor;


        private boolean tatoos;

        private String hairColor;

        private String eyeColor;

        public Person() {
                this.name = "";
                 this.age = Integer.MAX_VALUE;
                }

                public Person(int age) {
                this.age = age;
                }

                public Person(String name) {
                this.name = name;
                }

                public Person(String name, int age) {
                this.name = name;
                this.age = age;
                }

                public void setName(String name) {
                this.name = name;
                }

                public void setAge(int age) {
                this.age = age;
                }

                public String getName() {
                        return name;
                }

                public Integer getAge() {
                        return age;
                }

        public int getWeight() {
                return weight;
        }

        public void setWeight(int weight) {
                this.weight = weight;
        }

        public String getSkincolor() {
                return skincolor;
        }

        public void setSkincolor(String skincolor) {
                this.skincolor = skincolor;
        }

        public boolean getTatoos() {
                return tatoos;
        }

        public void setTatoos(boolean tatoos) {
                this.tatoos = tatoos;
        }

        public String getHairColor() {
                return hairColor;
        }

        public void setHairColor(String hairColor) {
                this.hairColor = hairColor;
        }

        public String getEyeColor() {
                return eyeColor;
        }

        public void setEyeColor(String eyeColor) {
                this.eyeColor = eyeColor;
        }
        
}





