package video;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The VideoPlayer class simulates a video player that plays a list of shuffled videos
 * and continues until all videos have reached their end duration.
 */
public class VideoPlayerB {

    /**
     * The main method initializes video data, shuffles the video list, and plays the videos
     * until all videos reach their end duration.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Display time for each iteration in minutes
        int displayTime = 1;

        // List to store Video objects
        List<Video> videoList = new ArrayList<>();
        videoList.add(new Video("Video1", 3, 0));
        videoList.add(new Video("Video2", 6, 0));
        videoList.add(new Video("Video3", 9, 0));
        videoList.add(new Video("Video4", 12, 0));

        // Shuffle the video list for random playback order
        Collections.shuffle(videoList);

        // Continue playing videos until all videos reach their end duration
        while (videoList.get(0).duration > 0 || videoList.get(1).duration > 0 || videoList.get(2).duration > 0
                || videoList.get(3).duration > 0) {

            // Shuffle the video list for random playback order in each iteration
            Collections.shuffle(videoList);

            // Reduce the duration of each video and print the playback message
            for(int c = 0; c < videoList.size(); c++) {
                videoList.get(c).reduceDuration(displayTime);
                System.out.println(videoList.get(c).name + " reproduced for " + displayTime + " min");
            }
        }
    }
}
