/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.generalclasses;

/**
 *
 * @author ijazm
 */
public class Clinic {
    public static Clinic c;
    private Integer cid;
    private Integer aid;

    public Clinic(Integer cid, Integer aid, String name, String address) {
        this.cid = cid;
        this.aid = aid;
        this.name = name;
        this.address = address;
    }
    private String name;
    private String address;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
