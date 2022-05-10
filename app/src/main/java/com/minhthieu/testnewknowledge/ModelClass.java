package com.minhthieu.testnewknowledge;

import android.view.View;

public class ModelClass {
    private int profileImage;
    private String fullName;
    private String description;
    private View divider;

    public ModelClass(int profileImage, String fullName, String description, View divider) {
        this.profileImage = profileImage;
        this.fullName = fullName;
        this.description = description;
        this.divider = divider;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
