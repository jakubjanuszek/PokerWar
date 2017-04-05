package jancor.com.pokerwar.utils;

/**
 * Created by janco on 09.03.2017.
 */

public class ActivityConfigBuilder {
    protected ActivityConfig activityConfig = createConfig();

    public ActivityConfigBuilder(int contentId) {
        activityConfig.layoutId = contentId;
    }

    public ActivityConfig build() {
        return activityConfig;
    }

    protected ActivityConfig createConfig() {
        return new ActivityConfig();
    }

    public ActivityConfigBuilder setContentId(int contentId) {
        activityConfig.layoutId = contentId;
        return this;
    }
}

