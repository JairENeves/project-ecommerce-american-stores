;import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  product = {
    product_id:1, 
    description:'Fogão Continental 5 Bocas Automático FC5CB com Mesa Compartimentada Bivolt – Branco',
    price:10.00,
    stock:10,
    technical_specification:"CorBranco Capacidade do forno (litros)91 Tensão/Voltagembivolt Consumo de EnergiaA (menos 25% de consumo) Garantia12 meses  Observações",
    dimension:"Altura96,30 CentimetrosLargura77,50 CentimetrosProfundidade59,20 CentimetrosPeso32,00 Quilos",
    characteristic:"testetetteeuewuuquuiiw",
    manufacturer_id:1
  };




  

  constructor(
    private productService: ProductService,
    private route: ActivatedRoute,
    private routerNavegacao: Router
  ) { }

  ngOnInit() {
    this.route.params.subscribe( parametros => {
      if (parametros['id']) {
        console.log(parametros);
      }
    });
  }

  returnListing(){
    this.routerNavegacao.navigate([`/productListing`]);
  }  

}
