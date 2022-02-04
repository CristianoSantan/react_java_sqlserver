import React from "react";

export default function Lojas() {
    return (
        <main>
        <header>
            <h2>Nossas lojas</h2>
        </header>
        <section className="nossas_lojas">
            <div className="loja">
                <h3>Rio de Janeiro</h3>
                <p>Avenida Presidete Vargas, 5000</p>
                <p>10 &ordm; andar</p>
                <p>Centro</p>
                <p>(21) 3333-3333</p>
            </div>
            <div className="loja">
                <h3>São Paulo</h3>
                <p>Avenida Paulista, 985</p>
                <p>3 &ordm; andar</p>
                <p>Jardins</p>
                <p>(11) 4444-4444</p>
            </div>
            <div className="loja">
                <h3>Santa Catarina</h3>
                <p>Rua Major &Aacute;vila, 370</p>
                <p>Vila Mariana</p>
                <p>(47) 5555-5555</p>
            </div>
        </section>
    </main>
    );
}
