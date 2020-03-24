package com.example.ghousiacomputers.translator;

public class Word {
    private static final int No_Image_Given = -1;
    private String englishtranslation;
    private String Frenchtranslation;
    private int AudioResource;
    private int ImageResourceId = No_Image_Given;

    public Word() {

    }

    public Word(String n, String m, int audioResource) {
        this.englishtranslation = n;
        this.Frenchtranslation = m;
        this.AudioResource = audioResource;
    }

    public Word(String n, String m, int image, int audioResource) {
        this.englishtranslation = n;
        this.Frenchtranslation = m;
        this.ImageResourceId = image;
        this.AudioResource = audioResource;
    }

    public int getAudioResource() {
        return AudioResource;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }


    public String getFrenchtranslation() {
        return Frenchtranslation;
    }


    public String getEnglishtranslation() {
        return englishtranslation;
    }

    public boolean hasImage() {
        return ImageResourceId != No_Image_Given;
    }

}
