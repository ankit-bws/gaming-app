package com.example.android.gamingapp.Tournament;

public class CreateContestModel {
    String startdate,enddate,starttime,endtime,nameoftournamnet,fees,winningprice,gamename,coordinatorname,contactno,doc_utl;

    public CreateContestModel(String startdate, String enddate, String starttime, String endtime, String nameoftournamnet, String fees, String winningprice, String gamename, String coordinatorname, String contactno, String doc_utl) {
        this.startdate = startdate;
        this.enddate = enddate;
        this.starttime = starttime;
        this.endtime = endtime;
        this.nameoftournamnet = nameoftournamnet;
        this.fees = fees;
        this.winningprice = winningprice;
        this.gamename = gamename;
        this.coordinatorname = coordinatorname;
        this.contactno = contactno;
        this.doc_utl = doc_utl;
    }


    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getNameoftournamnet() {
        return nameoftournamnet;
    }

    public void setNameoftournamnet(String nameoftournamnet) {
        this.nameoftournamnet = nameoftournamnet;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getWinningprice() {
        return winningprice;
    }

    public void setWinningprice(String winningprice) {
        this.winningprice = winningprice;
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public String getCoordinatorname() {
        return coordinatorname;
    }

    public void setCoordinatorname(String coordinatorname) {
        this.coordinatorname = coordinatorname;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getDoc_utl() {
        return doc_utl;
    }

    public void setDoc_utl(String doc_utl) {
        this.doc_utl = doc_utl;
    }
}
