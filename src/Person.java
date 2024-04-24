import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String nationality;
    private LocalDate dateOfBirth;

    public Person(String aName, String aNationality, LocalDate aDateOfBirth){ //Constructors
        this.name = aName;
        this.nationality = aNationality;
        this.dateOfBirth = aDateOfBirth;
    }

    public String getName(){ //getter method for name
        return this.name;
    }

    public String getNationality(){ //getter method for nationality
        return this.nationality;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setName(String aName){ //setter method for name
        this.name = aName;
    }

    public void setNationality(String aNationality){ //setter method for nationality
        this.nationality = aNationality;
    }
}
