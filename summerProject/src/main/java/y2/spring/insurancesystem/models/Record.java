package y2.spring.insurancesystem.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Record {

  @Id
  private ObjectId _id;
  private LocalDate issueDate;
  private RecordType type;

  public Record(ObjectId _id, LocalDate issueDate, RecordType type) {
    this._id = _id;
    this.issueDate = issueDate;
    this.type = type;
  }

  public String get_id() {
    return _id.toHexString();
  }

  public void set_id(ObjectId _id) {
    this._id = _id;
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
