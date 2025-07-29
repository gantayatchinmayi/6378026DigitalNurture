import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault(); // synthetic event again
    const euroValue = parseFloat(rupees) / 90;
    setEuros(euroValue.toFixed(2));
  };

  return (
    <div>
      <h3>Currency Convertor (INR ➜ EUR)</h3>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter amount in INR"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
        <button type="submit">Convert</button>
      </form>
      {euros && <p>Converted: €{euros}</p>}
    </div>
  );
}

export default CurrencyConvertor;
