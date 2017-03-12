package com.example.android.miwok;

/**
 * Created by Paulina on 3/8/2017.
 */

public class Word {
    private String english;
    private String miwok;
    private int resourceId = NO_IMAGE_ID;
    private static final int NO_IMAGE_ID =-1;


    public Word(String englishWord, String miwokWord )
    {
        english = englishWord;
        miwok = miwokWord;

    }

    public Word(String englishWord, String miwokWord, int pictureId)
    {
        english = englishWord;
        miwok = miwokWord;
        resourceId = pictureId;

    }

    public String getEnglish()
    {
        return english;
    }

    public String getMiwok()
    {
        return miwok;
    }

    public int getPicture(){ return resourceId;}

    public boolean hasImage(){
        return resourceId != NO_IMAGE_ID;
    }


}
