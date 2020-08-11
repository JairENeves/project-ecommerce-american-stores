import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpRequest } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  productUrl = 'http://desktop-kln20ks:9003/product/findAll'

  constructor( private http: HttpClient) { }

  list(){        
    const headers = new HttpHeaders({'Content-Type': 'application/json; charset=UTF-8',
    'Access-Control-Allow-Origin': 'http://desktop-kln20ks:4200',
    'Access-Control-Allow-Credentials': 'true',
    'Authorization': 'Bearer 8c59e088-363b-4a2b-9b20-429a4bb0ee42'
    });
    
    return this.http.get<any[]>(`${this.productUrl}`,{ headers: headers });
  }

}
