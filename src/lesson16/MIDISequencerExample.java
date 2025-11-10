package lesson16;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Track;

public class MIDISequencerExample {
	private static final int[] NOTES = {60, 63, 67, 63, 60, 63, 67, 63, 60, 63, 67, 71, 72};

	public static void main(String[] args) throws InvalidMidiDataException, MidiUnavailableException, InterruptedException {
		// Create a new sequence with 24 ticks per quarter note
		final Sequence sequence = new Sequence(Sequence.PPQ, 48);
	    final Track 	track = sequence.createTrack();

	    for(int index = 0; index < NOTES.length; index++) {
		    insert(track, NOTES[index], 24*index);
	    }

	    
	    try(final Sequencer sequencer = MidiSystem.getSequencer()) {
	    	sequencer.setSequence(sequence);
	    	sequencer.open();
	    	sequencer.start();
	    	Thread.sleep(5000);
	    	sequencer.stop();
	    }
	}
	
	static void insert(final Track track, final int note, final int from) throws InvalidMidiDataException {
	    insert(track, 0, note, 100, from, 12);
	    insert(track, 9, 40, 127, from, 12);
	    insert(track, 9, 42, 127, from, 12);
	    insert(track, 9, 42, 127, from+12, 12);
	}

	static void insert(final Track track, final int channel, final int note, final int volume, final int from, final int length) throws InvalidMidiDataException {
	    final ShortMessage 	noteOn = new ShortMessage();
	    final ShortMessage 	noteOff = new ShortMessage();
	      
	    noteOn.setMessage(ShortMessage.NOTE_ON, channel, note, volume);
	    track.add(new MidiEvent(noteOn, from));
	      
	    noteOff.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
	    track.add(new MidiEvent(noteOff, from + length));
	}
}