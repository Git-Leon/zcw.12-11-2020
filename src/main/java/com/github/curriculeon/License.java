package com.github.curriculeon;

import java.util.Date;

/**
 * @author leonhunter
 * @created 12/11/2020 - 6:40 PM
 */
public class License {
    private String id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date issueDate;
    private Date expirationDate;
    private Boolean isMinor;
    private Character licenseClass;
    private Character endorsement;

    public License(String id, String firstName, String lastName, Date birthDate, Date issueDate, Date expirationDate, Boolean isMinor, Character licenseClass, Character endorsement) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.isMinor = isMinor;
        this.licenseClass = licenseClass;
        this.endorsement = endorsement;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Boolean getMinor() {
        return isMinor;
    }

    public void setMinor(Boolean minor) {
        isMinor = minor;
    }

    public Character getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(Character licenseClass) {
        this.licenseClass = licenseClass;
    }

    public Character getEndorsement() {
        return endorsement;
    }

    public void setEndorsement(Character endorsement) {
        this.endorsement = endorsement;
    }
}
