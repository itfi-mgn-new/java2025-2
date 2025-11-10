package lesson16;

import javax.sound.midi.Instrument;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;

public class MIDISynthesizerExample {

	public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
		// TODO Auto-generated method stub
		try(final Synthesizer 	synthesizer = MidiSystem.getSynthesizer()) {
			
			synthesizer.open();
			synthesizer.loadAllInstruments(synthesizer.getDefaultSoundbank());
			
			final MidiChannel[]	midiChannels = synthesizer.getChannels();
			final Instrument[] instruments = synthesizer.getAvailableInstruments();
			
			midiChannels[0].programChange(35);
			
			final Receiver 		receiver = synthesizer.getReceiver();
			final ShortMessage 	noteOn = new ShortMessage();
		    
			noteOn.setMessage(ShortMessage.NOTE_ON, 0, 60, 93);
		    receiver.send(noteOn, -1);
			
		    Thread.sleep(5000);

			final ShortMessage 	noteOff = new ShortMessage();
		    
			noteOn.setMessage(ShortMessage.NOTE_OFF, 0, 60, 0);
		    receiver.send(noteOn, -1);
		    Thread.sleep(1000);
		}
	}

}