import React, { useState } from 'react';
import './MatrixCalculator.css';

function MatrixCalculator() {
  const [rows, setRows] = useState('');
  const [cols, setCols] = useState('');
  const [matrix, setMatrix] = useState([]);
  const [showInput, setShowInput] = useState(false);
  const [showOutput, setShowOutput] = useState(false);
  const [error, setError] = useState('');

  // Generate matrix input fields
  const generateMatrixInput = () => {
    const r = parseInt(rows);
    const c = parseInt(cols);
    
    if (isNaN(r) || isNaN(c) || r <= 0 || c <= 0) {
      setError('Please enter valid positive numbers for rows and columns!');
      return;
    }
    
    if (r > 10 || c > 10) {
      setError('Maximum matrix size is 10x10 for better visibility!');
      return;
    }
    
    setError('');
    setShowInput(true);
    setShowOutput(false);
    
    // Create empty matrix
    const newMatrix = Array(r).fill().map(() => Array(c).fill(''));
    setMatrix(newMatrix);
  };

  // Handle matrix input changes
  const handleMatrixInput = (row, col, value) => {
    const newMatrix = [...matrix];
    newMatrix[row][col] = value;
    setMatrix(newMatrix);
  };

  // Display the matrix (like Java output)
  const displayMatrix = () => {
    // Validate all inputs
    for (let i = 0; i < rows; i++) {
      for (let j = 0; j < cols; j++) {
        if (matrix[i][j] === '' || isNaN(matrix[i][j])) {
          setError(`Please fill all matrix cells! Missing value at position (${i+1}, ${j+1})`);
          return;
        }
      }
    }
    
    setError('');
    setShowOutput(true);
  };

  // Reset everything
  const resetMatrix = () => {
    setRows('');
    setCols('');
    setMatrix([]);
    setShowInput(false);
    setShowOutput(false);
    setError('');
  };

  // Render matrix display (like Java output format)
  const renderMatrixOutput = () => {
    const numericMatrix = matrix.map(row => 
      row.map(val => parseFloat(val).toString())
    );
    
    return (
      <div className="matrix-output-container">
        <h3>📤 Matrix Output (Java Style):</h3>
        <div className="matrix-display">
          {numericMatrix.map((row, i) => (
            <div key={i} className="matrix-row">
              {row.map((value, j) => (
                <span key={j} className="matrix-cell">{value}</span>
              ))}
            </div>
          ))}
        </div>
        <div className="java-code-block">
          <p><strong>🔍 Java Code Equivalent:</strong></p>
          <pre className="code-block">
{`// Your Java code output:
for(int i = 0 ; i < ${rows}; i++){
    for(int j = 0; j < ${cols}; j++){
        System.out.print(matrix[${i}][${j}] + " ");
    }
    System.out.println();
}`}
          </pre>
        </div>
      </div>
    );
  };

  return (
    <div className="app-container">
      <header className="header">
        <h1>📊 Matrix Calculator</h1>
        <p>Replicating Java 2D Array Program | Input → Store → Display Matrix</p>
        <div className="java-badge">
          <span>🎯 Java Equivalent: </span>
          <code>import java.util.*; public class arrays4</code>
        </div>
      </header>

      <div className="main-content">
        {/* Step 1: Get Matrix Dimensions */}
        <div className="card">
          <h2>📐 Step 1: Define Matrix Size</h2>
          <div className="input-group">
            <label>Number of Rows:</label>
            <input 
              type="number" 
              value={rows}
              onChange={(e) => setRows(e.target.value)}
              placeholder="Enter rows (e.g., 3)"
              min="1"
              max="10"
            />
          </div>
          <div className="input-group">
            <label>Number of Columns:</label>
            <input 
              type="number" 
              value={cols}
              onChange={(e) => setCols(e.target.value)}
              placeholder="Enter columns (e.g., 3)"
              min="1"
              max="10"
            />
          </div>
          <button className="btn-primary" onClick={generateMatrixInput}>
            🚀 Create Matrix
          </button>
        </div>

        {/* Error Display */}
        {error && (
          <div className="error-message">
            ⚠️ {error}
          </div>
        )}

        {/* Step 2: Input Matrix Values */}
        {showInput && !showOutput && (
          <div className="card">
            <h2>✏️ Step 2: Enter Matrix Values</h2>
            <p className="instruction">
              Enter values for {rows}×{cols} matrix (like Java's nested loops)
            </p>
            <div className="matrix-input-container">
              {matrix.map((row, i) => (
                <div key={i} className="matrix-input-row">
                  {row.map((value, j) => (
                    <input
                      key={j}
                      type="number"
                      className="matrix-input-cell"
                      value={value}
                      onChange={(e) => handleMatrixInput(i, j, e.target.value)}
                      placeholder={`[${i+1}][${j+1}]`}
                      step="any"
                    />
                  ))}
                </div>
              ))}
            </div>
            <div className="button-group">
              <button className="btn-success" onClick={displayMatrix}>
                📥 Display Matrix (Like Java Output)
              </button>
              <button className="btn-secondary" onClick={resetMatrix}>
                🔄 Reset All
              </button>
            </div>
          </div>
        )}

        {/* Step 3: Display Output */}
        {showOutput && (
          <div className="card">
            {renderMatrixOutput()}
            <button className="btn-secondary" onClick={resetMatrix}>
              🔄 Create New Matrix
            </button>
          </div>
        )}

        {/* Java Code Reference */}
        <div className="card reference-card">
          <h3>📚 Original Java Code Reference</h3>
          <pre className="java-code">
{`import java.util.*;

public class arrays4 {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        //input
        for(int i =0; i<row; i++){
            for(int j = 0; j<col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i =0 ; i<row; i++){
            for(int j =0; j<col; j++){
                System.out.print(matrix[i][j] + " ") ;
            }
            System.out.println();
        }
    }
}`}
          </pre>
        </div>
      </div>
    </div>
  );
}

export default MatrixCalculator;