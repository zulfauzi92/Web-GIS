package com.example.giskosandroid.data.models;

import java.util.List;

public class Kos {
    private int id;
    private String name;
    private String description;
    private String address;
    private double latitude;
    private double longitude;
    private String kos_type;
    private double distance;
    private String filename;
    private String owner_name;
    private List<KosGallery> gallery;
    private List<KosFacility> facility;
    private List<KosCategoryPrice> category_price;

    private Kos(
            int id,
            String name,
            String description,
            String address,
            double latitude,
            double longitude,
            String kos_type,
            double distance,
            String filename,
            String owner_name,
            List<KosGallery> gallery,
            List<KosFacility> facility,
            List<KosCategoryPrice> category_price
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.kos_type = kos_type;
        this.distance = distance;
        this.filename = filename;
        this.owner_name = owner_name;
        this.gallery = gallery;
        this.facility = facility;
        this.category_price = category_price;
    }

    public Kos(
            int id,
            String name,
            String description,
            String address,
            double latitude,
            double longitude,
            String kos_type,
            double distance,
            String owner_name,
            List<KosGallery> gallery,
            List<KosFacility> facility,
            List<KosCategoryPrice> category_price
    ) {
        this(
            id,
            name,
            description,
            address,
            latitude,
            longitude,
            kos_type,
            distance,
            null,
            owner_name,
            gallery,
            facility,
            category_price
        );
    }

    public Kos(
            int id,
            String name,
            String description,
            String address,
            double latitude,
            double longitude,
            String kos_type,
            double distance,
            String filename
    ) {
        this(
                id,
                name,
                description,
                address,
                latitude,
                longitude,
                kos_type,
                distance,
                filename,
                null,
                null,
                null,
                null
        );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getKos_type() {
        return kos_type;
    }

    public void setKos_type(String kos_type) {
        this.kos_type = kos_type;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public List<KosGallery> getGallery() {
        return gallery;
    }

    public void setGallery(List<KosGallery> gallery) {
        this.gallery = gallery;
    }

    public List<KosFacility> getFacility() {
        return facility;
    }

    public void setFacility(List<KosFacility> facility) {
        this.facility = facility;
    }

    public List<KosCategoryPrice> getCategory_price() {
        return category_price;
    }

    public void setCategory_price(List<KosCategoryPrice> category_price) {
        this.category_price = category_price;
    }
}
