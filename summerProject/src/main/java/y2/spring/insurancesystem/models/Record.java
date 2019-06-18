package y2.spring.insurancesystem.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Record {

  @Id
  private String id;
  private LocalDate issueDate;
  private RecordType type;

  public Record(LocalDate issueDate, RecordType type) {
    this.issueDate = issueDate;
    this.type = type;
  }

  public String getId() {
    return this.id;
  }

  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public RecordType getType() {
    return type;
  }

  public void setType(RecordType type) {
    this.type = type;
  }
}
