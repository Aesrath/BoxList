package sg.edu.rp.c346.boxlist;

/**
 * Created by 16003806 on 23/7/2018.
 */

public class ImagesList {

    private String whatColour;

    public ImagesList(String whatColour) {
        this.whatColour = whatColour;
    }

    public String getWhatColour() {
        return whatColour;
    }

    public void setWhatColour(String whatColour) {
        this.whatColour = whatColour;
    }

    @Override
    public String toString() {
        return "ImagesList{" +
                "whatColour='" + whatColour + '\'' +
                '}';
    }
}
