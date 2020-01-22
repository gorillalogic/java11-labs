package com.gorillalogic.java.starter.demos.session2;

public class Interfaces {}

class AudioTapeMedia implements MediaControl {

    @Override
    public void play() {
        System.out.println("Start playing from: " + INITIAL_MEDIA_TIME);
    }

    @Override
    public void stop() {
        System.out.println("Media stopped!");
    }

    @Override
    public void pause() {
        System.out.println("Media paused!");
    }

    @Override
    public void record() {
        System.out.println("Start recording!");
    }

    @Override
    public void eject() {
        System.out.println("Media ejected!");
    }
}
class CameraMedia extends AbstractVideoMediaControl {

    @Override
    void zoomIn() { System.out.println("Zoom in to: " + ++zoomLevel); }

    @Override
    void zoomOut() { System.out.println("Zoom out to: " + --zoomLevel); }

    @Override
    public void play() {
        System.out.println("Start playing from: " + INITIAL_MEDIA_TIME);
    }

    @Override
    public void stop() {
        System.out.println("Media stopped!");
    }

    @Override
    public void pause() {
        System.out.println("Media paused!");
    }

    @Override
    public void record() {
        System.out.println("Start recording!");
    }

    @Override
    public void eject() { System.out.println("Media ejected!"); }
}

interface MediaControl {

    int INITIAL_MEDIA_TIME = 0; // Literal definition, will be taken as "final" and "static"

    void play();
    void stop();
    void pause();
    void record();
    void eject();
}

abstract class AbstractVideoMediaControl implements MediaControl{

    int zoomLevel;

    abstract void zoomIn();
    abstract void zoomOut();

    public void setDefaultZoom() {
        zoomLevel = 3;
    }

}

