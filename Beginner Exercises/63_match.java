class Program
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Mike", 24, 174, "Male", "IT.");
        Person person2 = new Person("Grace", 19, 162, "Female");
        Person person3 = new Person(28, 171, "Female");

        person1.getMatch(person2);
        person2.getMatch(person3);
        person3.getMatch(person1);
    }
}

class Person
{
    private String name;
    private int age;
    private int height;
    private String gender;
    private String interest;

    public void getMatch(Person obj2) {
        int count = 0;
        if (this.getAge() > obj2.getAge()) {
            if (this.getAge() - obj2.getAge() <= 5)
                count ++;
        }
        else if (obj2.getAge() > this.getAge()) {
            if (obj2.getAge() - this.getAge() <= 5)
                count ++;
        }
        else if (this.getAge() == obj2.getAge())
            count ++;
        //-----------------------------------------------------
        if (this.getHeight() > obj2.getHeight()) {
            if (this.getHeight() - obj2.getHeight() <= 20)
                count ++;
        }
        else if (obj2.getHeight() > this.getHeight()) {
            if (obj2.getHeight() - this.getHeight() <= 20)
                count ++;
        }
        else if (this.getHeight() == obj2.getHeight())
            count ++;
        //-----------------------------------------------------
        if (!this.getGender().equals(obj2.getGender()))
            count ++;
        //-----------------------------------------------------
        if (!this.getGender().equals(obj2.getGender())) {
            if (this.getGender() == "Male") {
                if (this.getAge() > obj2.getAge())
                    count ++;
            }
            else if (obj2.getGender() == "Male") {
                if (obj2.getAge() > this.getAge())
                    count ++;
            }
        }
        //-----------------------------------------------------
        if (count >= 4) {
            System.out.printf("%s and %s matches together!\n", this.getName(), obj2.getName());
        }
        else
            System.out.printf("%s and %s doesn't match!\n", this.getName(), obj2.getName());
    }

    public Person(int age, int height, String gender) {
        this.name = "Unknown";
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public Person(String name, int age, int height, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public Person(String name, int age, int height, String gender, String interest) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.interest = interest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}