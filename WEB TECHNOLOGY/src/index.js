import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { useState, useEffect } from 'react';

const Temp = () => {
    const [count, setCount] = useState(0);
    useEffect(() => {
      console.log(count);
    },[count])
  
    return(
      <>
        <button onClick={()=> {
          setCount(count+1)
        }}>INCREMENT</button>
        <h1>{count}</h1>
      </>
    )
  
  }
  
  export default Temp
  

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
 <>
  <BrowserRouter>
    <Routes>
      <Route path='/' element={<Temp/>}></Route>
    </Routes>
  </BrowserRouter>
 </>
);

reportWebVitals();

