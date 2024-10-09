import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function EditFaculty(){
    const [data,setData] = useState([]);
    const navigate = useNavigate();
    const { id } = useParams();

    useEffect(()=>{
        const apiUrl = "http://localhost:3001/Faculty/"+id;
        fetch(apiUrl)
        .then(res=>res.json())
        .then(res=>setData(res))
    },[])

    return(<>
    <div class="form-group row"  style={{marginTop:7}}>
        <label for="text3" class="col-4 col-form-label">Enter NAME :</label> 
        <div class="col-6">
        <input value={data.Name} onChange={(e)=>{
            setData({...data,Name:e.target.value})
        }} type="text" class="form-control" />
        </div>
    </div>

    <div class="form-group row" style={{marginTop:7}}>
        <label for="text1" class="col-4 col-form-label">Enter Subject :</label> 
        <div class="col-6">
        <input value={data.Subject} onChange={(e)=>{
            setData({...data,Subject:e.target.value})
        }} type="text" class="form-control" />
        </div>
    </div>

    <div class="form-group row"  style={{marginTop:7}}>
        <label for="text2" class="col-4 col-form-label">Enter Department :</label> 
        <div class="col-6">
        <input value={data.Department} onChange={(e)=>{
            setData({...data,Department:e.target.value})
        }} type="text" class="form-control"/>
        </div>
    </div>

    <div class="form-group row" style={{marginTop:7}}>
        <label for="text4" class="col-4 col-form-label">Enter Degree :</label> 
        <div class="col-6">
        <input value={data.Degree} onChange={(e)=>{
            setData({...data,Degree:e.target.value})
        }} type="text" class="form-control" />
        </div>
    </div> 

    <div class="form-group row" style={{marginTop:7}}>
        <label for="text4" class="col-4 col-form-label">Enter Contact :</label> 
        <div class="col-6">
        <input value={data.Contact} onChange={(e)=>{
            setData({...data,Contact:e.target.value})
        }} type="text" class="form-control" />
        </div>
    </div>

    <div class="form-group row" style={{marginTop:7}}>
        <label for="text4" class="col-4 col-form-label">Enter Email :</label> 
        <div class="col-6">
        <input value={data.email} onChange={(e)=>{
            setData({...data, email:e.target.value})
        }} type="text" class="form-control" />
        </div>
    </div>

    <div class="form-group row"  style={{marginTop:7}}>
        <div class="offset-4 col-8">
        <button onClick={()=>{
            const apiUrl = "http://localhost:3001/Faculty/"+id;
            fetch(apiUrl,{
                method:"PUT",
                body:JSON.stringify(data),
                headers:{
                    "Content-Type":"application/json"
                }
            })
            .then(res=>res.json())
            .then(res=>{
                navigate("/Faculty")
            });

        }} class="btn btn-outline-warning mt-3 col-2">Conform</button>

            <button onClick={()=>{
                        navigate("/Faculty");
                    }}
                    class="btn btn-outline-primary mt-3 col-2"  style={{marginTop:10, marginLeft:30}}>Back</button>
        </div>
    </div>
    
    </>);
}

export default EditFaculty;