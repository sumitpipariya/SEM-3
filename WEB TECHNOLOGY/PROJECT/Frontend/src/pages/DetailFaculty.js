import { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";

function DetailFaculty(){
    const [data, setData] = useState({});
    const { id } = useParams();
    const navigate = useNavigate();

    useEffect(()=>{
        const apiUrl = "http://localhost:3001/Faculty/"+id;
        fetch(apiUrl, {method:"GET"})
        .then(res=>res.json())
        .then(res=>setData(res));
    },[]);

    return(
            <>
                <div className="row ">
                    <div className="row mb-1 mt-4">Name : {data.Name}</div>
                    <div className="row mb-1">Subject : {data.Subject}</div>
                    <div className="row mb-1">Department : {data.Department}</div>
                    <div className="row mb-1">Degree : {data.Degree}</div>
                    <div className="row mb-1">Contact : {data.Contact}</div>
                    <div className="row mb-1">Email : {data.email}</div> 
                </div>

                <Link className="btn btn-outline-info mt-4 col-1"  to="/Faculty">Back</Link>
            </>
    );

}

export default DetailFaculty;