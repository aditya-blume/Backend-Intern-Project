package org.example.Entities;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name="json_storage")
public class JsonStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String jsonData;

    @Column(nullable = true, columnDefinition = "TEXT")
    private String templateName;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String mode;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String createdBy;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String updatedBy;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String orgCode;
    @CreationTimestamp
    private Instant createdOn;

    @UpdateTimestamp
    private Instant lastUpdatedOn;


    @PrePersist
// we might have a millisecond time diff between updated time and created time during the first creation of time stamp , so we use these methods
    protected void onCreate(){
        lastUpdatedOn = createdOn;
    }
    @PreUpdate
    protected void onUpdate(){
        lastUpdatedOn = Instant.now();
    }


// Getters and setters
}