import { CalculateScore } from './Components/CalculateScore';


function App() {
    return (
        <div>
            <CalculateScore 
                Name="Chinmayi"
                School="ITER"
                total={284}
                goal={3}
            />
        </div>
    );
}

export default App;