package placementproject;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placement")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int collegeId;
    private LocalDate date;
    private String qualification;
    private int year;

    // ✅ Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getQualification() {
        return qualification;
    }

    public int getYear() {
        return year;
    }

    // ✅ Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

