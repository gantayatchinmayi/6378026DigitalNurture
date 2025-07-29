import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 65 },
    { name: 'Dhoni', score: 90 },
    { name: 'KL Rahul', score: 55 },
    { name: 'Jadeja', score: 75 },
    { name: 'Bumrah', score: 60 },
    { name: 'Shami', score: 80 },
    { name: 'Surya', score: 50 },
    { name: 'Gill', score: 95 },
    { name: 'Iyer', score: 68 },
    { name: 'Pandya', score: 77 },
  ];

 
  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players (using map):</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with score below 70 (using arrow function):</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
