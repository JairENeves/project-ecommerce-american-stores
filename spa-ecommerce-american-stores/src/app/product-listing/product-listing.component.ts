import { Component, OnInit, ɵɵresolveBody } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-listing',
  templateUrl: './product-listing.component.html',
  styleUrls: ['./product-listing.component.css']
})
export class ProductListingComponent implements OnInit {

  products: Array<any>;

  constructor(private productService: ProductService, private router: Router) { }

  ngOnInit(): void {
    // this.products = [
    //   {productId:19, description:'TV 4K', technicalSpecification:"TESTE", dimension:"200x200"},
    //   {productId:20, description:'TV 2K', technicalSpecification:"TESTE", dimension:"200x200"},
    //   {productId:21, description:'TV 4K', technicalSpecification:"TESTE", dimension:"200x200"},
    //   {productId:22, description:'TV 2K', technicalSpecification:"TESTE", dimension:"200x200"},
    //   {productId:23, description:'TV 2K', technicalSpecification:"TESTE", dimension:"200x200"},
      
    //   {productId:19, description:'TV 4K', technicalSpecification:"TESTE", dimension:"200x200"},
    //   {productId:20, description:'TV 2K', technicalSpecification:"TESTE", dimension:"200x200"},
    //   {productId:21, description:'TV 4K', technicalSpecification:"TESTE", dimension:"200x200"},
    //   {productId:22, description:'TV 2K', technicalSpecification:"TESTE", dimension:"200x200"},
    //   {productId:23, description:'TV 2K', technicalSpecification:"TESTE", dimension:"200x200"},
    // ]
    this.list();

  }

  list(){
    this.productService.list().subscribe((res => this.products = res));
    console.log(this.products); 
  }

  alternarComponent(id){
    this.router.navigate([`/productDetails`, id]);
  }

}
