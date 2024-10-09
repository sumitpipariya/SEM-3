import { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";

function GetAllFaculty(){

    const [data, setData] = useState([])
    const navigate = useNavigate();
    

    useEffect(()=>{
        const apiUrl = "http://localhost:3001/Faculty";
        fetch(apiUrl).then(res=>res.json()).then(res=>setData(res));
    },[data]);            

    const foramtedFaculties = data.map((fac)=>{
         
        return(
            
                <div className="row border border-primary border-opacity-10 align-middle">
                    <div className="col-3" style={{marginBottom:5}} >{fac.Name}</div>
                    <div className="col-2" style={{marginBottom:5}} >{fac.Subject}</div>
                    <div className="col-2" style={{marginBottom:5}} >{fac.Department}</div>
                    <div className="col-2" style={{marginBottom:5}} ><Link className="btn align-middle btn-info col-7" to={"/Faculty/"+fac.id}>Detail</Link></div>
                    <div className="col-2" style={{marginBottom:5}} ><Link className="btn align-middle btn-warning col-7" to={"/Faculty/edit/"+fac.id}>Edit</Link></div>
                    <div className="col-1" style={{marginBottom:5}} ><Link className="btn align-middle btn-danger col-12" to={"/Faculty/delete/"+fac.id}>Delete</Link></div>
                </div>    

        );
    });

    return(
        <>

            <div className="table mt-4 table-borderless align-middle ">
                <div className="row  border-primary border-opacity-25 align-middle">
                    <div className="col-3 fw-bold mb-2" style={{marginBottom:"5"}}>NAME</div>
                    <div className="col-2 fw-bold mb-2" style={{marginBottom:"5"}}>SUBJECT</div>
                    <div className="col-2 fw-bold mb-2" style={{marginBottom:"5"}}>DEPARTMENT</div>   
                </div>
                
                    {foramtedFaculties}

            </div>

            <Link to="/Faculty/add" className="btn btn-primary col-2" >Add Faculty</Link>

        </>
    )
}

export default GetAllFaculty;