import { Link, Outlet } from "react-router-dom";

function Layout(){
    return(
        <>

           <div className="row bg-body-secondary"> 
                <h1 className="text-center">Faculty Page</h1>
           </div>

           <div className="row">
                    <div className="col m-3">
                        <Outlet />
                    </div>
            </div>
           

        </>
    );
}

export default Layout;