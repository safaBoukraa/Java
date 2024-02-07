package com.safa.savetravelsModels;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Travel")
public class Travelmodel {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(min = 4, max = 100, message = "you need a travel name !")
	private String expense;

	@NotBlank
	@Size(min = 4, max = 100, message = "you need a restaurant name !")
	private String vendor;
	@NotBlank
	@Size(min = 4, max = 300, message = "you need to leave a note !")
	private String description;

	@Min(0)
	@Max(1000)  // Adjust the upper limit based on your business requirements
	private Integer amount;


	// This will not allow the createdAt column to be updated after creation
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

    public Travelmodel() {
    }
    public Travelmodel(String expense, String vendor, Integer amount, String description) {
        this.expense = expense;
        this.vendor = vendor;
        this.amount = amount;
        this.description = description;
    }
    // Getters and setters
    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date(amount);
    }
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getExpense() {
		return expense;
	}
	public void setExpense(String expense) {
		this.expense = expense;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date(amount);
    }
}
