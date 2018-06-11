package com.kaltura.playkit.plugins;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.kaltura.playkit.PKController;
import com.kaltura.playkit.PKEvent;
import com.kaltura.playkit.PKMediaConfig;
import com.kaltura.playkit.PKRequestParams;
import com.kaltura.playkit.Player;
import com.kaltura.playkit.player.PlayerView;
import com.kaltura.playkit.utils.Consts;


/**
 * Created by zivilan on 11/12/2016.
 */

public class MockPlayer implements Player {
    private boolean isPlaying = false;
    private int duration = 100;
    private long currentPosition = 0;

    @Override
    public Settings getSettings() {
        return new Settings() {

            @Override
            public Settings setContentRequestAdapter(PKRequestParams.Adapter contentRequestAdapter) {
                return this;
            }

            @Override
            public Settings setLicenseRequestAdapter(PKRequestParams.Adapter licenseRequestAdapter) {
                return this;
            }

            @Override
            public Settings setCea608CaptionsEnabled(boolean cea608CaptionsEnabled) {
                return this;
            }

            @Override
            public Settings useTextureView(boolean useTextureView) {
                return this;
            }

            @Override
            public Settings setAllowCrossProtocolRedirect(boolean crossProtocolRedirectEnabled) {
                return this;
            }

            @Override
            public Settings setSecureSurface(boolean isSurfaceSecured) {
                return this;
            }
        };
    }

    @Override
    public void prepare(@NonNull PKMediaConfig playerConfig) {

    }

    @Override
    public void prepareNext(@NonNull PKMediaConfig mediaConfig) {

    }

    @Override
    public void updatePluginConfig(@NonNull String pluginName, @Nullable Object pluginConfig) {

    }

    @Override
    public void skip() {

    }

    @Override
    public void onApplicationPaused() {

    }

    @Override
    public void onApplicationResumed() {

    }

    @Override
    public void onOrientationChanged() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void stop() {
        // stop player
    }

    @Override
    public void play() {
        isPlaying = true;
    }

    @Override
    public void pause() {
        isPlaying = true;
    }

    @Override
    public void replay() {

    }

    @Override
    public PlayerView getView() {
        return null;
    }

    @Override
    public long getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public long getDuration() {
        return duration;
    }

    @Override
    public long getBufferedPosition() {
        return 0;
    }

    @Override
    public void setVolume(float volume) {

    }

    @Override
    public boolean isPlaying() {
        return isPlaying;
    }

    @Override
    public void addEventListener(@NonNull PKEvent.Listener listener, Enum... events) {

    }

    @Override
    public void addStateChangeListener(@NonNull PKEvent.Listener listener) {

    }

    @Override
    public void changeTrack(String uniqueId) {

    }

    @Override
    public void seekTo(long position) {
        currentPosition = position;
    }

    @Override
    public String getSessionId() {
        return null;
    }

    @Override
    public boolean isLiveStream() {
        return false;
    }

    @Override
    public <T extends PKController> T getController(Class<T> type) {
        return null;
    }

    @Override
    public void setPlaybackRate(float rate) {

    }

    @Override
    public float getPlaybackRate() {
        return Consts.DEFAULT_PLAYBACK_RATE_SPEED;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }
}
