import { useState } from "react";
import { useNavigate } from "react-router-dom";

function AddFaculty(){
    const [data,setData] = useState({});
    const navigate = useNavigate();
    return(<>
       
        <div className="row" >

        <div class="form-group row" style={{marginTop:7}}>
                <label for="text1" class="col-4 col-form-label" style={{textAlign:"right"}}>Enter the ID :</label> 
                <div class="col-6">
                <input onChange={(e)=>{
                    setData({...data,id:e.target.value})
                }} type="text" class="form-control" />
                </div>
            </div>

            <div class="form-group row" style={{marginTop:7}}>
                <label for="text2" class="col-4 col-form-label" style={{textAlign:"right"}}>Enter the Name :</label> 
                <div class="col-6">
                <input onChange={(e)=>{
                    setData({...data,Name:e.target.value})
                }} type="text" class="form-control" />
                </div>
            </div>

            <div class="form-group row" style={{marginTop:7}}>
                <label for="text3" class="col-4 col-form-label" style={{textAlign:"right"}}>Enter the Subject :</label> 
                <div class="col-6">
                <input onChange={(e)=>{
                    setData({...data,Subject:e.target.value})
                }} type="text" class="form-control" />
                </div>
            </div>

            <div class="form-group row"  style={{marginTop:7}}>
                <label for="text4" class="col-4 col-form-label" style={{textAlign:"right"}}>Enter the Department :</label> 
                <div class="col-6">
                <input onChange={(e)=>{
                    setData({...data,Department:e.target.value})
                }} type="text" class="form-control"/>
                </div>
            </div>

            <div class="form-group row"  style={{marginTop:7}}>
                <label for="text5" class="col-4 col-form-label" style={{textAlign:"right"}}>Enter the Degree :</label> 
                <div class="col-6">
                <input onChange={(e)=>{
                    setData({...data,Degree:e.target.value})
                }} type="text" class="form-control"/>
                </div>
            </div>

            <div class="form-group row" style={{marginTop:7}}>
                <label for="text4" class="col-4 col-form-label" style={{textAlign:"right"}} >Enter the Contact no :</label> 
                <div class="col-6">
                <input onChange={(e)=>{
                    setData({...data,Contact:e.target.value})
                }} type="text" class="form-control" />
                </div>
            </div>

            <div class="form-group row" style={{marginTop:7}}>
                <label for="text4" class="col-4 col-form-label" style={{textAlign:"right"}} >Enter the Email :</label> 
                <div class="col-7">
                <input onChange={(e)=>{
                    setData({...data, email:e.target.value})
                }} type="text" class="form-control" />
                </div>
            </div> 

            <div class="form-group row">
                <div class="offset-4 col-8">
                <button onClick={()=>{
                    const apiUrl = "http://localhost:3001/Faculty";
                    fetch(apiUrl,{
                        method:"POST",
                        body:JSON.stringify(data),
                        headers:{
                            "Content-Type":"application/json"
                        }
                    })
                    .then(res=>res.json())
                    .then(res=>{
                        navigate("/Faculty")
                    });
                }} 
                
                class="btn btn-outline-success col-2"  style={{marginTop:10}}>Add</button>

                    <button onClick={()=>{
                        navigate("/Faculty");
                    }}

                    class="btn btn-outline-primary col-2"  style={{marginTop:10, marginLeft:30}}>Back</button>

                </div>
            </div>
        </div>
        
    
    </>);
}

export default AddFaculty;
