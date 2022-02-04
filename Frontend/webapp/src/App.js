import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./views/Home";
import Produtos from "./views/Produtos";
import Lojas from "./views/Lojas";
import Contato from "./views/Contato";
import Menu from "./components/Menu";
import Footer from "./components/Footer";

import "./assets/css/style.css";

function App() {
  return (
    <BrowserRouter>
      <Menu />
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/Produtos" element={<Produtos/>} />
        <Route path="/Lojas" element={<Lojas/>} />
        <Route path="/Contato" element={<Contato/>} />
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
