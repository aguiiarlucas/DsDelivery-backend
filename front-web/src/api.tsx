import axios from "axios";

const API_URL = 'http://localhost:8080';

export function fetchProducts(){
    return axios(`${API_URL}/products`) /* CONCATENANDO UMA VARIAVEL COM STRING NO JS*/
}