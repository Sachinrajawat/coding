import os
import numpy as np
import pyaudio
import whisper

import PYTHON.whisper_transcribe as whisper_transcribe

# Load the Whisper model
model = whisper_transcribe.load_model("base")  # Choose from "base", "small", "medium", or "large"

# Audio parameters
FORMAT = pyaudio.paInt16
CHANNELS = 1
RATE = 16000
CHUNK = 1024

# Initialize PyAudio
audio = pyaudio.PyAudio()

# Function to convert audio to text
def audio_to_text(audio_data):
    # Convert the audio data to a numpy array
    audio_array = np.frombuffer(audio_data, np.int16).astype(np.float32) / 32768.0
    result = model.transcribe(audio_array, language="en")
    return result['text']

# Start capturing audio
stream = audio.open(format=FORMAT, channels=CHANNELS, rate=RATE, input=True, frames_per_buffer=CHUNK)
print("Listening...")

try:
    while True:
        data = stream.read(CHUNK)
        text = audio_to_text(data)

        if text.strip():
            print("You said:", text)

except KeyboardInterrupt:
    print("Stopping...")
except Exception as e:
    print("An error occurred:", str(e))
finally:
    stream.stop_stream()
    stream.close()
    audio.terminate()
