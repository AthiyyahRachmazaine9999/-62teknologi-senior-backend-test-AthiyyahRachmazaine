package entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.data.annotation.Id;

public class Item {

    public VarcharJdbcType getId() {
        return id;
    }

    public void setId(VarcharJdbcType id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private VarcharJdbcType id;

    public VarcharJdbcType getAlias() {
        return alias;
    }

    public void setAlias(VarcharJdbcType alias) {
        this.alias = alias;
    }

    private VarcharJdbcType alias;

    public VarcharJdbcType getName() {
        return name;
    }

    public void setName(VarcharJdbcType name) {
        this.name = name;
    }

    private VarcharJdbcType name;

    public VarcharJdbcType getImage_url() {
        return image_url;
    }

    public void setImage_url(VarcharJdbcType image_url) {
        this.image_url = image_url;
    }

    private VarcharJdbcType image_url;

    public VarcharJdbcType getIs_closed() {
        return is_closed;
    }

    public void setIs_closed(VarcharJdbcType is_closed) {
        this.is_closed = is_closed;
    }

    private VarcharJdbcType is_closed;

    public VarcharJdbcType getUrl() {
        return url;
    }

    public void setUrl(VarcharJdbcType url) {
        this.url = url;
    }

    private VarcharJdbcType url;

    public int getReview_count() {
        return review_count;
    }

    public void setReview_count(int review_count) {
        this.review_count = review_count;
    }

    private int review_count;

    public VarcharJdbcType getCategories0alias() {
        return categories0alias;
    }

    public void setCategories0alias(VarcharJdbcType categories0alias) {
        this.categories0alias = categories0alias;
    }

    private VarcharJdbcType categories0alias;

    public VarcharJdbcType getCategories0title() {
        return categories0title;
    }

    public void setCategories0title(VarcharJdbcType categories0title) {
        this.categories0title = categories0title;
    }

    private VarcharJdbcType categories0title;

    public VarcharJdbcType getCategories1alias() {
        return categories1alias;
    }

    public void setCategories1alias(VarcharJdbcType categories1alias) {
        this.categories1alias = categories1alias;
    }

    private VarcharJdbcType categories1alias;

    public VarcharJdbcType getCategories1title() {
        return categories1title;
    }

    public void setCategories1title(VarcharJdbcType categories1title) {
        this.categories1title = categories1title;
    }

    private VarcharJdbcType categories1title;

    public VarcharJdbcType getCategories2alias() {
        return categories2alias;
    }

    public void setCategories2alias(VarcharJdbcType categories2alias) {
        this.categories2alias = categories2alias;
    }

    private VarcharJdbcType categories2alias;

    public VarcharJdbcType getCategories2title() {
        return categories2title;
    }

    public void setCategories2title(VarcharJdbcType categories2title) {
        this.categories2title = categories2title;
    }

    private VarcharJdbcType categories2title;

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    private Float rating;

    public Float getCoordinateslatitude() {
        return coordinateslatitude;
    }

    public void setCoordinateslatitude(Float coordinateslatitude) {
        this.coordinateslatitude = coordinateslatitude;
    }

    public Float getCoordinateslongitude() {
        return coordinateslongitude;
    }

    public void setCoordinateslongitude(Float coordinateslongitude) {
        this.coordinateslongitude = coordinateslongitude;
    }

    public VarcharJdbcType getTransactions0() {
        return transactions0;
    }

    public void setTransactions0(VarcharJdbcType transactions0) {
        this.transactions0 = transactions0;
    }

    public VarcharJdbcType getPrice() {
        return price;
    }

    public void setPrice(VarcharJdbcType price) {
        this.price = price;
    }

    public VarcharJdbcType getLocationaddress1() {
        return locationaddress1;
    }

    public void setLocationaddress1(VarcharJdbcType locationaddress1) {
        this.locationaddress1 = locationaddress1;
    }

    public VarcharJdbcType getLocationaddress2() {
        return locationaddress2;
    }

    public void setLocationaddress2(VarcharJdbcType locationaddress2) {
        this.locationaddress2 = locationaddress2;
    }

    public VarcharJdbcType getLocationaddress3() {
        return locationaddress3;
    }

    public void setLocationaddress3(VarcharJdbcType locationaddress3) {
        this.locationaddress3 = locationaddress3;
    }

    public VarcharJdbcType getLocationcity() {
        return locationcity;
    }

    public void setLocationcity(VarcharJdbcType locationcity) {
        this.locationcity = locationcity;
    }

    public int getLocationzip_code() {
        return locationzip_code;
    }

    public void setLocationzip_code(int locationzip_code) {
        this.locationzip_code = locationzip_code;
    }

    public VarcharJdbcType getLocationcountry() {
        return locationcountry;
    }

    public void setLocationcountry(VarcharJdbcType locationcountry) {
        this.locationcountry = locationcountry;
    }

    private Float coordinateslatitude;

    private Float coordinateslongitude;

    private VarcharJdbcType transactions0;

    private VarcharJdbcType price;

    private VarcharJdbcType locationaddress1;

    private VarcharJdbcType locationaddress2;

    private VarcharJdbcType locationaddress3;

    private VarcharJdbcType locationcity;

    private int locationzip_code;

    private VarcharJdbcType locationcountry;

    public VarcharJdbcType getLocationstate() {
        return locationstate;
    }

    public void setLocationstate(VarcharJdbcType locationstate) {
        this.locationstate = locationstate;
    }

    private VarcharJdbcType locationstate;

    public VarcharJdbcType getLocationdisplay_address0() {
        return locationdisplay_address0;
    }

    public void setLocationdisplay_address0(VarcharJdbcType locationdisplay_address0) {
        this.locationdisplay_address0 = locationdisplay_address0;
    }

    private VarcharJdbcType locationdisplay_address0;

    public VarcharJdbcType getLocationdisplay_address1() {
        return locationdisplay_address1;
    }

    public void setLocationdisplay_address1(VarcharJdbcType locationdisplay_address1) {
        this.locationdisplay_address1 = locationdisplay_address1;
    }

    private VarcharJdbcType locationdisplay_address1;

    public VarcharJdbcType getLocationdisplay_address2() {
        return locationdisplay_address2;
    }

    public void setLocationdisplay_address2(VarcharJdbcType locationdisplay_address2) {
        this.locationdisplay_address2 = locationdisplay_address2;
    }

    private VarcharJdbcType locationdisplay_address2;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    private int phone;

    public VarcharJdbcType getDisplay_phone() {
        return display_phone;
    }

    public void setDisplay_phone(VarcharJdbcType display_phone) {
        this.display_phone = display_phone;
    }

    private VarcharJdbcType display_phone;

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    private Float distance;

    public VarcharJdbcType getTransactions1() {
        return transactions1;
    }

    public void setTransactions1(VarcharJdbcType transactions1) {
        this.transactions1 = transactions1;
    }

    private VarcharJdbcType transactions1;

    public VarcharJdbcType getTransactions2() {
        return transactions2;
    }

    public void setTransactions2(VarcharJdbcType transactions2) {
        this.transactions2 = transactions2;
    }

    private VarcharJdbcType transactions2;

    public Item(VarcharJdbcType id , VarcharJdbcType alias , VarcharJdbcType name , VarcharJdbcType image_url , VarcharJdbcType is_closed , VarcharJdbcType url , int review_count , VarcharJdbcType categories0alias , VarcharJdbcType categories0title , VarcharJdbcType categories1alias , VarcharJdbcType categories1title , VarcharJdbcType categories2alias , VarcharJdbcType categories2title , Float rating , Float coordinateslatitude , Float coordinateslongitude , VarcharJdbcType transactions0 , VarcharJdbcType price
     , VarcharJdbcType locationaddress1 , VarcharJdbcType locationaddress2 , VarcharJdbcType locationaddress3 , VarcharJdbcType locationcity , int locationzip_code , VarcharJdbcType locationcountry , VarcharJdbcType locationstate , VarcharJdbcType locationdisplay_address0 , VarcharJdbcType locationdisplay_address1 , VarcharJdbcType locationdisplay_address2 , int phone , VarcharJdbcType display_phone , Float distance , VarcharJdbcType transactions1 , VarcharJdbcType transactions2) {
        this.id = id;
        this.alias = alias;
        this.name = name;
        this.image_url = image_url;
        this.is_closed = is_closed;
        this.url = url;
        this.review_count = review_count;
        this.categories0alias = categories0alias;
        this.categories0title = categories0title;
        this.categories1alias = categories1alias;
        this.categories1title = categories1title;
        this.categories2alias = categories2alias;
        this.categories2title = categories2title;
        this.rating = rating;
        this.coordinateslatitude = coordinateslatitude;
        this.coordinateslongitude = coordinateslongitude;
        this.transactions0 = transactions0;
        this.price = price;
        this.locationaddress1 = locationaddress1;
        this.locationaddress2 = locationaddress2;
        this.locationaddress3 = locationaddress3;
        this.locationcity = locationcity;
        this.locationzip_code = locationzip_code;
        this.locationcountry = locationcountry;
        this.locationstate = locationstate;
        this.locationdisplay_address0 = locationdisplay_address0;
        this.locationdisplay_address1 = locationdisplay_address1;
        this.locationdisplay_address2 = locationdisplay_address2;
        this.phone = phone;
        this.display_phone = display_phone;
        this.distance = distance;
        this.transactions1 = transactions1;
        this.transactions2 = transactions2;

    }

    public Item( VarcharJdbcType alias , VarcharJdbcType name , VarcharJdbcType image_url , VarcharJdbcType is_closed , VarcharJdbcType url , int review_count , VarcharJdbcType categories0alias , VarcharJdbcType categories0title , VarcharJdbcType categories1alias , VarcharJdbcType categories1title , VarcharJdbcType categories2alias , VarcharJdbcType categories2title , Float rating , Float coordinateslatitude , Float coordinateslongitude , VarcharJdbcType transactions0 , VarcharJdbcType price
            , VarcharJdbcType locationaddress1 , VarcharJdbcType locationaddress2 , VarcharJdbcType locationaddress3 , VarcharJdbcType locationcity , int locationzip_code , VarcharJdbcType locationcountry , VarcharJdbcType locationstate , VarcharJdbcType locationdisplay_address0 , VarcharJdbcType locationdisplay_address1 , VarcharJdbcType locationdisplay_address2 , int phone , VarcharJdbcType display_phone , Float distance , VarcharJdbcType transactions1 , VarcharJdbcType transactions2) {

        this.alias = alias;
        this.name = name;
        this.image_url = image_url;
        this.is_closed = is_closed;
        this.url = url;
        this.review_count = review_count;
        this.categories0alias = categories0alias;
        this.categories0title = categories0title;
        this.categories1alias = categories1alias;
        this.categories1title = categories1title;
        this.categories2alias = categories2alias;
        this.categories2title = categories2title;
        this.rating = rating;
        this.coordinateslatitude = coordinateslatitude;
        this.coordinateslongitude = coordinateslongitude;
        this.transactions0 = transactions0;
        this.price = price;
        this.locationaddress1 = locationaddress1;
        this.locationaddress2 = locationaddress2;
        this.locationaddress3 = locationaddress3;
        this.locationcity = locationcity;
        this.locationzip_code = locationzip_code;
        this.locationcountry = locationcountry;
        this.locationstate = locationstate;
        this.locationdisplay_address0 = locationdisplay_address0;
        this.locationdisplay_address1 = locationdisplay_address1;
        this.locationdisplay_address2 = locationdisplay_address2;
        this.phone = phone;
        this.display_phone = display_phone;
        this.distance = distance;
        this.transactions1 = transactions1;
        this.transactions2 = transactions2;

    }





}
