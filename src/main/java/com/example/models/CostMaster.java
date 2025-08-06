package com.example.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
@Entity
@Table(name = "costmaster")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CostMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int costId;

    private double singlePersonCost;

    private double extraPersonCost;

    private double childWithBed;

    private double childWithoutBed;


    @ManyToOne
    @JoinColumn(name = "package_id")
    private PackageMaster packageMaster;


	public int getCostId() {
		return costId;
	}


	public void setCostId(int costId) {
		this.costId = costId;
	}


	public double getSinglePersonCost() {
		return singlePersonCost;
	}


	public void setSinglePersonCost(double singlePersonCost) {
		this.singlePersonCost = singlePersonCost;
	}


	public double getExtraPersonCost() {
		return extraPersonCost;
	}


	public void setExtraPersonCost(double extraPersonCost) {
		this.extraPersonCost = extraPersonCost;
	}


	public double getChildWithBed() {
		return childWithBed;
	}


	public void setChildWithBed(double childWithBed) {
		this.childWithBed = childWithBed;
	}


	public double getChildWithoutBed() {
		return childWithoutBed;
	}


	public void setChildWithoutBed(double childWithoutBed) {
		this.childWithoutBed = childWithoutBed;
	}


	public PackageMaster getPackageMaster() {
		return packageMaster;
	}


	public void setPackageMaster(PackageMaster packageMaster) {
		this.packageMaster = packageMaster;
	}
    
    
}
