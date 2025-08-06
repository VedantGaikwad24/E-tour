package com.example.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "bookingheader")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    private LocalDateTime bookingDate;

    private int noOfPax;

    private double tourAmount;

    private double taxes;

    private double totalAmount;

    private String paymentStatus;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private PackageMaster packageMaster;

    @ManyToOne
    @JoinColumn(name = "departure_id")
    private Departure departure;

    @OneToMany(mappedBy = "bookingHeader")
    @JsonIgnore
    private List<Passenger> passengers;
    
    @OneToMany(mappedBy = "booking")
    @JsonIgnore
    private List<PaymentStatus> paymentStatuses;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getNoOfPax() {
		return noOfPax;
	}

	public void setNoOfPax(int noOfPax) {
		this.noOfPax = noOfPax;
	}

	public double getTourAmount() {
		return tourAmount;
	}

	public void setTourAmount(double tourAmount) {
		this.tourAmount = tourAmount;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public PackageMaster getPackageMaster() {
		return packageMaster;
	}

	public void setPackageMaster(PackageMaster packageMaster) {
		this.packageMaster = packageMaster;
	}

	public Departure getDeparture() {
		return departure;
	}

	public void setDeparture(Departure departure) {
		this.departure = departure;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public List<PaymentStatus> getPaymentStatuses() {
		return paymentStatuses;
	}

	public void setPaymentStatuses(List<PaymentStatus> paymentStatuses) {
		this.paymentStatuses = paymentStatuses;
	}
    
    

}
