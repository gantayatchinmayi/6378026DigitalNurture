import React from 'react';
import Counter from './Counter';
import SayWelcome from './SayWelcome';
import SyntheticEvent from './SyntheticEvent';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  return (
    <div className="App">
      <h1>React Event Examples</h1>
      <Counter />
      <SayWelcome />
      <SyntheticEvent />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
