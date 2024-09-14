//Introduccion a JS
function P1_ejercicio2() {
  const a = 10;
  const b = 20;
  const c = a + b;
  console.log(`La suma de a y b es: ${c}`);
}

function P1_ejercicio3() {
  const nombre = prompt('Ingresa tu nombre');
  console.log(`Hola ${nombre}`);
}

//Operadores logicos y condicionales

function P2_ejercicio1() {
  const a = 10;
  const b = 20;
  const c = a < b ? b : a;
  console.log(`El mayor de los dos numeros es ${c}`);
}

function P2_ejercicio2() {
  const a = prompt('Ingresa un numero y te dire si es par o impar');
  const b = b % 2 === 0 ? 'es par' : 'es impar';
  console.log(`El numero ${a} ${b}`);
}

//Operadores de asignacion y bucles

function P3_ejercicio1() {
  const a = 10;
  while (a > 0) {
    console.log(a);
    a--;
  }
}

function P3_ejercicio2() {
  let a = 0;
  while (a <= 100) {
    a = parseInt(prompt('Ingresa un numero mayor a 100'));
  }
  console.log(`Ingresaste un numero mayor a 100: ${a}`);
}

//Funciones de JavaScript
//P4_ejercicio1
function esPar(numero) {
  if (numero % 2 === 0) {
    return true;
  } else {
    return false;
  }
}

//P4_ejercicio2
function convertirCelsusAFarenheit(celsius) {
  const farenheit = celsius * 1.8 + 32;
  console.log(`${celsius}°C son ${farenheit}°F`);
}

//Objetos en JavaScript

//P5_ejercicio1
const persona = {
  nombre: 'Juan',
  edada: 25,
  ciudad: 'Bogota',
};

function setCiudadPersona(persona, nuevaCiudad) {
  persona.ciudad = nuevaCiudad;
  console.log(
    `Persona: ${persona.nombre}, Edad: ${persona.edada}, Ciudad: ${persona.ciudad}`
  );
}

//P5_ejercicio2
const libro = {
  titulo: 'El Principito',
  autor: 'Antoine de Saint-Exupéry',
  anio: 1943,
};

function antiguedadLibro(libro) {
  const antiguedad = new Date().getFullYear() - libro.anio;
  const result = false;
  if (antiguedad <= 10) result = true;
  console.log(`El libro ${libro.titulo} es antiguo: ${result}`);
}

//Arrays

//P6_ejercicio1
const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function multiplicarArray(numeros) {
  const resultado = numeros.map((num) => num * 2);
  console.log(
    `Numero originales: ${numeros}, Multiplicados por 2: ${resultado}`
  );
}

//P6_ejercicio2
const pares = [];

function filtrarPares() {
  for (let i = 1; i <= 20; i++) {
    if (i % 2 === 0) pares.push(i);
  }
  console.log(`Primeros 10 numeros pares del 1 al 20: ${pares}`);
}

//Introduccion al DOM

//P7_ejercicio1
document.getElementById('btn_color_azul').addEventListener('click', () => {
  const p = document.getElementsByTagName('p');
  for (let i = 0; i < p.length; i++) {
    p[i].style.color = 'blue';
  }
});

//P7_ejercicio2
document.getElementById('btn_mostrar_alerta').addEventListener('click', () => {
  const input = document.getElementById('input_mensaje');
  alert(input.value);
});

//Eventos en DOM

//P8_ejercicio1
const elemento = document.getElementsByClassName('elemento');

Array.from(elemento).forEach((item) => {
  item.addEventListener('click', () => {
    console.log(item.textContent);
  });
});

//P8_ejercicio2

const input = document.getElementById('input_texto_2');

const deshabilitar = document.getElementById('btn_deshabilitar');

const habilitar = document.getElementById('btn_habilitar');

deshabilitar.addEventListener('click', () => {
  input.readOnly = true;
});

habilitar.addEventListener('click', () => {
  input.readOnly = false;
});

//LocalStorage

//P9_ejercicio1
const inputCorreo = document.getElementById('input_correo');

const guardarCorreo = document.getElementById('btn_guardar_correo');

const correo = document.getElementById('correo');

guardarCorreo.addEventListener('click', () => {
  localStorage.setItem('email', inputCorreo.value);
  correo.textContent = localStorage.getItem('email');
});

const borrarCorreo = document.getElementById('btn_eliminar_correo');

borrarCorreo.addEventListener('click', () => {
  localStorage.removeItem('email');
  correo.textContent = '';
});
