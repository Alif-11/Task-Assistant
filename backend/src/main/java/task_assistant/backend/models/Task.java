package task_assistant.backend.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tasks")
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "details")
  private String details;

  @Column(name = "startDate")
  private Date startDate;

  @Column(name = "endDate", nullable = true)
  private Date endDate;

  @Column(name = "difficulty")
  private String difficulty;

  @Column(name = "timeToComplete")
  private String timeToComplete;

}
