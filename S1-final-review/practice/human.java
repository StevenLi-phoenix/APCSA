public class human{
    private String name;
    private Double age;
    private String gender;

    public human(String name, Double age, String gender) {
        this.name = name;
        this.age = age;
        assert gender.equals("male") || gender.equals("female");
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "human [age=" + age + ", gender=" + gender + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
