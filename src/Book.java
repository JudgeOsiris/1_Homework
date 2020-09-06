public class Book {
    public String autor;
    public String name;
    public String year;
    public String lists;
    public String toString()
    {
        String s = "Автор: " + autor + "\n" + "Название: " + name + "\n" + "Год: " + year + "\n" + "Страницы: " + lists;
        return s;
    }

}