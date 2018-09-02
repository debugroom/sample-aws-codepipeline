package org.debugroom.sample.aws.codepipeline.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
public class Address {
    private String userId;
    private String zipCd;
    private String address;
    private Integer ver;
    private User usrByUserId;
    private Timestamp lastUpdatedDate;

    @Id
    @Column(name = "user_id", nullable = false, length = 8)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "zip_cd", nullable = true, length = 8)
    public String getZipCd() {
        return zipCd;
    }

    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "ver", nullable = true)
    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    @Basic
    @Column(name = "last_updated_date", nullable = true)
    public Timestamp getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "user_id")
    public User getUsrByUserId(){
        return usrByUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return Objects.equals(userId, address1.userId) &&
                Objects.equals(zipCd, address1.zipCd) &&
                Objects.equals(address, address1.address) &&
                Objects.equals(ver, address1.ver) &&
                Objects.equals(lastUpdatedDate, address1.lastUpdatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, zipCd, address, ver, lastUpdatedDate);
    }
}
