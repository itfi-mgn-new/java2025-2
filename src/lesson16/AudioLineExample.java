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
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioLineExample {

	public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {
		try(final InputStream 		is = AudioClipExample.class.getResourceAsStream("audio.wav");
			final AudioInputStream 	audioStream = AudioSystem.getAudioInputStream(is)) {
	
			final AudioFormat 		audioFormat = audioStream.getFormat();
			final DataLine.Info 	info = new DataLine.Info(SourceDataLine.class, audioFormat);
			
			try(final SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info)) {
				final byte[] 	buffer = new byte[8192];
				int len;

				audioLine.open(audioFormat);
				audioLine.start();				
				while ((len = audioStream.read(buffer)) > 0) {
					audioLine.write(buffer, 0, len);
				}
				audioLine.drain();
			}
		}
	}

}