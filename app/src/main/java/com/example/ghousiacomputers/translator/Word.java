package com.example.ghousiacomputers.translator;

public class Word {
    private static final int No_Image_Given = -1;
    private String EnglishTranslation;
    private String FrenchTranslation;
    private int AudioResource;
    private int ImageResourceId = No_Image_Given;

    public Word() {

    }

    public Word(String n, String m, int audioResource) {
        this.EnglishTranslation = n;
        this.FrenchTranslation = m;
        this.AudioResource = audioResource;
    }

    public Word(String n, String m, int image, int audioResource) {
        this.EnglishTranslation = n;
        this.FrenchTranslation = m;
        this.ImageResourceId = image;
        this.AudioResource = audioResource;
    }

    public int getAudioResource() {
        return AudioResource;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }


    public String getFrenchTranslation() {
        return FrenchTranslation;
    }


    public String getEnglishTranslation() {
        return EnglishTranslation;
    }

    public boolean hasImage() {
        return ImageResourceId != No_Image_Given;
    }

}
