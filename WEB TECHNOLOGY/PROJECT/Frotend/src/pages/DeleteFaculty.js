import { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";

function DeleteFaculty(){
    const [data, setData] = useState({});
    const { id } = useParams();
    const navigate = useNavigate();


    return(<>

            <div>
                <h2>Are you Sure to Delete ? </h2>
            </div>

            <button onClick={()=>{
                const apiUrl = "http://localhost:3001/Faculty/"+id;
                fetch(apiUrl,{method:"DELETE"})
                .then(res=>res.json())
                .then(res=>{    
                    navigate("/Faculty");
                });

            }}
            class="btn btn-outline-danger col-1"  style={{marginTop:10}}>Yes</button>

            <button onClick={()=>{
                        navigate("/Faculty");
                    }}

                    class="btn btn-outline-primary col-1    "  style={{marginTop:10, marginLeft:30}}>No</button>
    </>);
}

export default DeleteFaculty;