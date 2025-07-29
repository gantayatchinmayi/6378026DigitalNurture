import React from 'react';

function BookDetails() {
  const books = [
    { name: 'Master React', price: 670 },
    { name: 'Deep Dive into Angular 11', price: 800 },
    { name: 'Mongo Essentials', price: 450 },
  ];

  return (
    <div className="section">
      <h2>Book Details</h2>
      {books.map((b, i) => (
        <div key={i}>
          <p><strong>{b.name}</strong></p>
          <p>{b.price}</p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
