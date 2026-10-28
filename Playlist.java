
package musicengine;

import java.util.ArrayList; // Importing built-in ArrayList tool

public class Playlist {

    private String playlistName;
    private ArrayList<Track> trackList; // Uses Track.java automatically!

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.trackList = new ArrayList<Track>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public ArrayList<Track> getTrackList() {
        return trackList;
    }

    public void addTrack(Track track) {
        trackList.add(track);
        System.out.println("Added: " + track.getTitle());
    }

    public void removeTrack(String title) {
        for (int i = 0; i < trackList.size(); i++) {
            if (trackList.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println("Removed: " + trackList.get(i).getTitle());
                trackList.remove(i);
                return;
            }
        }
        System.out.println("Track not found: " + title);
    }

    public int getTotalDuration() {
        int total = 0;
        for (int i = 0; i < trackList.size(); i++) {
            total += trackList.get(i).getDuration();
        }
        return total;
    }

    public void displayPlaylist() {
        System.out.println("--- Playlist: " + playlistName + " ---");
        if (trackList.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            for (int i = 0; i < trackList.size(); i++) {
                System.out.println((i + 1) + ". " + trackList.get(i).toString());
            }
            System.out.println("Total Duration: " + getTotalDuration() + " seconds");
        }
        System.out.println("---------------------------------");
    }
}