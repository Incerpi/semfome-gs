# semfome-gs
Projeto de aplicativo que facilita a entrega de alimentos para os necessitados

<h1 align="center">Sem Fome</h1>

<h2 align="center">⚠ ATENÇÃO ⚠</h2>
<p align="justify">
A maioria dos endpoints são da API local (<code>localhost:8080</code>) criada para a entrega de <b>Digital Business Enablement</b>. Para facilitar a disponilização da API, neste diretório estará incluído um arquivo <code>.jar</code> que pode ser executado com o comando <code>java -jar semfome-1.0-SNAPSHOT.jar</code>.
</p>

<p align="justify">
Caso esteja usando o app em um celular conectado via USB no seu computador utilize o comando <code>adb reverse tcp:8080 tcp:8080</code> para que o endereço <code>localhost:8080</code> não precise ser alterado; caso queira testar a aplicação sem conectar o celular com um cabo USB mude <b>TODAS</b> as ocorrências do endereço <code>localhost:8080</code> para <code>--( seu IPv4 )--:8080</code> e certifique-se de que ambos, o celular e o computador estejam conectados na mesma rede.
</p>

<p align="justify">
Obs.: Durante a fase de desenvolvimento, o método em que o IPv4 é usado como endereço <b>NÃO FOI TESTADO</b>, pois o primeiro método funcionava perfeitamente e com uma boa constância, e segundo alguns comentários e observações de outros usuários nos fóruns e comunidades a abordagem de usar o IPv4 como endereço pode ser imprevisível e instável.
</p>

<h2 align="center">Endpoints 📖</h2>

- ```localhost:8080/api/empresas``` -> **POST e GET**
- ```localhost:8080/api/alimentos``` -> **POST e GET**
- ```https://viacep.com.br/ws/{cep}/json``` -> **GET**

<h2 align="center">Link do vídeo 📖</h2>

- ```https://youtu.be/rcLxMbxBhDY``` -> **VÍDEO**
