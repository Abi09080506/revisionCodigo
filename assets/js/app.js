const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;

const $n = document.querySelector('.name');// se aggregó una clase válida al agregar un .
const $b = document.querySelector('#blog');
const $l = document.querySelector('.location');
// Por el uso de un await, asumo que busca ejecutar una función asincrona; por lo que se hará un cambio en la estructura con la finalidad de que se cumpla el objetivo, es decir que indica la carga
async function displayUser(username) {
  $n.textContent = 'cargando...';
  try{
  const response = await fetch(`${usersEndpoint}/${username}`);
  const data=await response.json(); // convierte la respuesta en un objeto para manipular los datos como un objeto

  $n.textContent = `${data.name}`; //cambio de comillas para que tome la variable y no el texto como en cargando
  $b.textContent = `${data.blog}`;
  $l.textContent = `${data.location}`;
} catch (error) {
  handleError(error);
}
}
//
function handleError(err) {
  console.log('OH NO!');
  console.log(err); 
  n.textContent = 'Algo salió mal: ' + `${err}`; //cambio por comillas simples y agregar ;, también cambio de para que se agregué el mensaje y la variable
}

displayUser('stolinski').catch(handleError);