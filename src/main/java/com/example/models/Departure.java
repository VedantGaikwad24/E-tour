
package com.example.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "departure")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departureId;

    private LocalDate departDate;

    private LocalDate endDate;

    private Integer noOfDays;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private PackageMaster packageMaster;

    @OneToMany(mappedBy = "departure")
    @JsonIgnore
    private List<BookingHeader> bookings;

	public int getDepartureId() {
		return departureId;
	}

	public void setDepartureId(int departureId) {
		this.departureId = departureId;
	}

	public LocalDate getDepartDate() {
		return departDate;
	}

	public void setDepartDate(LocalDate departDate) {
		this.departDate = departDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public PackageMaster getPackageMaster() {
		return packageMaster;
	}

	public void setPackageMaster(PackageMaster packageMaster) {
		this.packageMaster = packageMaster;
	}

	public List<BookingHeader> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingHeader> bookings) {
		this.bookings = bookings;
	}
    
 