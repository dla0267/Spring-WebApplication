package project;

import java.time.LocalDate;

public class Record {

  private LocalDate issueDate;
  private RecordType type;

  public Record(LocalDate issueDate, RecordType type) {
    this.issueDate = issueDate;
    this.type = type;
  }

}
