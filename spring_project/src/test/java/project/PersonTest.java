package project;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

  private Person person1;
  private LocalDate birth1;
  @Before
  public void setUp() throws Exception {
    birth1 = LocalDate.of(1994, 9, 26);
    person1 = new Person("Jenny", "Lee", birth1);
  }

  @Test
  public void getFirstName() {
    Assert.assertEquals("Jenny", person1.getFirstName());
  }

  @Test
  public void setFirstName() {
  }

  @Test
  public void getLastName() {
    Assert.assertEquals("Lee", person1.getLastName());
  }

  @Test
  public void setLastName() {
  }

  @Test
  public void getDateOfBirth() {
  }

  @Test
  public void setDateOfBirth() {
  }
}