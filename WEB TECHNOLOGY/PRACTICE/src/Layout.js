import React from "react";
import { Outlet } from "react-router-dom";
import App from "./App";

const Layout = () => {
    return(
        <>
            <h1><App/></h1>
            <Outlet/>
        </>
    );
}

export default Layout