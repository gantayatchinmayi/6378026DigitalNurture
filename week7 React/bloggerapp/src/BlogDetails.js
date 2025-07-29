import React from 'react';

function BlogDetails() {
  const blogs = [
    {
      title: 'React Learning',
      author: 'Stephen Biz',
      content: 'Welcome to learning React!'
    },
    {
      title: 'Installation',
      author: 'Schwezdenier',
      content: 'You can install React from npm.'
    }
  ];

  return (
    <div className="section">
      <h2>Blog Details</h2>
      {blogs.map((b, i) => (
        <div key={i}>
          <p><strong>{b.title}</strong></p>
          <p><em>{b.author}</em></p>
          <p>{b.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
