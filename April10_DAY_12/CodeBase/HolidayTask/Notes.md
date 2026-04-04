## Core Entities & Relationships

* Song → represents a music track
* Playlist → collection of songs
* User → owns playlists
* MusicPlayer → controls playback
* AudioPlayer (Abstract) → defines playback behavior
* LocalPlayer / OnlinePlayer → implementations (polymorphism)

# 📦Package Structure
```
com.musicplayer
│
├── model        → Core entities (Song, Playlist, User)
├── player       → Playback logic (AudioPlayer, LocalPlayer, OnlinePlayer)
├── service      → Business logic (PlaylistService, PlayerService)
├── util         → Helpers (Shuffle, Validation)
├── exception    → Custom exceptions
├── main         → Entry point (Main class)
```
