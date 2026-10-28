// Free User Subclass

class FreeUser extends User {
    public FreeUser(String username) {
        super(username);
    }

    @Override
    public void playTrack(Track track) {
        System.out.println("\n[📺 ADVERTISEMENT] Upgrade to Premium to skip ads!");
        System.out.println("📻 Playing: " + track.getTitle() + " by " + track.getArtist());
    }
}

// Premium User Subclass

class PremiumUser extends User {
    public PremiumUser(String username) {
        super(username);
    }

    @Override
    public void playTrack(Track track) {
        System.out.println("\n✨ [PREMIUM AUDIO] Streaming in Ultra HD...");
        System.out.println("🎧 Playing: " + track.getTitle() + " by " + track.getArtist());
    }
}
