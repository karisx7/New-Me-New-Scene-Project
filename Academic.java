public class Academic {
// This class represents a single academic achievement object. Stores the type and title of the achievement.
private String title;
private String type;

/**
* Constructs the Academic object.
* Precondition: Title and type must exist for the object.
* Postcondition: The instance variables are initialized.
  */
  public Academic(String title, String type) {
    this.title = title;
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public String getType() {
    return type;
  }


  public String toString() {
    return "These are the list of competitions that I won in 2025: \n" + "Name of Achievement: " + title;
  }


}