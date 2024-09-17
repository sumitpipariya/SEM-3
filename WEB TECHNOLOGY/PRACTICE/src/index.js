import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Contact from './componants/Contactpage';
import { BrowserRouter, Routes, Route } from'react-router-dom';
import Aboutus from './componants/Aboutpage';
import Home from './componants/Homepage';
import Layout from './Layout.js';
import ArrayDemo from './ArrayDemo.jsx';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
 <>
  <BrowserRouter>
    <Routes>
      <Route path='/layout' element={<Layout/>}>
        <Route index element={<App/>} />
        <Route path='/layout/about' element={<Aboutus/>} />
        <Route path='/layout/contact' element={<Contact/>} />
        <Route path='/layout/students' element={<ArrayDemo/>} />
        <Route path='/layout/home' element={<Home/>} />

        
      </Route>
        <Route path="/" element={<App />} />
        <Route path="/home" element={<Home />} />  
        <Route path="/about" element={<Aboutus/>} />
        <Route path="/contact" element={<Contact />} />
        <Route path='/Students' element = {<ArrayDemo/>}/>
    </Routes>
  </BrowserRouter>
 </>
);

reportWebVitals();
