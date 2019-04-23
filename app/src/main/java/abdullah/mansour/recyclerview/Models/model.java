package abdullah.mansour.recyclerview.Models;

import android.widget.Toast;

public class model
{
    String name;
    int image;

    public model() {
    }

    public model(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
