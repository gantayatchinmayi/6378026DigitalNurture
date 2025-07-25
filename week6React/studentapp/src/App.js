import logo from './logo.svg';
import './App.css';
import { Home } from './components/Home';
import { About } from './components/About';
import { Contact } from './components/Contact';

function App() {
  return (
    <div className="container">
      <img src={logo} alt="Logo" />
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;
