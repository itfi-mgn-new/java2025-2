package lesson16;

import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioClipExample {

	public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {
		try(final InputStream 		is = AudioClipExample.class.getResourceAsStream("audio.wav");
			final AudioInputStream 	audioStream = AudioSystem.getAudioInputStream(is)) {

			final AudioFormat 		audioFormat = audioStream.getFormat();
			final DataLine.Info 	info = new DataLine.Info(Clip.class, audioFormat);
			
			try(final Clip audioClip = (Clip) AudioSystem.getLine(info)) {

				audioClip.addLineListener(new SoundPlayerUsingClip());
				audioClip.open(audioStream);
				audioClip.start();
				Thread.sleep(10000);
			}
		}
	}

	
	public static class SoundPlayerUsingClip implements LineListener {
	    boolean isPlaybackCompleted;
	    
	    @Override
	    public void update(LineEvent event) {
	        if (LineEvent.Type.START == event.getType()) {
	            System.err.println("Playback started.");
	        } else if (LineEvent.Type.STOP == event.getType()) {
	            isPlaybackCompleted = true;
	            System.err.println("Playback completed.");
	        }
	    }
	}	
}