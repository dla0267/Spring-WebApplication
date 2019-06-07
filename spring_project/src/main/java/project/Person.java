package project;

import java.time.LocalDate;

public class Person {
  private String firstName;
  private String lastName;
  private LocalDate dateOfBirth;

  public Person(String firstName, String lastName, LocalDate dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * Get the firstName of the Person.
   * @return firstName of the Person.
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Set the firstName of this Person.
   * @param firstName firstName given to this Person.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Get the lastName of the Person.
   * @return lastName of the Person.
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Set the lastName of this Person.
   * @param lastName given to this Person.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Get the dateOfBirth of the Person.
   * @return dateOfBirth of the Person.
   */
  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }

  /**
   * Set the dateOfBirth of this Person.
   * @param dateOfBirth  given to this Person.
   */
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}
