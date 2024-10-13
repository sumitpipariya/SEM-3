import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Layout from './Layout';
import GetAllFaculty from './pages/GetAllFaculty';
import DetailFaculty from './pages/DetailFaculty';
import AddFaculty from './pages/AddFaculty';
import EditFaculty from './pages/EditFaculty';
import DeleteFaculty from './pages/DeleteFaculty';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route index element={<GetAllFaculty />} />
        <Route path="/Faculty" element={<GetAllFaculty />} />
        <Route path="/Faculty/:id" element={<DetailFaculty />} />
        <Route path='/Faculty/add' element={<AddFaculty />} />
        <Route path='/Faculty/edit/:id' element={<EditFaculty/>} />
        <Route path='/Faculty/delete/:id' element={<DeleteFaculty />} />
      </Route>
    </Routes>  
  </BrowserRouter>
);
