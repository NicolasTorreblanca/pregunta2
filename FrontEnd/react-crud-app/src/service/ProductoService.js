import axios from 'axios';

export class ProductoService{
    baseUrl = "http://localhost:8090/api/v1/";

    getAll(){
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }


}