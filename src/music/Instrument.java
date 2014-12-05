package music;

public interface Instrument {
    public static Instrument piano() {
        return new Piano();
    }
    
    public static Instrument instrumentFromName(String instrumentName) {
        if (instrumentName.equals("piano")) {
            return new Piano();
        } else {
            return null;
        }
    }
    
    public void playSoundElement(SoundElement soundElement);
    
    public String getInstrumentName();
}
