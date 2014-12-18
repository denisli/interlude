package music;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import org.jfugue.ChannelPressure;
import org.jfugue.Controller;
import org.jfugue.Instrument;
import org.jfugue.KeySignature;
import org.jfugue.Layer;
import org.jfugue.Measure;
import org.jfugue.MidiParser;
import org.jfugue.Note;
import org.jfugue.ParserListener;
import org.jfugue.PitchBend;
import org.jfugue.Player;
import org.jfugue.PolyphonicPressure;
import org.jfugue.Tempo;
import org.jfugue.Time;
import org.jfugue.Voice;

public class MidiParserThing {
    public static final int NOTE_ON = 0x90;
    public static final int NOTE_OFF = 0x80;
    public static final int CONTROLLER = 0xB0;
    public static final int PROGRAM_CHANGE = 0xC0;
    
    
    public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    
    public static Music parse(File file) {
        Map<Integer,Queue<NoteMessage>> programNumberToNoteMessage = new HashMap<Integer,>
        Map<Integer,List<Note>> programNumberToNote = new HashMap<Integer,List<Note>>();
        List<Voice> voices = new ArrayList<Voice>();
        
        Sequence sequence = MidiSystem.getSequence( file );
        int trackNumber = 0;
        for (Track track : sequence.getTracks()) {
            trackNumber++;
            for ( int i=0; i < track.size(); i++ ) {
                MidiEvent event = track.get(i);
                int programNumber = 1234; // dummy number for now that has no meaning.
                MidiMessage message = event.getMessage();
                if ( message instanceof ShortMessage ) {
                    ShortMessage sm = (ShortMessage) message;
                    
                    if ( sm.getCommand() == ShortMessage.NOTE_ON ) {
                        
                    } else if ( sm.getCommand() == ShortMessage.NOTE_OFF ) {
                        
                    } else if ( sm.getCommand() == ShortMessage.PROGRAM_CHANGE ) {
                        
                    } else {
                        continue; // just ignore the message if it doesn't relate to the note or instrument
                    }
                }
            }
        }
        
    }
    
    
    public static void main(String[] args) throws InvalidMidiDataException, IOException {


    }
}
