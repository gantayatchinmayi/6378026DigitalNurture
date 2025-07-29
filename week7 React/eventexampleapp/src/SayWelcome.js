import React from 'react';

function SayWelcome() {
  const showWelcome = (message) => {
    alert("Message: " + message);
  };

  return (
    <div>
      <button onClick={() => showWelcome("Welcome to the event handler demo!")}>
        Say Welcome
      </button>
    </div>
  );
}

export default SayWelcome;
