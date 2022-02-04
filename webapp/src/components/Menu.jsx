import React from "react";
import { Link } from "react-router-dom";

export default function Menu() {
    return (
        <nav className="menu">
            <Link to="/"><img src="./img/Full Stack logo.PNG" alt="logo loja" /></Link>
            <Link to="/Produtos">Produtos</Link>
            <Link to="/Lojas">Lojas</Link>
            <Link to="/Contato">Contato</Link>
        </nav>
    );
}
