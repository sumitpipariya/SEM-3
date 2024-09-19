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
import Help from './componants/Help';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
 <>
  <BrowserRouter>
    <Routes>
      <Route path='/' element={<Layout/>}>
        <Route path='/layout/about' element={<Aboutus/>} />
        <Route path='/layout/contact' element={<Contact/>} />
        <Route path='/layout/students' element={<ArrayDemo/>} />
        <Route path='/layout/home' element={<Home/>} />
        <Route path='/layout/help' element={<Help />} />
      </Route>
    </Routes>
  </BrowserRouter>
 </>
);

reportWebVitals();
