## Core Entities & Relationships

* Song → represents a music track
* Playlist → collection of songs
* User → owns playlists
* MusicPlayer → controls playback
* AudioPlayer (Abstract) → defines playback behavior
* LocalPlayer / OnlinePlayer → implementations (polymorphism)
