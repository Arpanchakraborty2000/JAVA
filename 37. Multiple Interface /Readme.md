
# 📘 Multiple Interfaces in Java - Full Example

This example shows how a single class can implement multiple interfaces to provide rich behavior.

---

## ✅ Code Example:

```java
interface Camera {
    void takePhoto();
    void recordVideo();
}

interface MusicPlayer {
    void playMusic();
    void stopMusic();
}

interface GPS {
    void navigate();
}

// SmartPhone class implements all interfaces
class SmartPhone implements Camera, MusicPlayer, GPS {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with high resolution camera.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording 4K video.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing your favorite song.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping the music.");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to your destination using GPS.");
    }

    public void call() {
        System.out.println("Making a phone call...");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();

        // Use Camera features
        myPhone.takePhoto();
        myPhone.recordVideo();

        // Use MusicPlayer features
        myPhone.playMusic();
        myPhone.stopMusic();

        // Use GPS features
        myPhone.navigate();

        // Use Phone feature
        myPhone.call();
    }
}
```

---

## 📝 Output:

```
Taking photo with high resolution camera.
Recording 4K video.
Playing your favorite song.
Stopping the music.
Navigating to your destination using GPS.
Making a phone call...
```

---

## 📌 Highlights

- This example demonstrates how a single class (`SmartPhone`) can implement multiple interfaces (`Camera`, `MusicPlayer`, `GPS`).
- Promotes **modular design** and **loose coupling**.
- Makes it easy to **extend functionality** without changing existing code.
