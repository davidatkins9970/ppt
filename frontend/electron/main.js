const { app, BrowserWindow } = require('electron').remote ? require('electron') : require('electron');
const path = require('path');

let mainWindow;

function createWindow() {
  mainWindow = new BrowserWindow({
    width: 800,
    height: 600,
    webPreferences: {
      nodeIntegration: true,
      contextIsolation: false,
    },
  });

  // Load the Vue.js app from the built files or dev server
  if (process.env.NODE_ENV === 'development') {
    mainWindow.loadURL('http://localhost:8080');
  } else {
    // For production, load from Spring Boot server
    mainWindow.loadURL('http://localhost:8080');
  }

  mainWindow.on('closed', () => {
    mainWindow = null;
  });
}

app.on('ready', createWindow);

app.on('window-all-closed', () => {
  if (process.platform !== 'darwin') {
    app.quit();
  }
});

app.on('activate', () => {
  if (mainWindow === null) {
    createWindow();
  }
});