
import { Link } from 'react-router-dom';
import './App.css';
import Aboutus from './componants/Aboutpage';
import Contact from './componants/Contactpage';
import Home from './componants/Homepage';
import ArrayDemo from './ArrayDemo';


function App(props) {
  return (
    <>
      <div className='container text-center'>
        <div className='row'>

          <div  className='col-1'>
              <Link to = {'/layout/home'} element={<Home/>} className="btn btn-outline-primary">Home</Link>
          </div>

          <div  className='col-1'>
              <Link to={'/layout/about'} element={<Aboutus/> } className="btn btn-outline-danger">ABOUT</Link>
          </div> 

          <div className='col-1'> 
              <Link to = {'/layout/contact'} element={<Contact />} className="btn btn-outline-warning">Contact</Link>
          </div> 

          <div className='col-1'> 
              <Link to = {'/layout/students'} element={<ArrayDemo />} className="btn btn-outline-warning">Students</Link>
          </div> 

        </div>
      </div>

      
    <div>{props.name}</div>
      

    </>
  );
}

export default App;
