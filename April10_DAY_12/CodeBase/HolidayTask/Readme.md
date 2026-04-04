# 🎵 Music Player System (Spotify-Inspired OOP Project)

A modular, object-oriented **Music Player System** built in Java, inspired by platforms like Spotify.
This project demonstrates strong **OOP principles**, clean **package architecture**, and scalable design.

---

## 🚀 Overview

This application simulates a simplified music streaming system where users can:

* 🎶 Play songs (local & online)
* 📂 Create and manage playlists
* 🔀 Shuffle songs
* 🎧 Switch between different playback modes

The system is designed using **real-world software architecture practices**, making it ideal for academic evaluation and interviews.

---

## 🧠 Key OOP Concepts Used

### 🔒 Encapsulation

* All data members are private
* Controlled access via getters/setters
* Validation included in constructors

### 🧬 Inheritance

* `AudioPlayer` → base abstract class
* `LocalPlayer`, `OnlinePlayer` → derived classes

### 🔁 Polymorphism

* Same method (`play()`) behaves differently:

  * Local playback
  * Online streaming

### 🎭 Abstraction

* `AudioPlayer` hides playback implementation details

---

## 📦 Project Structure

```
com.musicplayer
│
├── model        → Core entities (Song, Playlist, User)
├── player       → Playback logic (AudioPlayer, LocalPlayer, OnlinePlayer)
├── service      → Business logic (PlaylistService, PlayerService)
├── util         → Utility helpers (Shuffle)
├── exception    → Custom exceptions
├── main         → Application entry point
```

---

## 🧩 Core Components

### 🎶 Song

Represents a music track with:

* Title
* Artist
* Duration

---

### 📂 Playlist

* Stores multiple songs
* Supports adding & retrieving songs
* Can be shuffled

---

### 👤 User

* Manages multiple playlists
* Represents a system user

---

### 🎧 AudioPlayer (Abstract)

Defines core playback operations:

* Play
* Pause
* Stop

---

### 💻 LocalPlayer & 🌐 OnlinePlayer

* Implement playback differently
* Demonstrate polymorphism

---

### 🎛️ Services Layer

Handles business logic:

* **PlayerService**

  * Controls playback
  * Interacts with `AudioPlayer`

* **PlaylistService**

  * Adds songs
  * Displays playlists
  * Shuffle functionality

---

### 🔀 Utility Layer

* `ShuffleUtil` → Randomizes playlist order

---

### ⚠️ Exception Handling

* Custom exception: `SongNotFoundException`
* Input validation included

---

## ✨ Features

* 🎶 Song playback (Local + Streaming simulation)
* 📂 Playlist creation & management
* 🔀 Shuffle functionality
* 🔄 Switch playback modes dynamically
* ⚠️ Input validation & error handling
* 🧱 Clean layered architecture

---

## 🧪 Sample Output

```
Before Shuffle:
Song1
Song2

After Shuffle:
Song2
Song1

Playing local: Song1
Streaming: Song2
```

---

## ⚙️ How to Run

1. Clone the repository
2. Open in any Java IDE (IntelliJ / Eclipse / VS Code)
3. Navigate to:

```
com.musicplayer.main.Main
```

4. Run the `Main` class

---

## 📈 Future Enhancements

* 🎨 GUI (Java Swing / JavaFX)
* 💾 File-based song loading
* 🔍 Search songs feature
* ❤️ Like/Favorite songs
* 📡 Real API integration (streaming simulation)
* 🔊 Volume & playback controls

---

## 👩‍💻 Author

**Edlyn Jessica Philip**

---

## ⭐ Final Note

This project is a foundational step toward building real-world systems like Spotify, focusing on strong design principles rather than UI.

> “Good design is the backbone of scalable software.” 🚀
