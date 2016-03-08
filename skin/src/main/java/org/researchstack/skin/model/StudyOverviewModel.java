package org.researchstack.skin.model;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class StudyOverviewModel
{

    @SerializedName("disease_name")
    private String diseaseName;

    @SerializedName("from_date")
    private Date fromDate;

    @SerializedName("to_date")
    private Date toDate;

    @SerializedName("logo_name")
    private String logoName;

    @SerializedName("questions")
    private List<Question> questions;

    public List<Question> getQuestions()
    {
        return questions;
    }

    /**
     * TODO Extend from {@link org.researchstack.skin.model.SectionModel.Section} class
     */
    public static class Question
    {
        @SerializedName("title")
        String title;

        @SerializedName("details")
        String details;

        @SerializedName("show_consent")
        String showConsent;

        @Deprecated //TODO Figure out purpose, not used.
        @SerializedName("icon_image")
        String iconImage;

        @Deprecated //TODO Figure out purpose, not used.
        @SerializedName("tint_color")
        String tintColor;

        @SerializedName("video_name")
        String videoName;

        public String getTitle()
        {
            return title;
        }

        public String getDetails()
        {
            return details;
        }

        public String getShowConsent()
        {
            return showConsent;
        }

        public String getIconImage()
        {
            return iconImage;
        }

        public String getTintColor()
        {
            return tintColor;
        }

        public String getVideoName()
        {
            return videoName;
        }

        public void setTitle(String title)
        {
            this.title = title;
        }

        public void setDetails(String details)
        {
            this.details = details;
        }
    }
}
