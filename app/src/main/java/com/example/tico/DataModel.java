package com.example.tico;

/*@Qitian
For every piece of data you get from the API calls, you should create a variable and getter method
below (at least for the data we need on each restaurant card)
 */
public class DataModel {

    String office;
    String name;
    String photoUrl;
    String party;

    public DataModel(String office, String name, String photoUrl, String party) {
        this.office = office;
        this.name = name;
        this.photoUrl = photoUrl;
        this.party = party;
    }

    public String getOffice() { return this.office; }

    public String getRepName() { return this.name; }

    public String getPhotoUrl() { return this.photoUrl; }

    public String getParty() { return this.party; }
}