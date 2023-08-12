import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './App.css';
import PhotoGallery from './components/photoGallery';

function App() {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/userController/getAllUsers')
      .then(response => {
        setPosts(response.data);
      })
      .catch(error => {
        console.error(error);
      });
  }, []);

  return (
    <div className="App">
       <header className="App-header">
        <h1>3CS Sample Task</h1>
      </header>
        <p className="user-photo">Users</p>
        <PhotoGallery photos={posts} />
    </div>
  );
}

export default App;
