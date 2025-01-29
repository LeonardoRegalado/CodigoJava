// El principal objetivo de este desafío es fortalecer tus habilidades en lógica de programación. Aquí deberás desarrollar la lógica para resolver el problema.
let listaAmigos = [];

function limpiar() {
    document.getElementById("listaAmigos").innerHTML = "";
}

function agregarAmigo() {

    let nombreIngresado = document.querySelector("#amigo");
    if (nombreIngresado.value.trim() == "" ) alert("Por favor, inserte un nombre.");
    
    listaAmigos.push(nombreIngresado.value);
    console.log(nombreIngresado.value  );
    document.querySelector("#amigo").value = "";
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
    let numeroEscogido = Math.floor(Math.random() * listaAmigos.length) ;
    console.log(numeroEscogido);//prueba
    limpiar();
    document.getElementById("resultado").innerHTML = `El amigo secreto es: ${listaAmigos[numeroEscogido]}`;
    listaAmigos = [];
}
