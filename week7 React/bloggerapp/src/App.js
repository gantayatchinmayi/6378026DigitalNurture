import React, { useState } from 'react';
import CourseDetails from './CourseDetails';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import './App.css';

function App() {
  const [active, setActive] = useState({
    showCourse: false,
    showBook: false,
    showBlog: false,
  });

  const toggleView = (section) => {
    setActive(prev => ({
      ...prev,
      [section]: !prev[section],
    }));
  };

  return (
    <div className="App">
      <h1>Blogger App</h1>

      <div className="buttons">
        <button onClick={() => toggleView('showCourse')}>Toggle Course</button>
        <button onClick={() => toggleView('showBook')}>Toggle Book</button>
        <button onClick={() => toggleView('showBlog')}>Toggle Blog</button>
      </div>

      <div className="columns">
        {active.showCourse && <CourseDetails />}
        {active.showBook && <BookDetails />}
        {active.showBlog && <BlogDetails />}
      </div>
    </div>
  );
}

export default App;
