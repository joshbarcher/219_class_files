package user;

public class Person
{
    private String title;
    private String fName;
    private String lName;
    private String nickName;

    public Person(String title, String fName, String lName, String nickName)
    {
        this.title = title;
        this.fName = fName;
        this.lName = lName;
        this.nickName = nickName;
    }

    @Override
    public String toString()
    {
        return title.toUpperCase() + ". " + fName + " " + lName + " (" +
                nickName + ")";
    }
}
