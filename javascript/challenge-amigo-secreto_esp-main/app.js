// El principal objetivo de este desafío es fortalecer tus habilidades en lógica de programación. Aquí deberás desarrollar la lógica para resolver el problema.
let listaAmigos = [];

function limpiar() {
    let amigosAgregados = document.getElementById("listaAmigos");
    amigosAgregados.innerHTML = "";
}

function agregarAmigo() {
    let nombreIngresado = document.querySelector("#amigo");
    listaAmigos.push(nombreIngresado.value);
    console.log(nombreIngresado.value  );
    actualizarLista();
}

function actualizarLista() {
    let amigosAgregados = document.getElementById("listaAmigos");
    limpiar();
    for (let i = 0; i < listaAmigos.length; i++) {
        amigosAgregados.innerHTML += `<li>${listaAmigos[i]}</li>`;
    }
}

function sortearAmigo() {
    let escogerAmigo = Math.floor(Math.random() * listaAmigos.length) ;
    console.log(escogerAmigo);//prueba
    limpiar();
    document.getElementById("resultado");
}
