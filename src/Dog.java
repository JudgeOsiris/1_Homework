public class Dog {
    private String name;
    private int age;
    private String breed;
    public String getName ()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBreed ()
    {
        return breed;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public int getAge ()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String toString()
    {
        String s = "Кличка: " + name + "\n" + "Возраст: " + age + "\n" + "Порода: " + breed;
        return s;
    }
    public int humanAge()
    {
        int humanAge = age * 7;
        return humanAge;
    }
}
