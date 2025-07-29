import React from 'react';

function SyntheticEvent() {
  const handleClick = (event) => {
    event.preventDefault(); // synthetic event used here
    alert("I was clicked");
  };

  return (
    <div>
      <button onClick={handleClick}>OnPress</button>
    </div>
  );
}

export default SyntheticEvent;
