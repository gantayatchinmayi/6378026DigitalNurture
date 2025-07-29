import React from 'react';

const IndianPlayers = () => {
  const oddPlayers = ['Virat', 'Dhoni', 'Jadeja', 'Shami', 'Gill'];
  const evenPlayers = ['Rohit', 'KL Rahul', 'Bumrah', 'Surya', 'Iyer'];

  const [p1, p2, p3, p4, p5] = oddPlayers;
  const [q1, q2, q3, q4, q5] = evenPlayers;


  const T20players = ['Hardik', 'Surya', 'Gill'];
  const RanjiTrophy = ['Pujara', 'Rahane'];
  const allPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players (Destructuring):</h2>
      <ul>
        <li>{p1}</li>
        <li>{p2}</li>
        <li>{p3}</li>
        <li>{p4}</li>
        <li>{p5}</li>
      </ul>

      <h2>Even Team Players (Destructuring):</h2>
      <ul>
        <li>{q1}</li>
        <li>{q2}</li>
        <li>{q3}</li>
        <li>{q4}</li>
        <li>{q5}</li>
      </ul>

      <h2>Merged Players (ES6 spread):</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
