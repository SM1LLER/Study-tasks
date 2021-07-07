package by.training.task03.view;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private final String RES_NAME = "property.loc.textUI";
    private ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(RES_NAME, Locale.getDefault());
    }
    public void changeResource(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(RES_NAME, locale);
    }
    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}
