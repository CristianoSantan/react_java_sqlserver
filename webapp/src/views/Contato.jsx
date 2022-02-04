import React from "react";

export default function Contato() {
    return (
        <main>
            <header>
                <h2>Contato</h2>
            </header>
            <section>
                <section id="contatos">
                    <div id="contato">
                        <img src="./img/email.png" style={{width: "90px"}} alt="" />
                        <p>contato@fullstackeletro.com</p>
                    </div>
                    <div id="contato">
                        <img src="./img/whatsapp.png" style={{width: "90px"}} alt="" />
                        <p>(11) 9999-9999</p>
                    </div>
                </section>

                <form  action="" id="form_contato">
                    <div className="form-group">
                        <label htmlFor="name">Nome:</label>
                        <input type="text" className="form-control" id="name" aria-describedby="emailHelp" placeholder="Nome" />
                    </div>
                    <div className="form-group">
                        <label htmlFor="msg">Mensagem:</label>
                        <textarea className="form-control" id="msg" cols="50" rows="2" />
                    </div>
                    <button type="submit" className="btn btn-primary">Enviar</button>
                </form>


            </section>
        </main>
    );
}
