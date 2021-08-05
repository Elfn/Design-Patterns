public interface Person {
    String getFirstName();
    String getLastName();
    int getAge();
    String getPhoneNumber();
    String getAddress();

    class DefaultPerson implements Person{

        //Required parameters
        private final String firstName;
        private final String lastName;

        //Optional parameters
        protected   String phoneNumber;
        protected   String address;
        protected   int age;



    public DefaultPerson(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

    public DefaultPerson(String lastName,String firstName, String phoneNumber, String address, int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.age = age;
        }

    public DefaultPerson(DefaultPerson.Builder builder) {
            this(builder.getFirstName(), builder.getLastName());
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.age = age;
        }

        @Override
        public String getFirstName() {
            return this.firstName;
        }

        @Override
        public String getLastName() {
            return this.lastName;
        }

        @Override
        public String getPhoneNumber() {
            return this.phoneNumber;
        }



        @Override
        public String getAddress() {
            return this.address;
        }



        @Override
        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return "DefaultPerson{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", address='" + address + '\'' +
                    ", age=" + age +
                    '}';

        }
    }

    //Inner class
    class Builder extends DefaultPerson{

        public Builder(String firstName, String lastName) {
            super(firstName, lastName);
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder phone(String phone){
            this.phoneNumber = phone;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public DefaultPerson build(){
            return new DefaultPerson(this);
        }
    }


}
