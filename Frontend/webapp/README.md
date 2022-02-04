## Frontend em React

Link do Notion:
https://mousy-pickle-a4e.notion.site/React-JS-c9400ee818d8475497f85ac1e91a5165

## Criar e explorar o primeiro projeto em React Js.

Neste turorial você ira renderizar o front end de uma pagina web simples com rotas. No final deste tutorial vc tera um aplicativo base para ser usado em outros projetos em [react](https://pt-br.reactjs.org/). Você aprenderá como:

- Criar um aplicativo web react js.
- Renderizar paginas html.
- Usar components do react.
- Instalar pacotes com npm.
- Usar rotas para a troca de paginas.
- Usar states do react.

## Pré Requisitos

Se necessário, para instalação basta clicar nos links abaixo e abrir o video para seguir o turorial.

- [VS Code](https://code.visualstudio.com/download)
    
    [https://www.youtube.com/watch?v=_R6YslWRUFk](https://www.youtube.com/watch?v=_R6YslWRUFk)
    
- [Node js](https://nodejs.org/en/) e npm. [ instalação ]
    
    [https://www.youtube.com/watch?v=_sEwOXCKw4c](https://www.youtube.com/watch?v=_sEwOXCKw4c)
    

## Criar um aplicativo React js.

Na pasta (diretorio) em que se guardará o aplicativo com um click direito do mouse, abra o terminal.


<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/202771d8-92d7-4855-9dac-4cc47ae009d7/Untitled.png" />

Crie um novo projeto react com o nome ***webapp***.

```jsx
npx create-react-app webapp
```

Entre na pasta pelo terminal.

```jsx
cd webapp
```

Abra o vscode.

```jsx
code .
```

Após esse procedimento pode fechar o terminal e o explorador de arquivos.

Com o vscode aberto podemos conferir a criação padrão da estrutura do aplicativo. E tmbm vamos abrir o **termial** do vscode.

<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6d4086f3-e019-4db5-80ce-31ec15680d8c/Untitled.png" />

E digitar o seguinte comando no terminal para dar start na aplicação.

```jsx
npm start
```

Se tudo ocorrer bem até aqui, irá abrir a seguinte pagina no seu navegador.

<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4c529b5e-b9bb-4e76-b078-2dd2ec5317eb/Untitled.png" />

## Limpando o projeto

Agora vamos limpar as nossas pastas para receber um novo projeto.

Na pasta ***public*** vamos deixar apenas o arquivo ***index.html*** e excluir todos os outros.

*Antes*

<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4e300046-6c0c-46ef-a4f8-7f8c81e37782/Untitled.png" />

Na pasta ***src*** deixamos apenas os arquivos ***App.js*** e ***index.js***.

*Antes*

<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/126ef156-9da0-40e4-ab6a-8ea36ca97a60/Untitled.png" />

Vamos substituir o codigo do arquivo ***App.js*** da pasta ***src*** para o codigo abaixo.

```jsx
function App() {
  return (
    <div>
      <h2>App</h2>
    </div>
  );
}

export default App;
```

E o arquivo ***index.js*** da pasta ***src*** para o codigo abaixo.

```jsx
import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

ReactDOM.render(
    <App />,
  document.getElementById('root')
);
```

Se vc chegou a está pagina então esta tudo ok.


<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7907c78c-1acc-46cb-8083-bce5945c84e3/Untitled.png" />


## Instalar o pacote de rotas

No ***terminal*** do vscode clicamos em **“Ctrl + C”** depois digitamos a letra **“s”** e **enter** para pararmos o servidor, e digitamos o seguinte comando para instalar o pacote [react-router-dom](https://github.com/remix-run/react-router/blob/main/docs/getting-started/installation.md) de acordo com a documentação.

```jsx
npm install react-router-dom@6
```

## Criando paginas (ou views)

Agora com o pacote de rotas instalado vamos criar algumas paginas para exemplificar.

Na pasta ***src*** clicamos com o direito do mouse e depois em ***Nova Pasta***.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/80214f4e-6852-4242-92bc-231f123ca6fb/Untitled.png)

Agora dentro da pasta ***views*** vamos criar nossas paginas ***home, produtos, lojas e contato***. 

Na pasta ***views*** clicamos com o direito do mouse e depois em ***Novo Arquivo***. 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7eb6fa6f-ebf0-47c3-91d6-c786d8d2359a/Untitled.png)

Para criarmos N***ovos Arquivos*** dentro da pasta ***views***.

chamado ***Home.jsx***.

```jsx
import React from "react";

export default function Home() {
    return (
        <>
            <h2>Home</h2>
        </>
    );
}
```

chamado ***Lojas.jsx***.

```jsx
import React from "react";

export default function Lojas() {
    return (
        <>
            <h2>Lojas</h2>
        </>
    );
}
```

A organização da pasta ***views*** ficara da seguinte forma:

## Criando Components

Também vamos criar dois ***Novos arquivos*** na pasta ***components***, um ***Menu.jsx*** e o ***Footer.jsx***.

***Menu.jsx***

```jsx
import React from "react";
import { Link } from "react-router-dom";

export default function Menu() {
    return (
        <nav>
            <Link to="/">home</Link><br/>
            <Link to="/Produtos">Produtos</Link><br/>
            <Link to="/Lojas">Lojas</Link><br/>
            <Link to="/Contato">Contato</Link>
        </nav>
    );
}
```

***Footer.jsx***

```jsx
import React from "react";

export default function Footer() {
    return (
        <>
            <h2>Footer</h2>
        </>
    );
}
```

A organização da pasta ***components*** ficará da seguinte forma:

## Criação das rotas

Primeiramente no arquivo ***App.js,*** importamos os metodos `import { BrowserRouter, Routes, Route } from "react-router-dom";`  , também importamos as páginas e components, e vamos alterar o conteudo do ***return*** da ***function App()***, acrescentando as tags `<BrowserRouter>`, `<Routes>` e `<Route path="" element={ } />`

```jsx
import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./views/Home";
import Produtos from "./views/Produtos";
import Lojas from "./views/Lojas";
import Contato from "./views/Contato";
import Menu from "./components/Menu";
import Footer from "./components/Footer";

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
```

Após essas configurações, sua página deve se parecer com esta imagem abaixo:

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3381ca49-12af-401f-9f37-5630b255ab3e/Untitled.png)