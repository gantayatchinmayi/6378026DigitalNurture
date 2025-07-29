import React from 'react';

function CourseDetails() {
  const courses = [
    { name: 'Angular', date: '4/5/2021' },
    { name: 'React', date: '6/3/20201' }
  ];

  return (
    <div className="section">
      <h2>Course Details</h2>
      {courses.map((c, i) => (
        <div key={i}>
          <p><strong>{c.name}</strong></p>
          <p>{c.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
