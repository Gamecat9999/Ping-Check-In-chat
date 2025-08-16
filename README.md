# 🟢 PingCheckChat

A lightweight Minecraft plugin that displays a player's ping beside their name in chat.  
Color-coded, emoji-enhanced, and mythic-ready ⚡

## ✨ Features
- Real-time ping display in chat messages
- Color-coded thresholds (🟢🟡🔴)
- Configurable symbols and limits
- Lightweight and easy to install

## 💬 Example Output
[🟢 42ms] James: Just launched the new plugin! [🔴 312ms] MythicMage: Lagging a bit here...


---

## ⚙️ Configuration

Edit `config.yml` to customize thresholds and symbols:

```yaml
pingThresholds:
  good: 100
  moderate: 200

symbols:
  good: "🟢"
  moderate: "🟡"
  poor: "🔴"
🛠️ Installation & Build
Requirements
- PaperMC server (version 1.20.1+)
- Java 17+
- Maven
Steps
- Clone the repo:
git clone https://github.com/yourusername/PingCheckChat.git
cd PingCheckChat
- Build the plugin:
mvn clean package
- Copy the .jar from target/ into your server’s plugins/ folder
- Restart the server
