package com.example.Database.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Scheduling {
    @Id
    @Column(name = "web_id", nullable = false)
    private Long webId;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "branchId", nullable = false)
    private String branchId;
    @Column(name = "eventType", nullable = false)
    private String eventType;
    @Column(name = "startDate", nullable = false)
    private String startDate;
    @Column(name = "endDate", nullable = false)
    private String endDate;
    @Column(name = "isRecurring", nullable = false)
    private Boolean isRecurring;
    @Column(name = "duration", nullable = false)
    private String duration;
    @Column(name = "recurringPattern", nullable = false)
    private String recurringPattern;
    @Column(name = "exceptionDates", nullable = false)
    private String exceptionDates;
    @Column(name = "webUserId", nullable = false)
    private Long webUserId;
    @Column(name = "customerId", nullable = false)
    private String customerId;
    @Column(name = "customerNumber", nullable = false)
    private String customerNumber;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "workOrderId")
    private String workOrderId;
    @Column(name = "workOrderName")
    private String workOrderName;
    @Column(name = "workOrderPriority")
    private String workOrderPriority;

    public Scheduling() {
    }

    public Scheduling(Long webId, String title, String branchId, String eventType, String startDate, String endDate, Boolean isRecurring, String duration, String recurringPattern, String exceptionDates, Long webUserId, String customerId, String customerNumber, String customerName, String workOrderId, String workOrderName, String workOrderPriority) {
        this.webId = webId;
        this.title = title;
        this.branchId = branchId;
        this.eventType = eventType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isRecurring = isRecurring;
        this.duration = duration;
        this.recurringPattern = recurringPattern;
        this.exceptionDates = exceptionDates;
        this.webUserId = webUserId;
        this.customerId = customerId;
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.workOrderId = workOrderId;
        this.workOrderName = workOrderName;
        this.workOrderPriority = workOrderPriority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getRecurring() {
        return isRecurring;
    }

    public void setRecurring(Boolean recurring) {
        isRecurring = recurring;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRecurringPattern() {
        return recurringPattern;
    }

    public void setRecurringPattern(String recurringPattern) {
        this.recurringPattern = recurringPattern;
    }

    public String getExceptionDates() {
        return exceptionDates;
    }

    public void setExceptionDates(String exceptionDates) {
        this.exceptionDates = exceptionDates;
    }

    public Long getWebUserId() {
        return webUserId;
    }

    public void setWebUserId(Long webUserId) {
        this.webUserId = webUserId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getWorkOrderName() {
        return workOrderName;
    }

    public void setWorkOrderName(String workOrderName) {
        this.workOrderName = workOrderName;
    }

    public String getWorkOrderPriority() {
        return workOrderPriority;
    }

    public void setWorkOrderPriority(String workOrderPriority) {
        this.workOrderPriority = workOrderPriority;
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }
}
