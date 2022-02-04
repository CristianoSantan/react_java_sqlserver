import React from "react";

export default class Produtos extends React.Component {

    constructor(props) {
        super(props);
        this.exibirCategoria = this.exibirCategoria.bind(this);
        this.exibirTodos = this.exibirTodos.bind(this);
    }


    // ------------------------- Exibir por categoria
    exibirCategoria(categoria) {
        let elementos = document.getElementsByClassName('card');

        for ( var i = 0; i < elementos.length; i++) {

            if(categoria === elementos[i].id){
                elementos[i].style = "";
            }
            else {
                elementos[i].style = "display:none";
            } 
        }
    }

    exibirTodos() {
        let elementos = document.getElementsByClassName('card');

        for( var i=0; i < elementos.length; i++ ){
                elementos[i].style = ""; 
        }
    }

    render () {
        return (
        <main>
        <header>
            <h2>Produtos</h2>
        </header>
        <section id="area_produtos">
            <section className="categorias">
                <h3>Categorias</h3><br />
                <ul>
                    <li onClick={() => this.exibirTodos()}>Todos(12)</li>
                    <li onClick={() => this.exibirCategoria('geladeira')}>Geladeiras (3)</li>
                    <li onClick={() => this.exibirCategoria('fogao')}>Fogões (2)</li>
                    <li onClick={() => this.exibirCategoria('microondas')}>Microondas (3)</li>
                    <li onClick={() => this.exibirCategoria('lavadora')}>Lavadora de roupas (2)</li>
                    <li onClick={() => this.exibirCategoria('lavaLoucas')}>Lava-louças (2)</li>
                </ul>
            </section>
            <section className="produtos">
                <div className="card" id="geladeira">
                    <img height="120" src="./img/Geladeira Frost Free Brastemp Side Inverse 540 litros.jpg" onclick="destaque(this)" alt="" />
                    <p>Geladeira Frost free Brastemp side Inverse 540L</p>
                    <p>R$ 6.389,00</p>
                    <p>R$ 5.019,00</p>
                </div>
                <div className="card" id="geladeira">
                    <img height="120" src="./img/Geladeira Frost Free Brastemp Branca 375 litros.jpg"  onclick="destaque(this)" alt="" />
                    <p>Geladeira Frost Free Brastemp Branca 375 litros</p>
                    <p>R$ 2.068,00</p>
                    <p>R$ 1.910,90</p>
                </div>
                <div className="card" id="geladeira">
                    <img height="120" src="./img/Geladeira Frost Free Consul Prata 340 litros.jpg"  onclick="destaque(this)" alt="" />
                    <p>Geladeira Frost Free Consul Prata 340 litros</p>
                    <p>R$ 2.199,00</p>
                    <p>R$ 2.069,00</p>
                </div>
                <div className="card" id="fogao">
                    <img height="120" src="./img/Fogão 4 Bocas Consul Inox com Mesa de Vidro.jpg"  onclick="destaque(this)" alt="" />
                    <p>Fogão 4 Bocas Consul Inox com Mesa de Vidro</p>
                    <p>R$ 1.200,00</p>
                    <p>R$ 1.129,00</p>
                </div>
                <div className="card" id="fogao">
                    <img height="120" src="./img/Fogão de Piso 4 Bocas Atlas Monaco com Acedimento Automático.jpeg"  onclick="destaque(this)" alt="" />
                    <p>Fogão de Piso 4 Bocas Atlas Monaco com Acedimento Automático</p>
                    <p>R$ 600,00</p>
                    <p>R$ 519,70</p>
                </div>
                <div className="card" id="microondas">
                    <img height="120" src="./img/Micro-ondas Consul 32 Litros Inox 220v.jpg"  onclick="destaque(this)" alt="" />
                    <p>Micro-ondas Consul 32 Litros Inox 220v</p>
                    <p>R$ 580,00</p>
                    <p>R$ 409,88</p>
                </div>
                <div className="card" id="microondas">
                    <img height="120" src="./img/Microondas 25L Espelhado Philco 220v.jpg"  onclick="destaque(this)" alt="" />
                    <p>Microondas 25L Espelhado Philco 220v</p>
                    <p>R$ 508,70</p>
                    <p>R$ 464,53</p>
                </div>
                <div className="card" id="microondas">
                    <img height="120" src="./img/Forno de Microondas Eletrolux 20L Branco.jpg"  onclick="destaque(this)" alt="" />
                    <p>Forno de Microondas Eletrolux 20L Branco</p>
                    <p>R$ 459,00</p>
                    <p>R$ 436,05</p>
                </div>
                <div className="card" id="lavaLoucas">
                    <img height="120" src="./img/Lava-Louças Electrolux Inox com 10 Serviços, 06 Programas de Lavagem e Painel Blue Touch.jpg" alt="" onclick="destaque(this)" />
                    <p>Lava-Louças Electrolux Inox com 10 Serviços, 06 Programas de Lavagem e Painel Blue Touch</p>
                    <p>R$ 3.500,00</p>
                    <p>R$ 2.799,00</p>
                </div>
                <div className="card" id="lavaLoucas">
                    <img height="120" src="./img/Lava Louça Compacta 8 Serviços Branca 127V Brastemp.jpg"  onclick="destaque(this)" alt="" />
                    <p>Lava Louça Compacta 8 Serviços Branca 127V Brastemp</p>
                    <p>R$ 1.070,50</p>
                    <p>R$ 1.730,61</p>
                </div>
                <div className="card" id="lavadora">
                    <img height="120" src="./img/Lavadora de Roupas Brastemp 11 kg com Turbo Performance Branca.jpg"  onclick="destaque(this)" alt="" />
                    <p>Lavadora de Roupas Brastemp 11 kg com Turbo Performance Branca</p>
                    <p>R$ 1.500,00</p>
                    <p>R$ 1.214,10</p>
                </div>
                <div className="card" id="lavadora">
                    <img height="120" src="./img/Lavadora de Roupas Philco Inverter 12KG.jpg" onclick="destaque(this)" alt="" />
                    <p>Lavadora de Roupas Philco Inverter 12KG</p>
                    <p>R$ 2.300,00</p>
                    <p>R$ 2.179,90</p>
                </div>
            </section>
        </section>
    </main>
    );
    }
}
